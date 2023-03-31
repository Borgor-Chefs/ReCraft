import os
import sys

FORMAT = """{
  "parent": "item/generated",
  "textures": {
    "layer0": "recraftedingots:item/%s"
  }
}"""

def find_items(path: str, mat: str) -> list[str]:
    items: list[str] = []
    item: str

    for item in os.scandir(path):
        if mat in item.name:
            items.append(item.name)

    return items


def gen_assets(mat: str) -> int:
    gen_count: int = 0

    item_names: list[str] = list(map(lambda x: x.split('.')[0], find_items('src/main/resources/assets/recraftedingots/textures/item', mat)))
    for item in item_names:
        with open(f'src/main/resources/assets/recraftedingots/models/item/{item}.json', 'w') as f:
            f.write(FORMAT % item)

        gen_count += 1

    return gen_count


def main():
    if len(sys.argv) != 2:
        print(f'Usage: {sys.argv[0]} <MATERIAL_NAME>')
        return

    print(f'Generated {gen_assets(sys.argv[1])} assets')


if __name__ == '__main__':
    main()
