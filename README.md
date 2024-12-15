## Schematic
The ESP32 is not enough to reliably drive 4 motors so I had to add 4 mosfets and 2 mosfet drivers. I supplied the 3.3V input voltage for the gyroscope and the microcontroller from a buck converter which is fixed internally.
![Rendered image of the PCB](https://github.com/SteveBrownJr/DIY_ESP32_Quadrocopter/blob/main/Schematic_and_PCB/PCB_3D_render%20by%20KiCAD.jpg?raw=true)
## The body of the drone
I have been able to 3D print the body of the drone so I designed my own STL in Solid Works. You can find the STL in the 3DPrintableParts folder. I used a Creality Ender 3 V2 3D printer for the purpose and Cura slicer with dynamic resolution. Material was normal pla. You can see the quick overview below:
```stl
solid Mesh
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 52.426407 32.426407 11.100025
      vertex 52.426407 34.176407 11.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 116.426407 34.176407 11.100025
      vertex 116.426407 32.426407 11.100025
      vertex 52.426407 34.176407 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 52.426407 11.100025
      vertex 134.676392 66.426407 11.100025
      vertex 136.426407 66.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 136.426407 52.426407 11.100025
      vertex 134.676392 52.426407 11.100025
      vertex 136.426407 66.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 154.183990 16.586025 11.100025
      vertex 153.778534 16.461857 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 155.836197 16.374451 11.100025
      vertex 155.442749 16.532551 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 137.639618 11.213205 11.100025
      vertex 152.528137 15.361372 11.100025
      vertex 152.353485 14.974985 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.246643 14.564637 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 152.353485 14.974985 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.210678 14.142134 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 152.246643 14.564637 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 155.442749 16.532551 11.100025
      vertex 155.028229 16.621883 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 154.604584 16.639881 11.100025
      vertex 157.639603 31.213202 11.100025
      vertex 155.028229 16.621883 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 154.183990 16.586025 11.100025
      vertex 157.639603 31.213202 11.100025
      vertex 154.604584 16.639881 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 153.778534 16.461857 11.100025
      vertex 153.399918 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.058990 16.018816 11.100025
      vertex 157.639603 31.213202 11.100025
      vertex 153.399918 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 137.639618 11.213205 11.100025
      vertex 157.639603 31.213202 11.100025
      vertex 153.058990 16.018816 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.765594 15.712686 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 153.058990 16.018816 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.528137 15.361372 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 152.765594 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 137.639618 11.213205 11.100025
      vertex 152.210678 14.142134 11.100025
      vertex 152.246643 13.719633 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.353485 13.309285 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 152.246643 13.719633 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 4.142136 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 152.353485 13.309285 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.528137 12.922898 11.100025
      vertex 144.710678 4.142136 11.100025
      vertex 152.353485 13.309285 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.197250 16.152128 11.100025
      vertex 155.836197 16.374451 11.100025
      vertex 157.639603 31.213202 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 164.710678 24.142136 11.100025
      vertex 156.197250 16.152128 11.100025
      vertex 157.639603 31.213202 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.515564 15.871983 11.100025
      vertex 156.197250 16.152128 11.100025
      vertex 164.710678 24.142136 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 4.142136 11.100025
      vertex 152.528137 12.922898 11.100025
      vertex 152.765594 12.571585 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.058990 12.265455 11.100025
      vertex 144.710678 4.142136 11.100025
      vertex 152.765594 12.571585 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 146.493011 2.632573 11.100025
      vertex 144.710678 4.142136 11.100025
      vertex 153.058990 12.265455 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.399918 12.013312 11.100025
      vertex 146.493011 2.632573 11.100025
      vertex 153.058990 12.265455 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 148.499496 1.436971 11.100025
      vertex 146.493011 2.632573 11.100025
      vertex 153.399918 12.013312 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.778534 11.822410 11.100025
      vertex 148.499496 1.436971 11.100025
      vertex 153.399918 12.013312 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 150.675415 0.587925 11.100025
      vertex 148.499496 1.436971 11.100025
      vertex 153.778534 11.822410 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 154.183990 11.698246 11.100025
      vertex 150.675415 0.587925 11.100025
      vertex 153.778534 11.822410 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.961411 0.108600 11.100025
      vertex 150.675415 0.587925 11.100025
      vertex 154.183990 11.698246 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 154.604584 11.644385 11.100025
      vertex 152.961411 0.108600 11.100025
      vertex 154.183990 11.698246 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.295105 0.012077 11.100025
      vertex 152.961411 0.108600 11.100025
      vertex 154.604584 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.028229 11.662386 11.100025
      vertex 155.295105 0.012077 11.100025
      vertex 154.604584 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.781937 15.542071 11.100025
      vertex 156.515564 15.871983 11.100025
      vertex 164.710678 24.142136 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 166.220230 22.359804 11.100025
      vertex 156.781937 15.542071 11.100025
      vertex 164.710678 24.142136 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.988739 15.171889 11.100025
      vertex 156.781937 15.542071 11.100025
      vertex 166.220230 22.359804 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 167.415848 20.353313 11.100025
      vertex 156.988739 15.171889 11.100025
      vertex 166.220230 22.359804 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.130005 14.772079 11.100025
      vertex 156.988739 15.171889 11.100025
      vertex 167.415848 20.353313 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.264893 18.177397 11.100025
      vertex 157.130005 14.772079 11.100025
      vertex 167.415848 20.353313 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.201675 14.354151 11.100025
      vertex 157.130005 14.772079 11.100025
      vertex 168.264893 18.177397 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.744202 15.891414 11.100025
      vertex 157.201675 14.354151 11.100025
      vertex 168.264893 18.177397 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.210678 14.142134 11.100025
      vertex 157.201675 14.354151 11.100025
      vertex 168.744202 15.891414 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 168.840729 13.557710 11.100025
      vertex 157.210678 14.142134 11.100025
      vertex 168.744202 15.891414 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.201675 13.930120 11.100025
      vertex 157.210678 14.142134 11.100025
      vertex 168.840729 13.557710 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.130005 13.512191 11.100025
      vertex 157.201675 13.930120 11.100025
      vertex 168.840729 13.557710 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 168.551834 11.239953 11.100025
      vertex 157.130005 13.512191 11.100025
      vertex 168.840729 13.557710 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.988739 13.112381 11.100025
      vertex 157.130005 13.512191 11.100025
      vertex 168.551834 11.239953 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 167.885361 9.001359 11.100025
      vertex 156.988739 13.112381 11.100025
      vertex 168.551834 11.239953 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.781937 12.742199 11.100025
      vertex 156.988739 13.112381 11.100025
      vertex 167.885361 9.001359 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 166.859543 6.902985 11.100025
      vertex 156.781937 12.742199 11.100025
      vertex 167.885361 9.001359 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.515564 12.412288 11.100025
      vertex 156.781937 12.742199 11.100025
      vertex 166.859543 6.902985 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 165.502304 5.002081 11.100025
      vertex 156.515564 12.412288 11.100025
      vertex 166.859543 6.902985 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.197250 12.132142 11.100025
      vertex 156.515564 12.412288 11.100025
      vertex 165.502304 5.002081 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 163.850723 3.350496 11.100025
      vertex 156.197250 12.132142 11.100025
      vertex 165.502304 5.002081 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.836197 11.909821 11.100025
      vertex 156.197250 12.132142 11.100025
      vertex 163.850723 3.350496 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 161.949829 1.993276 11.100025
      vertex 155.836197 11.909821 11.100025
      vertex 163.850723 3.350496 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.442749 11.751719 11.100025
      vertex 155.836197 11.909821 11.100025
      vertex 161.949829 1.993276 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 159.851456 0.967450 11.100025
      vertex 155.442749 11.751719 11.100025
      vertex 161.949829 1.993276 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.028229 11.662386 11.100025
      vertex 155.442749 11.751719 11.100025
      vertex 159.851456 0.967450 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.612854 0.300989 11.100025
      vertex 155.028229 11.662386 11.100025
      vertex 159.851456 0.967450 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.295105 0.012077 11.100025
      vertex 155.028229 11.662386 11.100025
      vertex 157.612854 0.300989 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 137.639618 107.639610 11.100025
      vertex 152.246643 105.133179 11.100025
      vertex 152.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.246643 104.288177 11.100025
      vertex 137.639618 107.639610 11.100025
      vertex 152.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.353485 103.877831 11.100025
      vertex 137.639618 107.639610 11.100025
      vertex 152.246643 104.288177 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 87.639610 11.100025
      vertex 153.399918 102.581856 11.100025
      vertex 153.778534 102.390953 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 137.639618 107.639610 11.100025
      vertex 152.353485 103.877831 11.100025
      vertex 152.528137 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.765594 103.140129 11.100025
      vertex 137.639618 107.639610 11.100025
      vertex 152.528137 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 87.639610 11.100025
      vertex 137.639618 107.639610 11.100025
      vertex 152.765594 103.140129 11.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 153.058990 102.833992 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 152.765594 103.140129 11.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 153.399918 102.581856 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 153.058990 102.833992 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.399918 106.839500 11.100025
      vertex 153.058990 106.587357 11.100025
      vertex 144.710678 114.710670 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 146.493011 116.220238 11.100025
      vertex 153.399918 106.839500 11.100025
      vertex 144.710678 114.710670 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.778534 107.030396 11.100025
      vertex 153.399918 106.839500 11.100025
      vertex 146.493011 116.220238 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 148.499496 117.415848 11.100025
      vertex 153.778534 107.030396 11.100025
      vertex 146.493011 116.220238 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 154.183990 107.154564 11.100025
      vertex 153.778534 107.030396 11.100025
      vertex 148.499496 117.415848 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 150.675415 118.264885 11.100025
      vertex 154.183990 107.154564 11.100025
      vertex 148.499496 117.415848 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 154.604584 107.208420 11.100025
      vertex 154.183990 107.154564 11.100025
      vertex 150.675415 118.264885 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 87.639610 11.100025
      vertex 153.778534 102.390953 11.100025
      vertex 154.183990 102.266785 11.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 154.604584 102.212929 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 154.183990 102.266785 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.028229 102.230927 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 154.604584 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 114.710670 11.100025
      vertex 153.058990 106.587357 11.100025
      vertex 152.765594 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.528137 105.929909 11.100025
      vertex 144.710678 114.710670 11.100025
      vertex 152.765594 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 137.639618 107.639610 11.100025
      vertex 144.710678 114.710670 11.100025
      vertex 152.528137 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.353485 105.543526 11.100025
      vertex 137.639618 107.639610 11.100025
      vertex 152.528137 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.246643 105.133179 11.100025
      vertex 137.639618 107.639610 11.100025
      vertex 152.353485 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.639603 87.639610 11.100025
      vertex 155.028229 102.230927 11.100025
      vertex 155.442749 102.320259 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.836197 102.478363 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 155.442749 102.320259 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 164.710678 94.710678 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 155.836197 102.478363 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 168.551834 107.612862 11.100025
      vertex 168.840729 105.295097 11.100025
      vertex 157.201675 104.922691 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.130005 105.340622 11.100025
      vertex 168.551834 107.612862 11.100025
      vertex 157.201675 104.922691 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 167.885361 109.851456 11.100025
      vertex 168.551834 107.612862 11.100025
      vertex 157.130005 105.340622 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.988739 105.740425 11.100025
      vertex 167.885361 109.851456 11.100025
      vertex 157.130005 105.340622 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 166.859543 111.949821 11.100025
      vertex 167.885361 109.851456 11.100025
      vertex 156.988739 105.740425 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.781937 106.110619 11.100025
      vertex 166.859543 111.949821 11.100025
      vertex 156.988739 105.740425 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 165.502304 113.850731 11.100025
      vertex 166.859543 111.949821 11.100025
      vertex 156.781937 106.110619 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.515564 106.440529 11.100025
      vertex 165.502304 113.850731 11.100025
      vertex 156.781937 106.110619 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 163.850723 115.502312 11.100025
      vertex 165.502304 113.850731 11.100025
      vertex 156.515564 106.440529 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.197250 106.720673 11.100025
      vertex 163.850723 115.502312 11.100025
      vertex 156.515564 106.440529 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 161.949829 116.859535 11.100025
      vertex 163.850723 115.502312 11.100025
      vertex 156.197250 106.720673 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.836197 106.942993 11.100025
      vertex 161.949829 116.859535 11.100025
      vertex 156.197250 106.720673 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 159.851456 117.885368 11.100025
      vertex 161.949829 116.859535 11.100025
      vertex 155.836197 106.942993 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.442749 107.101097 11.100025
      vertex 159.851456 117.885368 11.100025
      vertex 155.836197 106.942993 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.612854 118.551819 11.100025
      vertex 159.851456 117.885368 11.100025
      vertex 155.442749 107.101097 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.028229 107.190430 11.100025
      vertex 157.612854 118.551819 11.100025
      vertex 155.442749 107.101097 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.295105 118.840729 11.100025
      vertex 157.612854 118.551819 11.100025
      vertex 155.028229 107.190430 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 154.604584 107.208420 11.100025
      vertex 155.295105 118.840729 11.100025
      vertex 155.028229 107.190430 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.961411 118.744209 11.100025
      vertex 155.295105 118.840729 11.100025
      vertex 154.604584 107.208420 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 150.675415 118.264885 11.100025
      vertex 152.961411 118.744209 11.100025
      vertex 154.604584 107.208420 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 164.710678 94.710678 11.100025
      vertex 155.836197 102.478363 11.100025
      vertex 156.197250 102.700684 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.515564 102.980827 11.100025
      vertex 164.710678 94.710678 11.100025
      vertex 156.197250 102.700684 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 166.220230 96.493004 11.100025
      vertex 164.710678 94.710678 11.100025
      vertex 156.515564 102.980827 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.781937 103.310745 11.100025
      vertex 166.220230 96.493004 11.100025
      vertex 156.515564 102.980827 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 167.415848 98.499496 11.100025
      vertex 166.220230 96.493004 11.100025
      vertex 156.781937 103.310745 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.988739 103.680923 11.100025
      vertex 167.415848 98.499496 11.100025
      vertex 156.781937 103.310745 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.264893 100.675415 11.100025
      vertex 167.415848 98.499496 11.100025
      vertex 156.988739 103.680923 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.130005 104.080734 11.100025
      vertex 168.264893 100.675415 11.100025
      vertex 156.988739 103.680923 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.744202 102.961395 11.100025
      vertex 168.264893 100.675415 11.100025
      vertex 157.130005 104.080734 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.201675 104.498665 11.100025
      vertex 168.744202 102.961395 11.100025
      vertex 157.130005 104.080734 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 168.840729 105.295097 11.100025
      vertex 168.744202 102.961395 11.100025
      vertex 157.201675 104.498665 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.210678 104.710678 11.100025
      vertex 168.840729 105.295097 11.100025
      vertex 157.201675 104.498665 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.201675 104.922691 11.100025
      vertex 168.840729 105.295097 11.100025
      vertex 157.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 84.676407 11.100025
      vertex 52.426407 84.676407 11.100025
      vertex 52.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 116.426407 84.676407 11.100025
      vertex 52.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 34.176407 66.426407 11.100025
      vertex 34.176407 52.426407 11.100025
      vertex 32.426407 52.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 32.426407 66.426407 11.100025
      vertex 34.176407 66.426407 11.100025
      vertex 32.426407 52.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.642138 104.710678 11.100025
      vertex 16.633131 104.922691 11.100025
      vertex 31.213202 107.639610 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.633131 104.498665 11.100025
      vertex 16.642138 104.710678 11.100025
      vertex 31.213202 107.639610 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.213205 87.639610 11.100025
      vertex 4.142136 94.710678 11.100025
      vertex 12.831367 102.581856 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.209991 102.390953 11.100025
      vertex 11.213205 87.639610 11.100025
      vertex 12.831367 102.581856 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.615437 102.266785 11.100025
      vertex 11.213205 87.639610 11.100025
      vertex 13.209991 102.390953 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 107.639610 11.100025
      vertex 16.213409 103.310745 11.100025
      vertex 16.420208 103.680923 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.561464 104.080734 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 16.420208 103.680923 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.633131 104.498665 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 16.561464 104.080734 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.213205 87.639610 11.100025
      vertex 13.615437 102.266785 11.100025
      vertex 14.036030 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.459677 102.230927 11.100025
      vertex 11.213205 87.639610 11.100025
      vertex 14.036030 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.874190 102.320259 11.100025
      vertex 11.213205 87.639610 11.100025
      vertex 14.459677 102.230927 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 22.359804 116.220238 11.100025
      vertex 24.142132 114.710670 11.100025
      vertex 15.947021 106.440529 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.628717 106.720673 11.100025
      vertex 22.359804 116.220238 11.100025
      vertex 15.947021 106.440529 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 20.353310 117.415848 11.100025
      vertex 22.359804 116.220238 11.100025
      vertex 15.628717 106.720673 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.267648 106.942993 11.100025
      vertex 20.353310 117.415848 11.100025
      vertex 15.628717 106.720673 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 18.177397 118.264885 11.100025
      vertex 20.353310 117.415848 11.100025
      vertex 15.267648 106.942993 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.874190 107.101097 11.100025
      vertex 18.177397 118.264885 11.100025
      vertex 15.267648 106.942993 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.891411 118.744209 11.100025
      vertex 18.177397 118.264885 11.100025
      vertex 14.874190 107.101097 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.459677 107.190430 11.100025
      vertex 15.891411 118.744209 11.100025
      vertex 14.874190 107.101097 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.557710 118.840729 11.100025
      vertex 15.891411 118.744209 11.100025
      vertex 14.459677 107.190430 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.036030 107.208420 11.100025
      vertex 13.557710 118.840729 11.100025
      vertex 14.459677 107.190430 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.239953 118.551819 11.100025
      vertex 13.557710 118.840729 11.100025
      vertex 14.036030 107.208420 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.615437 107.154564 11.100025
      vertex 11.239953 118.551819 11.100025
      vertex 14.036030 107.208420 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 9.001359 117.885368 11.100025
      vertex 11.239953 118.551819 11.100025
      vertex 13.615437 107.154564 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.209991 107.030396 11.100025
      vertex 9.001359 117.885368 11.100025
      vertex 13.615437 107.154564 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 6.902985 116.859535 11.100025
      vertex 9.001359 117.885368 11.100025
      vertex 13.209991 107.030396 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.831367 106.839500 11.100025
      vertex 6.902985 116.859535 11.100025
      vertex 13.209991 107.030396 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 5.002081 115.502312 11.100025
      vertex 6.902985 116.859535 11.100025
      vertex 12.831367 106.839500 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.490452 106.587357 11.100025
      vertex 5.002081 115.502312 11.100025
      vertex 12.831367 106.839500 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 3.350496 113.850731 11.100025
      vertex 5.002081 115.502312 11.100025
      vertex 12.490452 106.587357 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.197047 106.281227 11.100025
      vertex 3.350496 113.850731 11.100025
      vertex 12.490452 106.587357 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.993276 111.949821 11.100025
      vertex 3.350496 113.850731 11.100025
      vertex 12.197047 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.959598 105.929909 11.100025
      vertex 1.993276 111.949821 11.100025
      vertex 12.197047 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.967450 109.851456 11.100025
      vertex 1.993276 111.949821 11.100025
      vertex 11.959598 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.784941 105.543526 11.100025
      vertex 0.967450 109.851456 11.100025
      vertex 11.959598 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.300989 107.612862 11.100025
      vertex 0.967450 109.851456 11.100025
      vertex 11.784941 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.678092 105.133179 11.100025
      vertex 0.300989 107.612862 11.100025
      vertex 11.784941 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.012077 105.295097 11.100025
      vertex 0.300989 107.612862 11.100025
      vertex 11.678092 105.133179 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.642136 104.710678 11.100025
      vertex 0.012077 105.295097 11.100025
      vertex 11.678092 105.133179 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.108600 102.961395 11.100025
      vertex 0.012077 105.295097 11.100025
      vertex 11.642136 104.710678 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.678092 104.288177 11.100025
      vertex 0.108600 102.961395 11.100025
      vertex 11.642136 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.587925 100.675415 11.100025
      vertex 0.108600 102.961395 11.100025
      vertex 11.678092 104.288177 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.784941 103.877831 11.100025
      vertex 0.587925 100.675415 11.100025
      vertex 11.678092 104.288177 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.436971 98.499496 11.100025
      vertex 0.587925 100.675415 11.100025
      vertex 11.784941 103.877831 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.959598 103.491440 11.100025
      vertex 1.436971 98.499496 11.100025
      vertex 11.784941 103.877831 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 2.632573 96.493004 11.100025
      vertex 1.436971 98.499496 11.100025
      vertex 11.959598 103.491440 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.197047 103.140129 11.100025
      vertex 2.632573 96.493004 11.100025
      vertex 11.959598 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 4.142136 94.710678 11.100025
      vertex 2.632573 96.493004 11.100025
      vertex 12.197047 103.140129 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.490452 102.833992 11.100025
      vertex 4.142136 94.710678 11.100025
      vertex 12.197047 103.140129 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.831367 102.581856 11.100025
      vertex 4.142136 94.710678 11.100025
      vertex 12.490452 102.833992 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 107.639610 11.100025
      vertex 16.633131 104.922691 11.100025
      vertex 16.561464 105.340622 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.420208 105.740425 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 16.561464 105.340622 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 24.142132 114.710670 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 16.420208 105.740425 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.213409 106.110619 11.100025
      vertex 24.142132 114.710670 11.100025
      vertex 16.420208 105.740425 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.947021 106.440529 11.100025
      vertex 24.142132 114.710670 11.100025
      vertex 16.213409 106.110619 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.213205 87.639610 11.100025
      vertex 14.874190 102.320259 11.100025
      vertex 15.267648 102.478363 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.628717 102.700684 11.100025
      vertex 11.213205 87.639610 11.100025
      vertex 15.267648 102.478363 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 107.639610 11.100025
      vertex 11.213205 87.639610 11.100025
      vertex 15.628717 102.700684 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.947021 102.980827 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 15.628717 102.700684 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.213409 103.310745 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 15.947021 102.980827 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 11.213205 11.100025
      vertex 24.142132 4.142136 11.100025
      vertex 16.213409 12.742199 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.420208 13.112381 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 16.213409 12.742199 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 11.213205 11.100025
      vertex 16.420208 13.112381 11.100025
      vertex 16.561464 13.512191 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.633131 13.930120 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 16.561464 13.512191 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.642138 14.142134 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 16.633131 13.930120 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.213205 31.213202 11.100025
      vertex 14.036030 16.639881 11.100025
      vertex 13.615437 16.586025 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.209991 16.461857 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 13.615437 16.586025 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 4.142136 24.142136 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 13.209991 16.461857 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 11.213205 11.100025
      vertex 16.642138 14.142134 11.100025
      vertex 16.633131 14.354151 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.561464 14.772079 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 16.633131 14.354151 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.420208 15.171889 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 16.561464 14.772079 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.213205 31.213202 11.100025
      vertex 15.267648 16.374451 11.100025
      vertex 14.874190 16.532551 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.459677 16.621883 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 14.874190 16.532551 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.036030 16.639881 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 14.459677 16.621883 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 31.213202 11.213205 11.100025
      vertex 16.420208 15.171889 11.100025
      vertex 16.213409 15.542071 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.947021 15.871983 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 16.213409 15.542071 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.213205 31.213202 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 15.947021 15.871983 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.628717 16.152128 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 15.947021 15.871983 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.267648 16.374451 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 15.628717 16.152128 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 4.142136 24.142136 11.100025
      vertex 13.209991 16.461857 11.100025
      vertex 12.831367 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.490452 16.018816 11.100025
      vertex 4.142136 24.142136 11.100025
      vertex 12.831367 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 2.632573 22.359804 11.100025
      vertex 4.142136 24.142136 11.100025
      vertex 12.490452 16.018816 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.197047 15.712686 11.100025
      vertex 2.632573 22.359804 11.100025
      vertex 12.490452 16.018816 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.436971 20.353313 11.100025
      vertex 2.632573 22.359804 11.100025
      vertex 12.197047 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.959598 15.361372 11.100025
      vertex 1.436971 20.353313 11.100025
      vertex 12.197047 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.587925 18.177397 11.100025
      vertex 1.436971 20.353313 11.100025
      vertex 11.959598 15.361372 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.784941 14.974985 11.100025
      vertex 0.587925 18.177397 11.100025
      vertex 11.959598 15.361372 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.108600 15.891414 11.100025
      vertex 0.587925 18.177397 11.100025
      vertex 11.784941 14.974985 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.678092 14.564637 11.100025
      vertex 0.108600 15.891414 11.100025
      vertex 11.784941 14.974985 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.012077 13.557710 11.100025
      vertex 0.108600 15.891414 11.100025
      vertex 11.678092 14.564637 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.642136 14.142134 11.100025
      vertex 0.012077 13.557710 11.100025
      vertex 11.678092 14.564637 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.300989 11.239953 11.100025
      vertex 0.012077 13.557710 11.100025
      vertex 11.642136 14.142134 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.678092 13.719633 11.100025
      vertex 0.300989 11.239953 11.100025
      vertex 11.642136 14.142134 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.967450 9.001359 11.100025
      vertex 0.300989 11.239953 11.100025
      vertex 11.678092 13.719633 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.784941 13.309285 11.100025
      vertex 0.967450 9.001359 11.100025
      vertex 11.678092 13.719633 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.993276 6.902985 11.100025
      vertex 0.967450 9.001359 11.100025
      vertex 11.784941 13.309285 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.959598 12.922898 11.100025
      vertex 1.993276 6.902985 11.100025
      vertex 11.784941 13.309285 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 3.350496 5.002081 11.100025
      vertex 1.993276 6.902985 11.100025
      vertex 11.959598 12.922898 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.197047 12.571585 11.100025
      vertex 3.350496 5.002081 11.100025
      vertex 11.959598 12.922898 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 5.002081 3.350496 11.100025
      vertex 3.350496 5.002081 11.100025
      vertex 12.197047 12.571585 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.490452 12.265455 11.100025
      vertex 5.002081 3.350496 11.100025
      vertex 12.197047 12.571585 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 6.902985 1.993276 11.100025
      vertex 5.002081 3.350496 11.100025
      vertex 12.490452 12.265455 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.831367 12.013312 11.100025
      vertex 6.902985 1.993276 11.100025
      vertex 12.490452 12.265455 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 9.001359 0.967450 11.100025
      vertex 6.902985 1.993276 11.100025
      vertex 12.831367 12.013312 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.209991 11.822410 11.100025
      vertex 9.001359 0.967450 11.100025
      vertex 12.831367 12.013312 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.239953 0.300989 11.100025
      vertex 9.001359 0.967450 11.100025
      vertex 13.209991 11.822410 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.615437 11.698246 11.100025
      vertex 11.239953 0.300989 11.100025
      vertex 13.209991 11.822410 11.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.557710 0.012077 11.100025
      vertex 11.239953 0.300989 11.100025
      vertex 13.615437 11.698246 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 14.036030 11.644385 11.100025
      vertex 13.557710 0.012077 11.100025
      vertex 13.615437 11.698246 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 15.891411 0.108600 11.100025
      vertex 13.557710 0.012077 11.100025
      vertex 14.036030 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 14.459677 11.662386 11.100025
      vertex 15.891411 0.108600 11.100025
      vertex 14.036030 11.644385 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 18.177397 0.587925 11.100025
      vertex 15.891411 0.108600 11.100025
      vertex 14.459677 11.662386 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 14.874190 11.751719 11.100025
      vertex 18.177397 0.587925 11.100025
      vertex 14.459677 11.662386 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 20.353310 1.436971 11.100025
      vertex 18.177397 0.587925 11.100025
      vertex 14.874190 11.751719 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.267648 11.909821 11.100025
      vertex 20.353310 1.436971 11.100025
      vertex 14.874190 11.751719 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 22.359804 2.632573 11.100025
      vertex 20.353310 1.436971 11.100025
      vertex 15.267648 11.909821 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.628717 12.132142 11.100025
      vertex 22.359804 2.632573 11.100025
      vertex 15.267648 11.909821 11.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 24.142132 4.142136 11.100025
      vertex 22.359804 2.632573 11.100025
      vertex 15.628717 12.132142 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.947021 12.412288 11.100025
      vertex 24.142132 4.142136 11.100025
      vertex 15.628717 12.132142 11.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.213409 12.742199 11.100025
      vertex 24.142132 4.142136 11.100025
      vertex 15.947021 12.412288 11.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 54.385723 84.426407 16.100025
      vertex 54.385723 84.426407 18.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 42.391396 84.426407 16.100025
      vertex 54.385723 84.426407 16.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 11.213205 31.213202 2.000025
      vertex 4.142136 24.142136 0.000025
      vertex 4.142136 24.142136 2.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000001
    outer loop
      vertex 11.213205 31.213202 11.100025
      vertex 25.534271 45.534267 18.100025
      vertex 32.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 32.426407 52.426407 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 32.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 11.213205 31.213202 2.000025
      vertex 11.213205 31.213202 11.100025
      vertex 32.426407 52.426407 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 32.426407 52.426407 0.000025
      vertex 11.213205 31.213202 2.000025
      vertex 32.426407 52.426407 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000002
    outer loop
      vertex 4.142136 24.142136 0.000025
      vertex 11.213205 31.213202 2.000025
      vertex 32.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 -0.000000
    outer loop
      vertex 5.534269 25.534269 18.100025
      vertex 25.534271 45.534267 18.100025
      vertex 11.213205 31.213202 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 -0.000000
    outer loop
      vertex 4.142136 24.142136 11.100025
      vertex 5.534269 25.534269 18.100025
      vertex 11.213205 31.213202 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 4.142136 24.142136 18.100025
      vertex 5.534269 25.534269 18.100025
      vertex 4.142136 24.142136 11.100025
    endloop
  endfacet
  facet normal -0.763083 0.646300 0.000000
    outer loop
      vertex 2.632573 22.359804 11.100025
      vertex 4.142136 24.142136 18.100025
      vertex 4.142136 24.142136 11.100025
    endloop
  endfacet
  facet normal -0.763083 0.646300 0.000000
    outer loop
      vertex 2.632573 22.359804 18.100025
      vertex 4.142136 24.142136 18.100025
      vertex 2.632573 22.359804 11.100025
    endloop
  endfacet
  facet normal -0.859055 0.511883 0.000000
    outer loop
      vertex 1.436971 20.353313 11.100025
      vertex 2.632573 22.359804 18.100025
      vertex 2.632573 22.359804 11.100025
    endloop
  endfacet
  facet normal -0.859055 0.511883 0.000000
    outer loop
      vertex 1.436971 20.353313 18.100025
      vertex 2.632573 22.359804 18.100025
      vertex 1.436971 20.353313 11.100025
    endloop
  endfacet
  facet normal -0.931591 0.363508 0.000000
    outer loop
      vertex 0.587925 18.177397 11.100025
      vertex 1.436971 20.353313 18.100025
      vertex 1.436971 20.353313 11.100025
    endloop
  endfacet
  facet normal -0.931591 0.363508 0.000000
    outer loop
      vertex 0.587925 18.177397 18.100025
      vertex 1.436971 20.353313 18.100025
      vertex 0.587925 18.177397 11.100025
    endloop
  endfacet
  facet normal -0.978716 0.205218 0.000000
    outer loop
      vertex 0.108600 15.891414 11.100025
      vertex 0.587925 18.177397 18.100025
      vertex 0.587925 18.177397 11.100025
    endloop
  endfacet
  facet normal -0.978716 0.205218 0.000000
    outer loop
      vertex 0.108600 15.891414 18.100025
      vertex 0.587925 18.177397 18.100025
      vertex 0.108600 15.891414 11.100025
    endloop
  endfacet
  facet normal -0.999146 0.041325 0.000000
    outer loop
      vertex 0.012077 13.557710 11.100025
      vertex 0.108600 15.891414 18.100025
      vertex 0.108600 15.891414 11.100025
    endloop
  endfacet
  facet normal -0.999146 0.041325 0.000000
    outer loop
      vertex 0.012077 13.557710 18.100025
      vertex 0.108600 15.891414 18.100025
      vertex 0.012077 13.557710 11.100025
    endloop
  endfacet
  facet normal -0.992320 -0.123694 0.000000
    outer loop
      vertex 0.300989 11.239953 11.100025
      vertex 0.012077 13.557710 18.100025
      vertex 0.012077 13.557710 11.100025
    endloop
  endfacet
  facet normal -0.992320 -0.123694 -0.000000
    outer loop
      vertex 0.300989 11.239953 18.100025
      vertex 0.012077 13.557710 18.100025
      vertex 0.300989 11.239953 11.100025
    endloop
  endfacet
  facet normal -0.958427 -0.285338 0.000000
    outer loop
      vertex 0.967450 9.001359 11.100025
      vertex 0.300989 11.239953 18.100025
      vertex 0.300989 11.239953 11.100025
    endloop
  endfacet
  facet normal -0.958427 -0.285338 -0.000000
    outer loop
      vertex 0.967450 9.001359 18.100025
      vertex 0.300989 11.239953 18.100025
      vertex 0.967450 9.001359 11.100025
    endloop
  endfacet
  facet normal -0.898392 -0.439194 0.000000
    outer loop
      vertex 1.993276 6.902985 11.100025
      vertex 0.967450 9.001359 18.100025
      vertex 0.967450 9.001359 11.100025
    endloop
  endfacet
  facet normal -0.898392 -0.439194 -0.000000
    outer loop
      vertex 1.993276 6.902985 18.100025
      vertex 0.967450 9.001359 18.100025
      vertex 1.993276 6.902985 11.100025
    endloop
  endfacet
  facet normal -0.813849 -0.581077 0.000000
    outer loop
      vertex 3.350496 5.002081 11.100025
      vertex 1.993276 6.902985 18.100025
      vertex 1.993276 6.902985 11.100025
    endloop
  endfacet
  facet normal -0.813849 -0.581077 -0.000000
    outer loop
      vertex 3.350496 5.002081 18.100025
      vertex 1.993276 6.902985 18.100025
      vertex 3.350496 5.002081 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 5.002081 3.350496 11.100025
      vertex 3.350496 5.002081 18.100025
      vertex 3.350496 5.002081 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 -0.000000
    outer loop
      vertex 5.002081 3.350496 18.100025
      vertex 3.350496 5.002081 18.100025
      vertex 5.002081 3.350496 11.100025
    endloop
  endfacet
  facet normal -0.581077 -0.813849 0.000000
    outer loop
      vertex 6.902985 1.993276 11.100025
      vertex 5.002081 3.350496 18.100025
      vertex 5.002081 3.350496 11.100025
    endloop
  endfacet
  facet normal -0.581077 -0.813849 -0.000000
    outer loop
      vertex 6.902985 1.993276 18.100025
      vertex 5.002081 3.350496 18.100025
      vertex 6.902985 1.993276 11.100025
    endloop
  endfacet
  facet normal -0.439194 -0.898392 0.000000
    outer loop
      vertex 9.001359 0.967450 11.100025
      vertex 6.902985 1.993276 18.100025
      vertex 6.902985 1.993276 11.100025
    endloop
  endfacet
  facet normal -0.439194 -0.898392 -0.000000
    outer loop
      vertex 9.001359 0.967450 18.100025
      vertex 6.902985 1.993276 18.100025
      vertex 9.001359 0.967450 11.100025
    endloop
  endfacet
  facet normal -0.285338 -0.958427 0.000000
    outer loop
      vertex 11.239953 0.300989 11.100025
      vertex 9.001359 0.967450 18.100025
      vertex 9.001359 0.967450 11.100025
    endloop
  endfacet
  facet normal -0.285338 -0.958427 -0.000000
    outer loop
      vertex 11.239953 0.300989 18.100025
      vertex 9.001359 0.967450 18.100025
      vertex 11.239953 0.300989 11.100025
    endloop
  endfacet
  facet normal -0.123694 -0.992320 0.000000
    outer loop
      vertex 13.557710 0.012077 11.100025
      vertex 11.239953 0.300989 18.100025
      vertex 11.239953 0.300989 11.100025
    endloop
  endfacet
  facet normal -0.123694 -0.992320 -0.000000
    outer loop
      vertex 13.557710 0.012077 18.100025
      vertex 11.239953 0.300989 18.100025
      vertex 13.557710 0.012077 11.100025
    endloop
  endfacet
  facet normal 0.041325 -0.999146 0.000000
    outer loop
      vertex 15.891411 0.108600 11.100025
      vertex 13.557710 0.012077 18.100025
      vertex 13.557710 0.012077 11.100025
    endloop
  endfacet
  facet normal 0.041325 -0.999146 0.000000
    outer loop
      vertex 15.891411 0.108600 18.100025
      vertex 13.557710 0.012077 18.100025
      vertex 15.891411 0.108600 11.100025
    endloop
  endfacet
  facet normal 0.205217 -0.978716 0.000000
    outer loop
      vertex 18.177397 0.587925 11.100025
      vertex 15.891411 0.108600 18.100025
      vertex 15.891411 0.108600 11.100025
    endloop
  endfacet
  facet normal 0.205217 -0.978716 0.000000
    outer loop
      vertex 18.177397 0.587925 18.100025
      vertex 15.891411 0.108600 18.100025
      vertex 18.177397 0.587925 11.100025
    endloop
  endfacet
  facet normal 0.363509 -0.931591 0.000000
    outer loop
      vertex 20.353310 1.436971 11.100025
      vertex 18.177397 0.587925 18.100025
      vertex 18.177397 0.587925 11.100025
    endloop
  endfacet
  facet normal 0.363509 -0.931591 0.000000
    outer loop
      vertex 20.353310 1.436971 18.100025
      vertex 18.177397 0.587925 18.100025
      vertex 20.353310 1.436971 11.100025
    endloop
  endfacet
  facet normal 0.511882 -0.859056 0.000000
    outer loop
      vertex 22.359804 2.632573 11.100025
      vertex 20.353310 1.436971 18.100025
      vertex 20.353310 1.436971 11.100025
    endloop
  endfacet
  facet normal 0.511882 -0.859056 0.000000
    outer loop
      vertex 22.359804 2.632573 18.100025
      vertex 20.353310 1.436971 18.100025
      vertex 22.359804 2.632573 11.100025
    endloop
  endfacet
  facet normal 0.646301 -0.763082 0.000000
    outer loop
      vertex 24.142132 4.142136 11.100025
      vertex 22.359804 2.632573 18.100025
      vertex 22.359804 2.632573 11.100025
    endloop
  endfacet
  facet normal 0.646301 -0.763082 0.000000
    outer loop
      vertex 24.142132 4.142136 18.100025
      vertex 22.359804 2.632573 18.100025
      vertex 24.142132 4.142136 11.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 -0.000000
    outer loop
      vertex 24.142132 4.142136 11.100025
      vertex 31.213202 11.213205 11.100025
      vertex 45.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 -0.000001
    outer loop
      vertex 25.534271 5.534269 18.100025
      vertex 24.142132 4.142136 11.100025
      vertex 45.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.707105 -0.707108 0.000000
    outer loop
      vertex 24.142132 4.142136 18.100025
      vertex 24.142132 4.142136 11.100025
      vertex 25.534271 5.534269 18.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 52.426407 32.426407 11.100025
      vertex 52.426407 32.426407 18.100025
      vertex 45.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 -0.000000
    outer loop
      vertex 31.213202 11.213205 11.100025
      vertex 52.426407 32.426407 11.100025
      vertex 45.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 52.426407 32.426407 0.000025
      vertex 52.426407 32.426407 11.100025
      vertex 31.213202 11.213205 11.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 31.213202 11.213205 2.000025
      vertex 52.426407 32.426407 0.000025
      vertex 31.213202 11.213205 11.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 24.142132 4.142136 0.000025
      vertex 52.426407 32.426407 0.000025
      vertex 31.213202 11.213205 2.000025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 24.142132 4.142136 2.000025
      vertex 24.142132 4.142136 0.000025
      vertex 31.213202 11.213205 2.000025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 88.504684 32.426407 13.653746
      vertex 88.461693 32.426407 13.402987
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 88.461693 32.426407 13.402987
      vertex 88.376930 32.426407 13.163103
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.252853 32.426407 12.940992
      vertex 116.426407 32.426407 11.100025
      vertex 88.376930 32.426407 13.163103
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.093018 32.426407 12.743047
      vertex 116.426407 32.426407 11.100025
      vertex 88.252853 32.426407 12.940992
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.402039 32.426407 12.574959
      vertex 69.185394 32.426407 12.441566
      vertex 116.426407 32.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.593018 32.426407 12.743047
      vertex 69.402039 32.426407 12.574959
      vertex 116.426407 32.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 11.100025
      vertex 67.095772 32.426407 13.281245
      vertex 67.031670 32.426407 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 67.010086 32.426407 13.780954
      vertex 52.426407 32.426407 11.100025
      vertex 67.031670 32.426407 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 52.426407 32.426407 11.100025
      vertex 67.010086 32.426407 13.780954
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 67.031670 32.426407 14.034455
      vertex 52.426407 32.426407 18.100025
      vertex 67.010086 32.426407 13.780954
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 67.095772 32.426407 14.280663
      vertex 52.426407 32.426407 18.100025
      vertex 67.031670 32.426407 14.034455
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 69.185394 32.426407 12.441566
      vertex 68.949318 32.426407 12.346704
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.700615 32.426407 12.293104
      vertex 116.426407 32.426407 11.100025
      vertex 68.949318 32.426407 12.346704
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 11.100025
      vertex 116.426407 32.426407 11.100025
      vertex 68.700615 32.426407 12.293104
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 68.446426 32.426407 12.282307
      vertex 52.426407 32.426407 11.100025
      vertex 68.700615 32.426407 12.293104
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 68.194069 32.426407 12.314621
      vertex 52.426407 32.426407 11.100025
      vertex 68.446426 32.426407 12.282307
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.531670 32.426407 14.034455
      vertex 69.185394 32.426407 15.120343
      vertex 69.402039 32.426407 14.986950
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 18.100025
      vertex 87.449318 32.426407 15.215205
      vertex 87.685394 32.426407 15.120343
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.902039 32.426407 14.986950
      vertex 116.426407 32.426407 18.100025
      vertex 87.685394 32.426407 15.120343
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 11.100025
      vertex 68.194069 32.426407 12.314621
      vertex 67.950798 32.426407 12.389121
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 67.723625 32.426407 12.503660
      vertex 52.426407 32.426407 11.100025
      vertex 67.950798 32.426407 12.389121
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 67.519073 32.426407 12.654946
      vertex 52.426407 32.426407 11.100025
      vertex 67.723625 32.426407 12.503660
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 70.010086 32.426407 13.780954
      vertex 86.694069 32.426407 12.314621
      vertex 86.450798 32.426407 12.389121
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 86.223625 32.426407 12.503660
      vertex 70.010086 32.426407 13.780954
      vertex 86.450798 32.426407 12.389121
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 86.019073 32.426407 12.654946
      vertex 70.010086 32.426407 13.780954
      vertex 86.223625 32.426407 12.503660
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.595772 32.426407 14.280663
      vertex 85.700562 32.426407 14.512497
      vertex 52.426407 32.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.531670 32.426407 14.034455
      vertex 85.595772 32.426407 14.280663
      vertex 52.426407 32.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 88.093018 32.426407 12.743047
      vertex 87.902039 32.426407 12.574959
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.685394 32.426407 12.441566
      vertex 116.426407 32.426407 11.100025
      vertex 87.902039 32.426407 12.574959
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.449318 32.426407 12.346704
      vertex 116.426407 32.426407 11.100025
      vertex 87.685394 32.426407 12.441566
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 11.100025
      vertex 67.519073 32.426407 12.654946
      vertex 67.343033 32.426407 12.838624
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 67.200562 32.426407 13.049412
      vertex 52.426407 32.426407 11.100025
      vertex 67.343033 32.426407 12.838624
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 67.095772 32.426407 13.281245
      vertex 52.426407 32.426407 11.100025
      vertex 67.200562 32.426407 13.049412
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 67.095772 32.426407 14.280663
      vertex 67.200562 32.426407 14.512497
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 67.343033 32.426407 14.723284
      vertex 52.426407 32.426407 18.100025
      vertex 67.200562 32.426407 14.512497
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 67.519073 32.426407 14.906963
      vertex 52.426407 32.426407 18.100025
      vertex 67.343033 32.426407 14.723284
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 70.010086 32.426407 13.780954
      vertex 86.019073 32.426407 12.654946
      vertex 85.843033 32.426407 12.838624
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 85.700562 32.426407 13.049412
      vertex 70.010086 32.426407 13.780954
      vertex 85.843033 32.426407 12.838624
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 85.595772 32.426407 13.281245
      vertex 70.010086 32.426407 13.780954
      vertex 85.700562 32.426407 13.049412
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.531670 32.426407 14.034455
      vertex 69.402039 32.426407 14.986950
      vertex 69.593018 32.426407 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.752853 32.426407 14.620917
      vertex 85.531670 32.426407 14.034455
      vertex 69.593018 32.426407 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.876930 32.426407 14.398806
      vertex 85.531670 32.426407 14.034455
      vertex 69.752853 32.426407 14.620917
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 85.700562 32.426407 14.512497
      vertex 85.843033 32.426407 14.723284
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 86.019073 32.426407 14.906963
      vertex 52.426407 32.426407 18.100025
      vertex 85.843033 32.426407 14.723284
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 86.223625 32.426407 15.058249
      vertex 52.426407 32.426407 18.100025
      vertex 86.019073 32.426407 14.906963
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 86.946426 32.426407 15.279602
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.200615 32.426407 15.268805
      vertex 116.426407 32.426407 18.100025
      vertex 86.946426 32.426407 15.279602
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.449318 32.426407 15.215205
      vertex 116.426407 32.426407 18.100025
      vertex 87.200615 32.426407 15.268805
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 18.100025
      vertex 87.902039 32.426407 14.986950
      vertex 88.093018 32.426407 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.252853 32.426407 14.620917
      vertex 116.426407 32.426407 18.100025
      vertex 88.093018 32.426407 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.376930 32.426407 14.398806
      vertex 116.426407 32.426407 18.100025
      vertex 88.252853 32.426407 14.620917
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 18.100025
      vertex 88.376930 32.426407 14.398806
      vertex 88.461693 32.426407 14.158921
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.504684 32.426407 13.908163
      vertex 116.426407 32.426407 18.100025
      vertex 88.461693 32.426407 14.158921
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 116.426407 32.426407 18.100025
      vertex 88.504684 32.426407 13.908163
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.510086 32.426407 13.780954
      vertex 116.426407 32.426407 11.100025
      vertex 88.504684 32.426407 13.908163
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.504684 32.426407 13.653746
      vertex 116.426407 32.426407 11.100025
      vertex 88.510086 32.426407 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.946426 32.426407 12.282307
      vertex 69.961685 32.426407 13.402987
      vertex 69.876930 32.426407 13.163103
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.752853 32.426407 12.940992
      vertex 86.946426 32.426407 12.282307
      vertex 69.876930 32.426407 13.163103
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 67.519073 32.426407 14.906963
      vertex 67.723625 32.426407 15.058249
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 67.950798 32.426407 15.172788
      vertex 52.426407 32.426407 18.100025
      vertex 67.723625 32.426407 15.058249
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 68.194069 32.426407 15.247287
      vertex 52.426407 32.426407 18.100025
      vertex 67.950798 32.426407 15.172788
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 86.223625 32.426407 15.058249
      vertex 86.450798 32.426407 15.172788
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 86.694069 32.426407 15.247287
      vertex 52.426407 32.426407 18.100025
      vertex 86.450798 32.426407 15.172788
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 86.946426 32.426407 15.279602
      vertex 52.426407 32.426407 18.100025
      vertex 86.694069 32.426407 15.247287
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.946426 32.426407 12.282307
      vertex 86.694069 32.426407 12.314621
      vertex 70.010086 32.426407 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 70.004684 32.426407 13.653746
      vertex 86.946426 32.426407 12.282307
      vertex 70.010086 32.426407 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.961685 32.426407 13.402987
      vertex 86.946426 32.426407 12.282307
      vertex 70.004684 32.426407 13.653746
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 68.194069 32.426407 15.247287
      vertex 68.446426 32.426407 15.279602
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.700615 32.426407 15.268805
      vertex 52.426407 32.426407 18.100025
      vertex 68.446426 32.426407 15.279602
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.531670 32.426407 14.034455
      vertex 52.426407 32.426407 18.100025
      vertex 68.700615 32.426407 15.268805
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.949318 32.426407 15.215205
      vertex 85.531670 32.426407 14.034455
      vertex 68.700615 32.426407 15.268805
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.185394 32.426407 15.120343
      vertex 85.531670 32.426407 14.034455
      vertex 68.949318 32.426407 15.215205
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 87.449318 32.426407 12.346704
      vertex 87.200615 32.426407 12.293104
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.946426 32.426407 12.282307
      vertex 116.426407 32.426407 11.100025
      vertex 87.200615 32.426407 12.293104
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.593018 32.426407 12.743047
      vertex 116.426407 32.426407 11.100025
      vertex 86.946426 32.426407 12.282307
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.752853 32.426407 12.940992
      vertex 69.593018 32.426407 12.743047
      vertex 86.946426 32.426407 12.282307
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 70.010086 32.426407 13.780954
      vertex 85.595772 32.426407 13.281245
      vertex 85.531670 32.426407 13.527452
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 85.510094 32.426407 13.780954
      vertex 70.010086 32.426407 13.780954
      vertex 85.531670 32.426407 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 70.004684 32.426407 13.908163
      vertex 70.010086 32.426407 13.780954
      vertex 85.510094 32.426407 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.531670 32.426407 14.034455
      vertex 70.004684 32.426407 13.908163
      vertex 85.510094 32.426407 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.961685 32.426407 14.158921
      vertex 70.004684 32.426407 13.908163
      vertex 85.531670 32.426407 14.034455
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 69.876930 32.426407 14.398806
      vertex 69.961685 32.426407 14.158921
      vertex 85.531670 32.426407 14.034455
    endloop
  endfacet
  facet normal -0.707107 -0.707106 0.000000
    outer loop
      vertex 137.639618 11.213205 2.000025
      vertex 144.710678 4.142136 0.000025
      vertex 144.710678 4.142136 2.000025
    endloop
  endfacet
  facet normal -0.707107 -0.707106 0.000000
    outer loop
      vertex 137.639618 11.213205 11.100025
      vertex 144.710678 4.142136 11.100025
      vertex 144.710678 4.142136 18.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 -0.000001
    outer loop
      vertex 123.318535 25.534269 18.100025
      vertex 137.639618 11.213205 11.100025
      vertex 144.710678 4.142136 18.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707106 -0.000004
    outer loop
      vertex 137.639618 11.213205 11.100025
      vertex 123.318535 25.534269 18.100025
      vertex 116.426407 32.426407 18.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 116.426407 32.426407 18.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 137.639618 11.213205 2.000025
      vertex 137.639618 11.213205 11.100025
      vertex 116.426407 32.426407 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 116.426407 32.426407 0.000025
      vertex 137.639618 11.213205 2.000025
      vertex 116.426407 32.426407 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000003
    outer loop
      vertex 144.710678 4.142136 0.000025
      vertex 137.639618 11.213205 2.000025
      vertex 116.426407 32.426407 0.000025
    endloop
  endfacet
  facet normal -0.646300 -0.763083 0.000000
    outer loop
      vertex 146.493011 2.632573 11.100025
      vertex 144.710678 4.142136 18.100025
      vertex 144.710678 4.142136 11.100025
    endloop
  endfacet
  facet normal -0.646300 -0.763083 -0.000000
    outer loop
      vertex 146.493011 2.632573 18.100025
      vertex 144.710678 4.142136 18.100025
      vertex 146.493011 2.632573 11.100025
    endloop
  endfacet
  facet normal -0.511884 -0.859055 0.000000
    outer loop
      vertex 148.499496 1.436971 11.100025
      vertex 146.493011 2.632573 18.100025
      vertex 146.493011 2.632573 11.100025
    endloop
  endfacet
  facet normal -0.511884 -0.859055 -0.000000
    outer loop
      vertex 148.499496 1.436971 18.100025
      vertex 146.493011 2.632573 18.100025
      vertex 148.499496 1.436971 11.100025
    endloop
  endfacet
  facet normal -0.363508 -0.931591 0.000000
    outer loop
      vertex 150.675415 0.587925 11.100025
      vertex 148.499496 1.436971 18.100025
      vertex 148.499496 1.436971 11.100025
    endloop
  endfacet
  facet normal -0.363508 -0.931591 -0.000000
    outer loop
      vertex 150.675415 0.587925 18.100025
      vertex 148.499496 1.436971 18.100025
      vertex 150.675415 0.587925 11.100025
    endloop
  endfacet
  facet normal -0.205216 -0.978717 0.000000
    outer loop
      vertex 152.961411 0.108600 11.100025
      vertex 150.675415 0.587925 18.100025
      vertex 150.675415 0.587925 11.100025
    endloop
  endfacet
  facet normal -0.205216 -0.978717 -0.000000
    outer loop
      vertex 152.961411 0.108600 18.100025
      vertex 150.675415 0.587925 18.100025
      vertex 152.961411 0.108600 11.100025
    endloop
  endfacet
  facet normal -0.041325 -0.999146 0.000000
    outer loop
      vertex 155.295105 0.012077 11.100025
      vertex 152.961411 0.108600 18.100025
      vertex 152.961411 0.108600 11.100025
    endloop
  endfacet
  facet normal -0.041325 -0.999146 -0.000000
    outer loop
      vertex 155.295105 0.012077 18.100025
      vertex 152.961411 0.108600 18.100025
      vertex 155.295105 0.012077 11.100025
    endloop
  endfacet
  facet normal 0.123694 -0.992320 0.000000
    outer loop
      vertex 157.612854 0.300989 11.100025
      vertex 155.295105 0.012077 18.100025
      vertex 155.295105 0.012077 11.100025
    endloop
  endfacet
  facet normal 0.123694 -0.992320 0.000000
    outer loop
      vertex 157.612854 0.300989 18.100025
      vertex 155.295105 0.012077 18.100025
      vertex 157.612854 0.300989 11.100025
    endloop
  endfacet
  facet normal 0.285337 -0.958427 0.000000
    outer loop
      vertex 159.851456 0.967450 11.100025
      vertex 157.612854 0.300989 18.100025
      vertex 157.612854 0.300989 11.100025
    endloop
  endfacet
  facet normal 0.285337 -0.958427 0.000000
    outer loop
      vertex 159.851456 0.967450 18.100025
      vertex 157.612854 0.300989 18.100025
      vertex 159.851456 0.967450 11.100025
    endloop
  endfacet
  facet normal 0.439194 -0.898392 0.000000
    outer loop
      vertex 161.949829 1.993276 11.100025
      vertex 159.851456 0.967450 18.100025
      vertex 159.851456 0.967450 11.100025
    endloop
  endfacet
  facet normal 0.439194 -0.898392 0.000000
    outer loop
      vertex 161.949829 1.993276 18.100025
      vertex 159.851456 0.967450 18.100025
      vertex 161.949829 1.993276 11.100025
    endloop
  endfacet
  facet normal 0.581079 -0.813847 0.000000
    outer loop
      vertex 163.850723 3.350496 11.100025
      vertex 161.949829 1.993276 18.100025
      vertex 161.949829 1.993276 11.100025
    endloop
  endfacet
  facet normal 0.581079 -0.813847 0.000000
    outer loop
      vertex 163.850723 3.350496 18.100025
      vertex 161.949829 1.993276 18.100025
      vertex 163.850723 3.350496 11.100025
    endloop
  endfacet
  facet normal 0.707108 -0.707106 0.000000
    outer loop
      vertex 165.502304 5.002081 11.100025
      vertex 163.850723 3.350496 18.100025
      vertex 163.850723 3.350496 11.100025
    endloop
  endfacet
  facet normal 0.707108 -0.707106 0.000000
    outer loop
      vertex 165.502304 5.002081 18.100025
      vertex 163.850723 3.350496 18.100025
      vertex 165.502304 5.002081 11.100025
    endloop
  endfacet
  facet normal 0.813845 -0.581082 0.000000
    outer loop
      vertex 166.859543 6.902985 11.100025
      vertex 165.502304 5.002081 18.100025
      vertex 165.502304 5.002081 11.100025
    endloop
  endfacet
  facet normal 0.813845 -0.581082 0.000000
    outer loop
      vertex 166.859543 6.902985 18.100025
      vertex 165.502304 5.002081 18.100025
      vertex 166.859543 6.902985 11.100025
    endloop
  endfacet
  facet normal 0.898394 -0.439192 0.000000
    outer loop
      vertex 167.885361 9.001359 11.100025
      vertex 166.859543 6.902985 18.100025
      vertex 166.859543 6.902985 11.100025
    endloop
  endfacet
  facet normal 0.898394 -0.439192 0.000000
    outer loop
      vertex 167.885361 9.001359 18.100025
      vertex 166.859543 6.902985 18.100025
      vertex 167.885361 9.001359 11.100025
    endloop
  endfacet
  facet normal 0.958426 -0.285342 0.000000
    outer loop
      vertex 168.551834 11.239953 11.100025
      vertex 167.885361 9.001359 18.100025
      vertex 167.885361 9.001359 11.100025
    endloop
  endfacet
  facet normal 0.958426 -0.285342 0.000000
    outer loop
      vertex 168.551834 11.239953 18.100025
      vertex 167.885361 9.001359 18.100025
      vertex 168.551834 11.239953 11.100025
    endloop
  endfacet
  facet normal 0.992321 -0.123687 0.000000
    outer loop
      vertex 168.840729 13.557710 11.100025
      vertex 168.551834 11.239953 18.100025
      vertex 168.551834 11.239953 11.100025
    endloop
  endfacet
  facet normal 0.992321 -0.123687 0.000000
    outer loop
      vertex 168.840729 13.557710 18.100025
      vertex 168.551834 11.239953 18.100025
      vertex 168.840729 13.557710 11.100025
    endloop
  endfacet
  facet normal 0.999146 0.041327 0.000000
    outer loop
      vertex 168.744202 15.891414 11.100025
      vertex 168.840729 13.557710 18.100025
      vertex 168.840729 13.557710 11.100025
    endloop
  endfacet
  facet normal 0.999146 0.041327 0.000000
    outer loop
      vertex 168.744202 15.891414 18.100025
      vertex 168.840729 13.557710 18.100025
      vertex 168.744202 15.891414 11.100025
    endloop
  endfacet
  facet normal 0.978718 0.205211 0.000000
    outer loop
      vertex 168.264893 18.177397 11.100025
      vertex 168.744202 15.891414 18.100025
      vertex 168.744202 15.891414 11.100025
    endloop
  endfacet
  facet normal 0.978718 0.205211 0.000000
    outer loop
      vertex 168.264893 18.177397 18.100025
      vertex 168.744202 15.891414 18.100025
      vertex 168.264893 18.177397 11.100025
    endloop
  endfacet
  facet normal 0.931591 0.363508 0.000000
    outer loop
      vertex 167.415848 20.353313 11.100025
      vertex 168.264893 18.177397 18.100025
      vertex 168.264893 18.177397 11.100025
    endloop
  endfacet
  facet normal 0.931591 0.363508 0.000000
    outer loop
      vertex 167.415848 20.353313 18.100025
      vertex 168.264893 18.177397 18.100025
      vertex 167.415848 20.353313 11.100025
    endloop
  endfacet
  facet normal 0.859052 0.511888 0.000000
    outer loop
      vertex 166.220230 22.359804 11.100025
      vertex 167.415848 20.353313 18.100025
      vertex 167.415848 20.353313 11.100025
    endloop
  endfacet
  facet normal 0.859052 0.511888 0.000000
    outer loop
      vertex 166.220230 22.359804 18.100025
      vertex 167.415848 20.353313 18.100025
      vertex 166.220230 22.359804 11.100025
    endloop
  endfacet
  facet normal 0.763085 0.646298 0.000000
    outer loop
      vertex 164.710678 24.142136 11.100025
      vertex 166.220230 22.359804 18.100025
      vertex 166.220230 22.359804 11.100025
    endloop
  endfacet
  facet normal 0.763085 0.646298 0.000000
    outer loop
      vertex 164.710678 24.142136 18.100025
      vertex 166.220230 22.359804 18.100025
      vertex 164.710678 24.142136 11.100025
    endloop
  endfacet
  facet normal 0.707106 0.707107 -0.000000
    outer loop
      vertex 164.710678 24.142136 0.000025
      vertex 157.639603 31.213202 2.000025
      vertex 164.710678 24.142136 2.000025
    endloop
  endfacet
  facet normal 0.707106 0.707107 0.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 164.710678 24.142136 18.100025
      vertex 164.710678 24.142136 11.100025
    endloop
  endfacet
  facet normal 0.707106 0.707107 0.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 163.318542 25.534269 18.100025
      vertex 164.710678 24.142136 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000003
    outer loop
      vertex 157.639603 31.213202 2.000025
      vertex 164.710678 24.142136 0.000025
      vertex 136.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000000
    outer loop
      vertex 136.426407 52.426407 11.100025
      vertex 157.639603 31.213202 2.000025
      vertex 136.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 157.639603 31.213202 2.000025
      vertex 136.426407 52.426407 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 157.639603 31.213202 11.100025
      vertex 136.426407 52.426407 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000001
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 157.639603 31.213202 11.100025
      vertex 136.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 -0.000000
    outer loop
      vertex 136.426407 66.426407 11.100025
      vertex 136.426407 66.426407 18.100025
      vertex 136.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 136.426407 52.426407 11.100025
      vertex 136.426407 66.426407 11.100025
      vertex 136.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal 0.707106 -0.707107 0.000000
    outer loop
      vertex 164.710678 94.710678 18.100025
      vertex 157.639603 87.639610 11.100025
      vertex 164.710678 94.710678 11.100025
    endloop
  endfacet
  facet normal 0.707106 -0.707107 0.000000
    outer loop
      vertex 157.639603 87.639610 2.000025
      vertex 164.710678 94.710678 0.000025
      vertex 164.710678 94.710678 2.000025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 -0.000001
    outer loop
      vertex 157.639603 87.639610 11.100025
      vertex 164.710678 94.710678 18.100025
      vertex 136.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 136.426407 66.426407 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 136.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 157.639603 87.639610 2.000025
      vertex 157.639603 87.639610 11.100025
      vertex 136.426407 66.426407 11.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 136.426407 66.426407 0.000025
      vertex 157.639603 87.639610 2.000025
      vertex 136.426407 66.426407 11.100025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000003
    outer loop
      vertex 164.710678 94.710678 0.000025
      vertex 157.639603 87.639610 2.000025
      vertex 136.426407 66.426407 0.000025
    endloop
  endfacet
  facet normal 0.763084 -0.646299 0.000000
    outer loop
      vertex 166.220230 96.493004 11.100025
      vertex 164.710678 94.710678 18.100025
      vertex 164.710678 94.710678 11.100025
    endloop
  endfacet
  facet normal 0.763084 -0.646299 0.000000
    outer loop
      vertex 166.220230 96.493004 18.100025
      vertex 164.710678 94.710678 18.100025
      vertex 166.220230 96.493004 11.100025
    endloop
  endfacet
  facet normal 0.859053 -0.511887 0.000000
    outer loop
      vertex 167.415848 98.499496 11.100025
      vertex 166.220230 96.493004 18.100025
      vertex 166.220230 96.493004 11.100025
    endloop
  endfacet
  facet normal 0.859053 -0.511887 0.000000
    outer loop
      vertex 167.415848 98.499496 18.100025
      vertex 166.220230 96.493004 18.100025
      vertex 167.415848 98.499496 11.100025
    endloop
  endfacet
  facet normal 0.931591 -0.363507 0.000000
    outer loop
      vertex 168.264893 100.675415 11.100025
      vertex 167.415848 98.499496 18.100025
      vertex 167.415848 98.499496 11.100025
    endloop
  endfacet
  facet normal 0.931591 -0.363507 0.000000
    outer loop
      vertex 168.264893 100.675415 18.100025
      vertex 167.415848 98.499496 18.100025
      vertex 168.264893 100.675415 11.100025
    endloop
  endfacet
  facet normal 0.978718 -0.205211 0.000000
    outer loop
      vertex 168.744202 102.961395 11.100025
      vertex 168.264893 100.675415 18.100025
      vertex 168.264893 100.675415 11.100025
    endloop
  endfacet
  facet normal 0.978718 -0.205211 0.000000
    outer loop
      vertex 168.744202 102.961395 18.100025
      vertex 168.264893 100.675415 18.100025
      vertex 168.744202 102.961395 11.100025
    endloop
  endfacet
  facet normal 0.999146 -0.041327 0.000000
    outer loop
      vertex 168.840729 105.295097 11.100025
      vertex 168.744202 102.961395 18.100025
      vertex 168.744202 102.961395 11.100025
    endloop
  endfacet
  facet normal 0.999146 -0.041327 0.000000
    outer loop
      vertex 168.840729 105.295097 18.100025
      vertex 168.744202 102.961395 18.100025
      vertex 168.840729 105.295097 11.100025
    endloop
  endfacet
  facet normal 0.992321 0.123687 0.000000
    outer loop
      vertex 168.551834 107.612862 11.100025
      vertex 168.840729 105.295097 18.100025
      vertex 168.840729 105.295097 11.100025
    endloop
  endfacet
  facet normal 0.992321 0.123687 0.000000
    outer loop
      vertex 168.551834 107.612862 18.100025
      vertex 168.840729 105.295097 18.100025
      vertex 168.551834 107.612862 11.100025
    endloop
  endfacet
  facet normal 0.958426 0.285342 0.000000
    outer loop
      vertex 167.885361 109.851456 11.100025
      vertex 168.551834 107.612862 18.100025
      vertex 168.551834 107.612862 11.100025
    endloop
  endfacet
  facet normal 0.958426 0.285342 0.000000
    outer loop
      vertex 167.885361 109.851456 18.100025
      vertex 168.551834 107.612862 18.100025
      vertex 167.885361 109.851456 11.100025
    endloop
  endfacet
  facet normal 0.898393 0.439193 0.000000
    outer loop
      vertex 166.859543 111.949821 11.100025
      vertex 167.885361 109.851456 18.100025
      vertex 167.885361 109.851456 11.100025
    endloop
  endfacet
  facet normal 0.898393 0.439193 0.000000
    outer loop
      vertex 166.859543 111.949821 18.100025
      vertex 167.885361 109.851456 18.100025
      vertex 166.859543 111.949821 11.100025
    endloop
  endfacet
  facet normal 0.813846 0.581081 0.000000
    outer loop
      vertex 165.502304 113.850731 11.100025
      vertex 166.859543 111.949821 18.100025
      vertex 166.859543 111.949821 11.100025
    endloop
  endfacet
  facet normal 0.813846 0.581081 0.000000
    outer loop
      vertex 165.502304 113.850731 18.100025
      vertex 166.859543 111.949821 18.100025
      vertex 165.502304 113.850731 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000000
    outer loop
      vertex 163.850723 115.502312 11.100025
      vertex 165.502304 113.850731 18.100025
      vertex 165.502304 113.850731 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000000
    outer loop
      vertex 163.850723 115.502312 18.100025
      vertex 165.502304 113.850731 18.100025
      vertex 163.850723 115.502312 11.100025
    endloop
  endfacet
  facet normal 0.581080 0.813846 0.000000
    outer loop
      vertex 161.949829 116.859535 11.100025
      vertex 163.850723 115.502312 18.100025
      vertex 163.850723 115.502312 11.100025
    endloop
  endfacet
  facet normal 0.581080 0.813846 0.000000
    outer loop
      vertex 161.949829 116.859535 18.100025
      vertex 163.850723 115.502312 18.100025
      vertex 161.949829 116.859535 11.100025
    endloop
  endfacet
  facet normal 0.439197 0.898391 0.000000
    outer loop
      vertex 159.851456 117.885368 11.100025
      vertex 161.949829 116.859535 18.100025
      vertex 161.949829 116.859535 11.100025
    endloop
  endfacet
  facet normal 0.439197 0.898391 0.000000
    outer loop
      vertex 159.851456 117.885368 18.100025
      vertex 161.949829 116.859535 18.100025
      vertex 159.851456 117.885368 11.100025
    endloop
  endfacet
  facet normal 0.285332 0.958429 0.000000
    outer loop
      vertex 157.612854 118.551819 11.100025
      vertex 159.851456 117.885368 18.100025
      vertex 159.851456 117.885368 11.100025
    endloop
  endfacet
  facet normal 0.285332 0.958429 0.000000
    outer loop
      vertex 157.612854 118.551819 18.100025
      vertex 159.851456 117.885368 18.100025
      vertex 157.612854 118.551819 11.100025
    endloop
  endfacet
  facet normal 0.123694 0.992320 0.000000
    outer loop
      vertex 155.295105 118.840729 11.100025
      vertex 157.612854 118.551819 18.100025
      vertex 157.612854 118.551819 11.100025
    endloop
  endfacet
  facet normal 0.123694 0.992320 0.000000
    outer loop
      vertex 155.295105 118.840729 18.100025
      vertex 157.612854 118.551819 18.100025
      vertex 155.295105 118.840729 11.100025
    endloop
  endfacet
  facet normal -0.041324 0.999146 0.000000
    outer loop
      vertex 152.961411 118.744209 11.100025
      vertex 155.295105 118.840729 18.100025
      vertex 155.295105 118.840729 11.100025
    endloop
  endfacet
  facet normal -0.041324 0.999146 0.000000
    outer loop
      vertex 152.961411 118.744209 18.100025
      vertex 155.295105 118.840729 18.100025
      vertex 152.961411 118.744209 11.100025
    endloop
  endfacet
  facet normal -0.205216 0.978717 0.000000
    outer loop
      vertex 150.675415 118.264885 11.100025
      vertex 152.961411 118.744209 18.100025
      vertex 152.961411 118.744209 11.100025
    endloop
  endfacet
  facet normal -0.205216 0.978717 0.000000
    outer loop
      vertex 150.675415 118.264885 18.100025
      vertex 152.961411 118.744209 18.100025
      vertex 150.675415 118.264885 11.100025
    endloop
  endfacet
  facet normal -0.363505 0.931592 0.000000
    outer loop
      vertex 148.499496 117.415848 11.100025
      vertex 150.675415 118.264885 18.100025
      vertex 150.675415 118.264885 11.100025
    endloop
  endfacet
  facet normal -0.363505 0.931592 0.000000
    outer loop
      vertex 148.499496 117.415848 18.100025
      vertex 150.675415 118.264885 18.100025
      vertex 148.499496 117.415848 11.100025
    endloop
  endfacet
  facet normal -0.511886 0.859053 0.000000
    outer loop
      vertex 146.493011 116.220238 11.100025
      vertex 148.499496 117.415848 18.100025
      vertex 148.499496 117.415848 11.100025
    endloop
  endfacet
  facet normal -0.511886 0.859053 0.000000
    outer loop
      vertex 146.493011 116.220238 18.100025
      vertex 148.499496 117.415848 18.100025
      vertex 146.493011 116.220238 11.100025
    endloop
  endfacet
  facet normal -0.646301 0.763082 0.000000
    outer loop
      vertex 144.710678 114.710670 11.100025
      vertex 146.493011 116.220238 18.100025
      vertex 146.493011 116.220238 11.100025
    endloop
  endfacet
  facet normal -0.646301 0.763082 0.000000
    outer loop
      vertex 144.710678 114.710670 18.100025
      vertex 146.493011 116.220238 18.100025
      vertex 144.710678 114.710670 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 144.710678 114.710670 0.000025
      vertex 137.639618 107.639610 2.000025
      vertex 144.710678 114.710670 2.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 137.639618 107.639610 11.100025
      vertex 144.710678 114.710670 18.100025
      vertex 144.710678 114.710670 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000001
    outer loop
      vertex 137.639618 107.639610 2.000025
      vertex 144.710678 114.710670 0.000025
      vertex 116.426407 86.426407 0.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 137.639618 107.639610 2.000025
      vertex 116.426407 86.426407 0.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 137.639618 107.639610 11.100025
      vertex 137.639618 107.639610 2.000025
      vertex 116.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 137.639618 107.639610 11.100025
      vertex 116.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal -0.707107 0.707107 -0.000000
    outer loop
      vertex 144.710678 114.710670 18.100025
      vertex 137.639618 107.639610 11.100025
      vertex 116.426407 86.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 67.563721 86.426407 15.828164
      vertex 67.447914 86.426407 15.620861
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 67.447914 86.426407 15.620861
      vertex 67.368805 86.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 67.328674 86.426407 15.162928
      vertex 52.426407 86.426407 18.100025
      vertex 67.368805 86.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 11.100025
      vertex 52.426407 86.426407 18.100025
      vertex 67.328674 86.426407 15.162928
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 67.328674 86.426407 14.925471
      vertex 52.426407 86.426407 11.100025
      vertex 67.328674 86.426407 15.162928
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 67.368805 86.426407 14.691431
      vertex 52.426407 86.426407 11.100025
      vertex 67.328674 86.426407 14.925471
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.812881 86.426407 15.923709
      vertex 90.582710 86.426407 15.162928
      vertex 69.945854 86.426407 15.726973
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 69.245636 86.426407 13.745155
      vertex 69.457664 86.426407 13.852060
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 69.457664 86.426407 13.852060
      vertex 69.648582 86.426407 13.993258
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.812881 86.426407 14.164692
      vertex 116.426407 86.426407 11.100025
      vertex 69.648582 86.426407 13.993258
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.945854 86.426407 14.361427
      vertex 116.426407 86.426407 11.100025
      vertex 69.812881 86.426407 14.164692
    endloop
  endfacet
  facet normal -0.000000 1.000000 -0.000000
    outer loop
      vertex 70.043663 86.426407 15.510596
      vertex 69.945854 86.426407 15.726973
      vertex 90.582710 86.426407 15.162928
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.582710 86.426407 15.162928
      vertex 69.812881 86.426407 15.923709
      vertex 69.648582 86.426407 16.095140
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.457664 86.426407 16.236341
      vertex 90.582710 86.426407 15.162928
      vertex 69.648582 86.426407 16.095140
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.245636 86.426407 16.343245
      vertex 90.582710 86.426407 15.162928
      vertex 69.457664 86.426407 16.236341
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 68.313683 86.426407 16.382833
      vertex 68.093346 86.426407 16.294296
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 11.100025
      vertex 67.368805 86.426407 14.691431
      vertex 67.447914 86.426407 14.467538
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 67.563721 86.426407 14.260235
      vertex 52.426407 86.426407 11.100025
      vertex 67.447914 86.426407 14.467538
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 67.712898 86.426407 14.075486
      vertex 52.426407 86.426407 11.100025
      vertex 67.563721 86.426407 14.260235
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 11.100025
      vertex 67.712898 86.426407 14.075486
      vertex 67.891151 86.426407 13.918604
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.093346 86.426407 13.794104
      vertex 52.426407 86.426407 11.100025
      vertex 67.891151 86.426407 13.918604
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.313683 86.426407 13.705566
      vertex 52.426407 86.426407 11.100025
      vertex 68.093346 86.426407 13.794104
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 92.037086 86.426407 13.645462
      vertex 92.272621 86.426407 13.675623
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 91.567719 86.426407 16.382833
      vertex 91.347389 86.426407 16.294296
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 91.347389 86.426407 16.294296
      vertex 91.145187 86.426407 16.169796
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 90.966934 86.426407 16.012915
      vertex 52.426407 86.426407 18.100025
      vertex 91.145187 86.426407 16.169796
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 90.817757 86.426407 15.828164
      vertex 52.426407 86.426407 18.100025
      vertex 90.966934 86.426407 16.012915
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 90.817757 86.426407 15.828164
      vertex 90.701950 86.426407 15.620861
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 90.622841 86.426407 15.396970
      vertex 52.426407 86.426407 18.100025
      vertex 90.701950 86.426407 15.620861
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 90.582710 86.426407 15.162928
      vertex 52.426407 86.426407 18.100025
      vertex 90.622841 86.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 68.093346 86.426407 16.294296
      vertex 67.891151 86.426407 16.169796
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 67.712898 86.426407 16.012915
      vertex 52.426407 86.426407 18.100025
      vertex 67.891151 86.426407 16.169796
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 67.563721 86.426407 15.828164
      vertex 52.426407 86.426407 18.100025
      vertex 67.712898 86.426407 16.012915
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.357536 86.426407 14.807599
      vertex 116.426407 86.426407 11.100025
      vertex 93.297699 86.426407 14.577805
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.799850 86.426407 13.655540
      vertex 92.037086 86.426407 13.645462
      vertex 116.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.945854 86.426407 14.361427
      vertex 91.799850 86.426407 13.655540
      vertex 116.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.567719 86.426407 13.705566
      vertex 91.799850 86.426407 13.655540
      vertex 69.945854 86.426407 14.361427
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 92.272621 86.426407 13.675623
      vertex 92.499672 86.426407 13.745155
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 92.711700 86.426407 13.852060
      vertex 116.426407 86.426407 11.100025
      vertex 92.499672 86.426407 13.745155
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 92.902618 86.426407 13.993258
      vertex 116.426407 86.426407 11.100025
      vertex 92.711700 86.426407 13.852060
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 116.426407 86.426407 11.100025
      vertex 93.357536 86.426407 14.807599
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 93.377670 86.426407 15.044200
      vertex 116.426407 86.426407 18.100025
      vertex 93.357536 86.426407 14.807599
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 93.357536 86.426407 15.280802
      vertex 116.426407 86.426407 18.100025
      vertex 93.377670 86.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 93.357536 86.426407 15.280802
      vertex 93.297699 86.426407 15.510596
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 93.199890 86.426407 15.726973
      vertex 116.426407 86.426407 18.100025
      vertex 93.297699 86.426407 15.510596
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 93.066925 86.426407 15.923709
      vertex 116.426407 86.426407 18.100025
      vertex 93.199890 86.426407 15.726973
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 11.100025
      vertex 68.313683 86.426407 13.705566
      vertex 68.545807 86.426407 13.655540
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.783051 86.426407 13.645462
      vertex 52.426407 86.426407 11.100025
      vertex 68.545807 86.426407 13.655540
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 52.426407 86.426407 11.100025
      vertex 68.783051 86.426407 13.645462
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.018585 86.426407 13.675623
      vertex 116.426407 86.426407 11.100025
      vertex 68.783051 86.426407 13.645462
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.245636 86.426407 13.745155
      vertex 116.426407 86.426407 11.100025
      vertex 69.018585 86.426407 13.675623
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.622841 86.426407 14.691431
      vertex 69.945854 86.426407 14.361427
      vertex 70.043663 86.426407 14.577805
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 70.103493 86.426407 14.807599
      vertex 90.622841 86.426407 14.691431
      vertex 70.043663 86.426407 14.577805
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.582710 86.426407 14.925471
      vertex 90.622841 86.426407 14.691431
      vertex 70.103493 86.426407 14.807599
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 70.123634 86.426407 15.044200
      vertex 90.582710 86.426407 14.925471
      vertex 70.103493 86.426407 14.807599
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.582710 86.426407 15.162928
      vertex 90.582710 86.426407 14.925471
      vertex 70.123634 86.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 70.103493 86.426407 15.280802
      vertex 90.582710 86.426407 15.162928
      vertex 70.123634 86.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 70.043663 86.426407 15.510596
      vertex 90.582710 86.426407 15.162928
      vertex 70.103493 86.426407 15.280802
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 92.902618 86.426407 13.993258
      vertex 93.066925 86.426407 14.164692
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.199890 86.426407 14.361427
      vertex 116.426407 86.426407 11.100025
      vertex 93.066925 86.426407 14.164692
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.297699 86.426407 14.577805
      vertex 116.426407 86.426407 11.100025
      vertex 93.199890 86.426407 14.361427
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 93.066925 86.426407 15.923709
      vertex 92.902618 86.426407 16.095140
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 92.711700 86.426407 16.236341
      vertex 116.426407 86.426407 18.100025
      vertex 92.902618 86.426407 16.095140
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 92.499672 86.426407 16.343245
      vertex 116.426407 86.426407 18.100025
      vertex 92.711700 86.426407 16.236341
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 92.499672 86.426407 16.343245
      vertex 92.272621 86.426407 16.412777
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 92.037086 86.426407 16.442940
      vertex 116.426407 86.426407 18.100025
      vertex 92.272621 86.426407 16.412777
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 92.037086 86.426407 16.442940
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 91.799850 86.426407 16.432861
      vertex 52.426407 86.426407 18.100025
      vertex 92.037086 86.426407 16.442940
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 91.567719 86.426407 16.382833
      vertex 52.426407 86.426407 18.100025
      vertex 91.799850 86.426407 16.432861
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.582710 86.426407 15.162928
      vertex 69.245636 86.426407 16.343245
      vertex 69.018585 86.426407 16.412777
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.783051 86.426407 16.442940
      vertex 90.582710 86.426407 15.162928
      vertex 69.018585 86.426407 16.412777
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 90.582710 86.426407 15.162928
      vertex 68.783051 86.426407 16.442940
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 68.545807 86.426407 16.432861
      vertex 52.426407 86.426407 18.100025
      vertex 68.783051 86.426407 16.442940
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 68.313683 86.426407 16.382833
      vertex 52.426407 86.426407 18.100025
      vertex 68.545807 86.426407 16.432861
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.945854 86.426407 14.361427
      vertex 90.622841 86.426407 14.691431
      vertex 90.701950 86.426407 14.467538
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.817757 86.426407 14.260235
      vertex 69.945854 86.426407 14.361427
      vertex 90.701950 86.426407 14.467538
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.966934 86.426407 14.075486
      vertex 69.945854 86.426407 14.361427
      vertex 90.817757 86.426407 14.260235
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.945854 86.426407 14.361427
      vertex 90.966934 86.426407 14.075486
      vertex 91.145187 86.426407 13.918604
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.347389 86.426407 13.794104
      vertex 69.945854 86.426407 14.361427
      vertex 91.145187 86.426407 13.918604
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.567719 86.426407 13.705566
      vertex 69.945854 86.426407 14.361427
      vertex 91.347389 86.426407 13.794104
    endloop
  endfacet
  facet normal 0.707106 0.707107 0.000000
    outer loop
      vertex 31.213202 107.639610 2.000025
      vertex 24.142132 114.710670 0.000025
      vertex 24.142132 114.710670 2.000025
    endloop
  endfacet
  facet normal 0.707106 0.707107 -0.000001
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 31.213202 107.639610 11.100025
      vertex 24.142132 114.710670 11.100025
    endloop
  endfacet
  facet normal 0.707104 0.707110 0.000000
    outer loop
      vertex 24.142132 114.710670 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 24.142132 114.710670 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000000
    outer loop
      vertex 31.213202 107.639610 11.100025
      vertex 25.534271 113.318542 18.100025
      vertex 52.426407 86.426407 18.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000000
    outer loop
      vertex 52.426407 86.426407 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 52.426407 86.426407 18.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000000
    outer loop
      vertex 31.213202 107.639610 2.000025
      vertex 31.213202 107.639610 11.100025
      vertex 52.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000000
    outer loop
      vertex 52.426407 86.426407 0.000025
      vertex 31.213202 107.639610 2.000025
      vertex 52.426407 86.426407 11.100025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000002
    outer loop
      vertex 24.142132 114.710670 0.000025
      vertex 31.213202 107.639610 2.000025
      vertex 52.426407 86.426407 0.000025
    endloop
  endfacet
  facet normal 0.646302 0.763081 0.000000
    outer loop
      vertex 22.359804 116.220238 11.100025
      vertex 24.142132 114.710670 18.100025
      vertex 24.142132 114.710670 11.100025
    endloop
  endfacet
  facet normal 0.646302 0.763081 0.000000
    outer loop
      vertex 22.359804 116.220238 18.100025
      vertex 24.142132 114.710670 18.100025
      vertex 22.359804 116.220238 11.100025
    endloop
  endfacet
  facet normal 0.511885 0.859054 0.000000
    outer loop
      vertex 20.353310 117.415848 11.100025
      vertex 22.359804 116.220238 18.100025
      vertex 22.359804 116.220238 11.100025
    endloop
  endfacet
  facet normal 0.511885 0.859054 0.000000
    outer loop
      vertex 20.353310 117.415848 18.100025
      vertex 22.359804 116.220238 18.100025
      vertex 20.353310 117.415848 11.100025
    endloop
  endfacet
  facet normal 0.363505 0.931592 0.000000
    outer loop
      vertex 18.177397 118.264885 11.100025
      vertex 20.353310 117.415848 18.100025
      vertex 20.353310 117.415848 11.100025
    endloop
  endfacet
  facet normal 0.363505 0.931592 0.000000
    outer loop
      vertex 18.177397 118.264885 18.100025
      vertex 20.353310 117.415848 18.100025
      vertex 18.177397 118.264885 11.100025
    endloop
  endfacet
  facet normal 0.205217 0.978716 0.000000
    outer loop
      vertex 15.891411 118.744209 11.100025
      vertex 18.177397 118.264885 18.100025
      vertex 18.177397 118.264885 11.100025
    endloop
  endfacet
  facet normal 0.205217 0.978716 0.000000
    outer loop
      vertex 15.891411 118.744209 18.100025
      vertex 18.177397 118.264885 18.100025
      vertex 15.891411 118.744209 11.100025
    endloop
  endfacet
  facet normal 0.041324 0.999146 0.000000
    outer loop
      vertex 13.557710 118.840729 11.100025
      vertex 15.891411 118.744209 18.100025
      vertex 15.891411 118.744209 11.100025
    endloop
  endfacet
  facet normal 0.041324 0.999146 0.000000
    outer loop
      vertex 13.557710 118.840729 18.100025
      vertex 15.891411 118.744209 18.100025
      vertex 13.557710 118.840729 11.100025
    endloop
  endfacet
  facet normal -0.123693 0.992320 0.000000
    outer loop
      vertex 11.239953 118.551819 11.100025
      vertex 13.557710 118.840729 18.100025
      vertex 13.557710 118.840729 11.100025
    endloop
  endfacet
  facet normal -0.123693 0.992320 0.000000
    outer loop
      vertex 11.239953 118.551819 18.100025
      vertex 13.557710 118.840729 18.100025
      vertex 11.239953 118.551819 11.100025
    endloop
  endfacet
  facet normal -0.285333 0.958428 0.000000
    outer loop
      vertex 9.001359 117.885368 11.100025
      vertex 11.239953 118.551819 18.100025
      vertex 11.239953 118.551819 11.100025
    endloop
  endfacet
  facet normal -0.285333 0.958428 0.000000
    outer loop
      vertex 9.001359 117.885368 18.100025
      vertex 11.239953 118.551819 18.100025
      vertex 9.001359 117.885368 11.100025
    endloop
  endfacet
  facet normal -0.439197 0.898391 0.000000
    outer loop
      vertex 6.902985 116.859535 11.100025
      vertex 9.001359 117.885368 18.100025
      vertex 9.001359 117.885368 11.100025
    endloop
  endfacet
  facet normal -0.439197 0.898391 0.000000
    outer loop
      vertex 6.902985 116.859535 18.100025
      vertex 9.001359 117.885368 18.100025
      vertex 6.902985 116.859535 11.100025
    endloop
  endfacet
  facet normal -0.581078 0.813848 0.000000
    outer loop
      vertex 5.002081 115.502312 11.100025
      vertex 6.902985 116.859535 18.100025
      vertex 6.902985 116.859535 11.100025
    endloop
  endfacet
  facet normal -0.581078 0.813848 0.000000
    outer loop
      vertex 5.002081 115.502312 18.100025
      vertex 6.902985 116.859535 18.100025
      vertex 5.002081 115.502312 11.100025
    endloop
  endfacet
  facet normal -0.707106 0.707108 0.000000
    outer loop
      vertex 3.350496 113.850731 11.100025
      vertex 5.002081 115.502312 18.100025
      vertex 5.002081 115.502312 11.100025
    endloop
  endfacet
  facet normal -0.707106 0.707108 0.000000
    outer loop
      vertex 3.350496 113.850731 18.100025
      vertex 5.002081 115.502312 18.100025
      vertex 3.350496 113.850731 11.100025
    endloop
  endfacet
  facet normal -0.813849 0.581076 0.000000
    outer loop
      vertex 1.993276 111.949821 11.100025
      vertex 3.350496 113.850731 18.100025
      vertex 3.350496 113.850731 11.100025
    endloop
  endfacet
  facet normal -0.813849 0.581076 0.000000
    outer loop
      vertex 1.993276 111.949821 18.100025
      vertex 3.350496 113.850731 18.100025
      vertex 1.993276 111.949821 11.100025
    endloop
  endfacet
  facet normal -0.898391 0.439196 0.000000
    outer loop
      vertex 0.967450 109.851456 11.100025
      vertex 1.993276 111.949821 18.100025
      vertex 1.993276 111.949821 11.100025
    endloop
  endfacet
  facet normal -0.898391 0.439196 0.000000
    outer loop
      vertex 0.967450 109.851456 18.100025
      vertex 1.993276 111.949821 18.100025
      vertex 0.967450 109.851456 11.100025
    endloop
  endfacet
  facet normal -0.958427 0.285338 0.000000
    outer loop
      vertex 0.300989 107.612862 11.100025
      vertex 0.967450 109.851456 18.100025
      vertex 0.967450 109.851456 11.100025
    endloop
  endfacet
  facet normal -0.958427 0.285338 0.000000
    outer loop
      vertex 0.300989 107.612862 18.100025
      vertex 0.967450 109.851456 18.100025
      vertex 0.300989 107.612862 11.100025
    endloop
  endfacet
  facet normal -0.992321 0.123694 0.000000
    outer loop
      vertex 0.012077 105.295097 11.100025
      vertex 0.300989 107.612862 18.100025
      vertex 0.300989 107.612862 11.100025
    endloop
  endfacet
  facet normal -0.992321 0.123694 0.000000
    outer loop
      vertex 0.012077 105.295097 18.100025
      vertex 0.300989 107.612862 18.100025
      vertex 0.012077 105.295097 11.100025
    endloop
  endfacet
  facet normal -0.999146 -0.041325 0.000000
    outer loop
      vertex 0.108600 102.961395 11.100025
      vertex 0.012077 105.295097 18.100025
      vertex 0.012077 105.295097 11.100025
    endloop
  endfacet
  facet normal -0.999146 -0.041325 -0.000000
    outer loop
      vertex 0.108600 102.961395 18.100025
      vertex 0.012077 105.295097 18.100025
      vertex 0.108600 102.961395 11.100025
    endloop
  endfacet
  facet normal -0.978716 -0.205218 0.000000
    outer loop
      vertex 0.587925 100.675415 11.100025
      vertex 0.108600 102.961395 18.100025
      vertex 0.108600 102.961395 11.100025
    endloop
  endfacet
  facet normal -0.978716 -0.205218 -0.000000
    outer loop
      vertex 0.587925 100.675415 18.100025
      vertex 0.108600 102.961395 18.100025
      vertex 0.587925 100.675415 11.100025
    endloop
  endfacet
  facet normal -0.931591 -0.363508 0.000000
    outer loop
      vertex 1.436971 98.499496 11.100025
      vertex 0.587925 100.675415 18.100025
      vertex 0.587925 100.675415 11.100025
    endloop
  endfacet
  facet normal -0.931591 -0.363508 -0.000000
    outer loop
      vertex 1.436971 98.499496 18.100025
      vertex 0.587925 100.675415 18.100025
      vertex 1.436971 98.499496 11.100025
    endloop
  endfacet
  facet normal -0.859056 -0.511882 0.000000
    outer loop
      vertex 2.632573 96.493004 11.100025
      vertex 1.436971 98.499496 18.100025
      vertex 1.436971 98.499496 11.100025
    endloop
  endfacet
  facet normal -0.859056 -0.511882 -0.000000
    outer loop
      vertex 2.632573 96.493004 18.100025
      vertex 1.436971 98.499496 18.100025
      vertex 2.632573 96.493004 11.100025
    endloop
  endfacet
  facet normal -0.763082 -0.646302 0.000000
    outer loop
      vertex 4.142136 94.710678 11.100025
      vertex 2.632573 96.493004 18.100025
      vertex 2.632573 96.493004 11.100025
    endloop
  endfacet
  facet normal -0.763082 -0.646302 -0.000000
    outer loop
      vertex 4.142136 94.710678 18.100025
      vertex 2.632573 96.493004 18.100025
      vertex 4.142136 94.710678 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 4.142136 94.710678 18.100025
      vertex 4.142136 94.710678 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 -0.000001
    outer loop
      vertex 11.213205 87.639610 11.100025
      vertex 25.534271 73.318542 18.100025
      vertex 4.142136 94.710678 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 32.426407 66.426407 11.100025
      vertex 32.426407 66.426407 18.100025
      vertex 25.534271 73.318542 18.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 11.213205 87.639610 11.100025
      vertex 32.426407 66.426407 11.100025
      vertex 25.534271 73.318542 18.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 32.426407 66.426407 0.000025
      vertex 32.426407 66.426407 11.100025
      vertex 11.213205 87.639610 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 11.213205 87.639610 2.000025
      vertex 32.426407 66.426407 0.000025
      vertex 11.213205 87.639610 11.100025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000001
    outer loop
      vertex 4.142136 94.710678 0.000025
      vertex 32.426407 66.426407 0.000025
      vertex 11.213205 87.639610 2.000025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 -0.000000
    outer loop
      vertex 4.142136 94.710678 2.000025
      vertex 4.142136 94.710678 0.000025
      vertex 11.213205 87.639610 2.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 54.385723 84.426407 16.100025
      vertex 54.385723 82.426407 16.100025
      vertex 54.385723 82.426407 18.100025
    endloop
  endfacet
  facet normal -1.000000 -0.000000 -0.000000
    outer loop
      vertex 54.385723 84.426407 18.100025
      vertex 54.385723 84.426407 16.100025
      vertex 54.385723 82.426407 18.100025
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 130.426407 82.426407 18.100025
      vertex 54.385723 82.426407 18.100025
      vertex 54.385723 82.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 132.426407 82.426407 16.100025
      vertex 130.426407 82.426407 18.100025
      vertex 54.385723 82.426407 16.100025
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 132.426407 82.426407 18.100025
      vertex 130.426407 82.426407 18.100025
      vertex 132.426407 82.426407 16.100025
    endloop
  endfacet
  facet normal -1.000000 -0.000000 0.000000
    outer loop
      vertex 132.426407 38.426407 18.100025
      vertex 132.426407 36.426407 16.100025
      vertex 132.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 132.426407 82.426407 16.100025
      vertex 132.426407 36.426407 16.100025
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal -1.000000 -0.000000 -0.000000
    outer loop
      vertex 132.426407 80.426407 18.100025
      vertex 132.426407 82.426407 16.100025
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal -1.000000 -0.000000 -0.000000
    outer loop
      vertex 132.426407 82.426407 18.100025
      vertex 132.426407 82.426407 16.100025
      vertex 132.426407 80.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 38.426407 36.426407 18.100025
      vertex 36.426407 36.426407 16.100025
      vertex 36.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 132.426407 36.426407 16.100025
      vertex 36.426407 36.426407 16.100025
      vertex 38.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 130.426407 36.426407 18.100025
      vertex 132.426407 36.426407 16.100025
      vertex 38.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 132.426407 36.426407 18.100025
      vertex 132.426407 36.426407 16.100025
      vertex 130.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 -0.000000 0.000000
    outer loop
      vertex 36.426407 80.426407 18.100025
      vertex 36.426407 82.426407 16.100025
      vertex 36.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 36.426407 36.426407 16.100025
      vertex 36.426407 82.426407 16.100025
      vertex 36.426407 80.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 -0.000000 0.000000
    outer loop
      vertex 36.426407 38.426407 18.100025
      vertex 36.426407 36.426407 16.100025
      vertex 36.426407 80.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 -0.000000 0.000000
    outer loop
      vertex 36.426407 36.426407 18.100025
      vertex 36.426407 36.426407 16.100025
      vertex 36.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 36.426407 82.426407 16.100025
      vertex 42.391396 82.426407 16.100025
      vertex 42.391396 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 38.426407 82.426407 18.100025
      vertex 36.426407 82.426407 16.100025
      vertex 42.391396 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 36.426407 82.426407 18.100025
      vertex 36.426407 82.426407 16.100025
      vertex 38.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 -0.000000
    outer loop
      vertex 42.391396 84.426407 16.100025
      vertex 42.391396 84.426407 18.100025
      vertex 42.391396 82.426407 18.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 42.391396 82.426407 16.100025
      vertex 42.391396 84.426407 16.100025
      vertex 42.391396 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.996397 -0.084817 0.000000
    outer loop
      vertex 152.246643 14.564637 18.100025
      vertex 152.210678 14.142134 18.100025
      vertex 152.210678 14.142134 11.100025
    endloop
  endfacet
  facet normal 0.996397 -0.084817 0.000000
    outer loop
      vertex 152.246643 14.564637 11.100025
      vertex 152.246643 14.564637 18.100025
      vertex 152.210678 14.142134 11.100025
    endloop
  endfacet
  facet normal 0.967735 -0.251969 0.000000
    outer loop
      vertex 152.353485 14.974985 18.100025
      vertex 152.246643 14.564637 18.100025
      vertex 152.246643 14.564637 11.100025
    endloop
  endfacet
  facet normal 0.967735 -0.251969 0.000000
    outer loop
      vertex 152.353485 14.974985 11.100025
      vertex 152.353485 14.974985 18.100025
      vertex 152.246643 14.564637 11.100025
    endloop
  endfacet
  facet normal 0.911234 -0.411890 0.000000
    outer loop
      vertex 152.528137 15.361372 18.100025
      vertex 152.353485 14.974985 18.100025
      vertex 152.353485 14.974985 11.100025
    endloop
  endfacet
  facet normal 0.911234 -0.411890 0.000000
    outer loop
      vertex 152.528137 15.361372 11.100025
      vertex 152.528137 15.361372 18.100025
      vertex 152.353485 14.974985 11.100025
    endloop
  endfacet
  facet normal 0.828498 -0.559992 0.000000
    outer loop
      vertex 152.765594 15.712686 18.100025
      vertex 152.528137 15.361372 18.100025
      vertex 152.528137 15.361372 11.100025
    endloop
  endfacet
  facet normal 0.828498 -0.559992 0.000000
    outer loop
      vertex 152.765594 15.712686 11.100025
      vertex 152.765594 15.712686 18.100025
      vertex 152.528137 15.361372 11.100025
    endloop
  endfacet
  facet normal 0.721963 -0.691931 0.000000
    outer loop
      vertex 153.058990 16.018816 18.100025
      vertex 152.765594 15.712686 18.100025
      vertex 152.765594 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.721963 -0.691931 0.000000
    outer loop
      vertex 153.058990 16.018816 11.100025
      vertex 153.058990 16.018816 18.100025
      vertex 152.765594 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.594623 -0.804004 0.000000
    outer loop
      vertex 153.399918 16.270958 18.100025
      vertex 153.058990 16.018816 18.100025
      vertex 153.058990 16.018816 11.100025
    endloop
  endfacet
  facet normal 0.594623 -0.804004 0.000000
    outer loop
      vertex 153.399918 16.270958 11.100025
      vertex 153.399918 16.270958 18.100025
      vertex 153.058990 16.018816 11.100025
    endloop
  endfacet
  facet normal 0.450212 -0.892922 0.000000
    outer loop
      vertex 153.778534 16.461857 18.100025
      vertex 153.399918 16.270958 18.100025
      vertex 153.399918 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.450212 -0.892922 0.000000
    outer loop
      vertex 153.778534 16.461857 11.100025
      vertex 153.778534 16.461857 18.100025
      vertex 153.399918 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.292820 -0.956168 0.000000
    outer loop
      vertex 154.183990 16.586025 18.100025
      vertex 153.778534 16.461857 18.100025
      vertex 153.778534 16.461857 11.100025
    endloop
  endfacet
  facet normal 0.292820 -0.956168 0.000000
    outer loop
      vertex 154.183990 16.586025 11.100025
      vertex 154.183990 16.586025 18.100025
      vertex 153.778534 16.461857 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 154.604584 16.639881 18.100025
      vertex 154.183990 16.586025 18.100025
      vertex 154.183990 16.586025 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 154.604584 16.639881 11.100025
      vertex 154.604584 16.639881 18.100025
      vertex 154.183990 16.586025 11.100025
    endloop
  endfacet
  facet normal -0.042445 -0.999099 0.000000
    outer loop
      vertex 155.028229 16.621883 18.100025
      vertex 154.604584 16.639881 18.100025
      vertex 154.604584 16.639881 11.100025
    endloop
  endfacet
  facet normal -0.042445 -0.999099 0.000000
    outer loop
      vertex 155.028229 16.621883 11.100025
      vertex 155.028229 16.621883 18.100025
      vertex 154.604584 16.639881 11.100025
    endloop
  endfacet
  facet normal -0.210672 -0.977557 0.000000
    outer loop
      vertex 155.442749 16.532551 18.100025
      vertex 155.028229 16.621883 18.100025
      vertex 155.028229 16.621883 11.100025
    endloop
  endfacet
  facet normal -0.210672 -0.977557 0.000000
    outer loop
      vertex 155.442749 16.532551 11.100025
      vertex 155.442749 16.532551 18.100025
      vertex 155.028229 16.621883 11.100025
    endloop
  endfacet
  facet normal -0.372856 -0.927889 0.000000
    outer loop
      vertex 155.836197 16.374451 18.100025
      vertex 155.442749 16.532551 18.100025
      vertex 155.442749 16.532551 11.100025
    endloop
  endfacet
  facet normal -0.372856 -0.927889 0.000000
    outer loop
      vertex 155.836197 16.374451 11.100025
      vertex 155.836197 16.374451 18.100025
      vertex 155.442749 16.532551 11.100025
    endloop
  endfacet
  facet normal -0.524330 -0.851515 0.000000
    outer loop
      vertex 156.197250 16.152128 18.100025
      vertex 155.836197 16.374451 18.100025
      vertex 155.836197 16.374451 11.100025
    endloop
  endfacet
  facet normal -0.524330 -0.851515 0.000000
    outer loop
      vertex 156.197250 16.152128 11.100025
      vertex 156.197250 16.152128 18.100025
      vertex 155.836197 16.374451 11.100025
    endloop
  endfacet
  facet normal -0.660667 -0.750679 0.000000
    outer loop
      vertex 156.515564 15.871983 18.100025
      vertex 156.197250 16.152128 18.100025
      vertex 156.197250 16.152128 11.100025
    endloop
  endfacet
  facet normal -0.660667 -0.750679 0.000000
    outer loop
      vertex 156.515564 15.871983 11.100025
      vertex 156.515564 15.871983 18.100025
      vertex 156.197250 16.152128 11.100025
    endloop
  endfacet
  facet normal -0.778050 -0.628203 0.000000
    outer loop
      vertex 156.781937 15.542071 18.100025
      vertex 156.515564 15.871983 18.100025
      vertex 156.515564 15.871983 11.100025
    endloop
  endfacet
  facet normal -0.778050 -0.628203 0.000000
    outer loop
      vertex 156.781937 15.542071 11.100025
      vertex 156.781937 15.542071 18.100025
      vertex 156.515564 15.871983 11.100025
    endloop
  endfacet
  facet normal -0.873008 -0.487706 0.000000
    outer loop
      vertex 156.988739 15.171889 18.100025
      vertex 156.781937 15.542071 18.100025
      vertex 156.781937 15.542071 11.100025
    endloop
  endfacet
  facet normal -0.873008 -0.487706 0.000000
    outer loop
      vertex 156.988739 15.171889 11.100025
      vertex 156.988739 15.171889 18.100025
      vertex 156.781937 15.542071 11.100025
    endloop
  endfacet
  facet normal -0.942874 -0.333148 0.000000
    outer loop
      vertex 157.130005 14.772079 18.100025
      vertex 156.988739 15.171889 18.100025
      vertex 156.988739 15.171889 11.100025
    endloop
  endfacet
  facet normal -0.942874 -0.333148 0.000000
    outer loop
      vertex 157.130005 14.772079 11.100025
      vertex 157.130005 14.772079 18.100025
      vertex 156.988739 15.171889 11.100025
    endloop
  endfacet
  facet normal -0.985612 -0.169022 0.000000
    outer loop
      vertex 157.201675 14.354151 18.100025
      vertex 157.130005 14.772079 18.100025
      vertex 157.130005 14.772079 11.100025
    endloop
  endfacet
  facet normal -0.985612 -0.169022 0.000000
    outer loop
      vertex 157.201675 14.354151 11.100025
      vertex 157.201675 14.354151 18.100025
      vertex 157.130005 14.772079 11.100025
    endloop
  endfacet
  facet normal -0.999100 -0.042424 0.000000
    outer loop
      vertex 157.210678 14.142134 18.100025
      vertex 157.201675 14.354151 18.100025
      vertex 157.201675 14.354151 11.100025
    endloop
  endfacet
  facet normal -0.999100 -0.042424 0.000000
    outer loop
      vertex 157.210678 14.142134 11.100025
      vertex 157.210678 14.142134 18.100025
      vertex 157.201675 14.354151 11.100025
    endloop
  endfacet
  facet normal -0.999100 0.042424 0.000000
    outer loop
      vertex 157.201675 13.930120 18.100025
      vertex 157.210678 14.142134 18.100025
      vertex 157.210678 14.142134 11.100025
    endloop
  endfacet
  facet normal -0.999100 0.042424 0.000000
    outer loop
      vertex 157.201675 13.930120 11.100025
      vertex 157.201675 13.930120 18.100025
      vertex 157.210678 14.142134 11.100025
    endloop
  endfacet
  facet normal -0.985612 0.169022 0.000000
    outer loop
      vertex 157.130005 13.512191 18.100025
      vertex 157.201675 13.930120 18.100025
      vertex 157.201675 13.930120 11.100025
    endloop
  endfacet
  facet normal -0.985612 0.169022 0.000000
    outer loop
      vertex 157.130005 13.512191 11.100025
      vertex 157.130005 13.512191 18.100025
      vertex 157.201675 13.930120 11.100025
    endloop
  endfacet
  facet normal -0.942874 0.333148 0.000000
    outer loop
      vertex 156.988739 13.112381 18.100025
      vertex 157.130005 13.512191 18.100025
      vertex 157.130005 13.512191 11.100025
    endloop
  endfacet
  facet normal -0.942874 0.333148 0.000000
    outer loop
      vertex 156.988739 13.112381 11.100025
      vertex 156.988739 13.112381 18.100025
      vertex 157.130005 13.512191 11.100025
    endloop
  endfacet
  facet normal -0.873008 0.487706 0.000000
    outer loop
      vertex 156.781937 12.742199 18.100025
      vertex 156.988739 13.112381 18.100025
      vertex 156.988739 13.112381 11.100025
    endloop
  endfacet
  facet normal -0.873008 0.487706 0.000000
    outer loop
      vertex 156.781937 12.742199 11.100025
      vertex 156.781937 12.742199 18.100025
      vertex 156.988739 13.112381 11.100025
    endloop
  endfacet
  facet normal -0.778050 0.628203 0.000000
    outer loop
      vertex 156.515564 12.412288 18.100025
      vertex 156.781937 12.742199 18.100025
      vertex 156.781937 12.742199 11.100025
    endloop
  endfacet
  facet normal -0.778050 0.628203 0.000000
    outer loop
      vertex 156.515564 12.412288 11.100025
      vertex 156.515564 12.412288 18.100025
      vertex 156.781937 12.742199 11.100025
    endloop
  endfacet
  facet normal -0.660667 0.750679 0.000000
    outer loop
      vertex 156.197250 12.132142 18.100025
      vertex 156.515564 12.412288 18.100025
      vertex 156.515564 12.412288 11.100025
    endloop
  endfacet
  facet normal -0.660667 0.750679 0.000000
    outer loop
      vertex 156.197250 12.132142 11.100025
      vertex 156.197250 12.132142 18.100025
      vertex 156.515564 12.412288 11.100025
    endloop
  endfacet
  facet normal -0.524328 0.851516 0.000000
    outer loop
      vertex 155.836197 11.909821 18.100025
      vertex 156.197250 12.132142 18.100025
      vertex 156.197250 12.132142 11.100025
    endloop
  endfacet
  facet normal -0.524328 0.851516 0.000000
    outer loop
      vertex 155.836197 11.909821 11.100025
      vertex 155.836197 11.909821 18.100025
      vertex 156.197250 12.132142 11.100025
    endloop
  endfacet
  facet normal -0.372860 0.927888 0.000000
    outer loop
      vertex 155.442749 11.751719 18.100025
      vertex 155.836197 11.909821 18.100025
      vertex 155.836197 11.909821 11.100025
    endloop
  endfacet
  facet normal -0.372860 0.927888 0.000000
    outer loop
      vertex 155.442749 11.751719 11.100025
      vertex 155.442749 11.751719 18.100025
      vertex 155.836197 11.909821 11.100025
    endloop
  endfacet
  facet normal -0.210672 0.977557 0.000000
    outer loop
      vertex 155.028229 11.662386 18.100025
      vertex 155.442749 11.751719 18.100025
      vertex 155.442749 11.751719 11.100025
    endloop
  endfacet
  facet normal -0.210672 0.977557 0.000000
    outer loop
      vertex 155.028229 11.662386 11.100025
      vertex 155.028229 11.662386 18.100025
      vertex 155.442749 11.751719 11.100025
    endloop
  endfacet
  facet normal -0.042452 0.999099 0.000000
    outer loop
      vertex 154.604584 11.644385 18.100025
      vertex 155.028229 11.662386 18.100025
      vertex 155.028229 11.662386 11.100025
    endloop
  endfacet
  facet normal -0.042452 0.999099 0.000000
    outer loop
      vertex 154.604584 11.644385 11.100025
      vertex 154.604584 11.644385 18.100025
      vertex 155.028229 11.662386 11.100025
    endloop
  endfacet
  facet normal 0.127022 0.991900 0.000000
    outer loop
      vertex 154.183990 11.698246 18.100025
      vertex 154.604584 11.644385 18.100025
      vertex 154.604584 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.127022 0.991900 -0.000000
    outer loop
      vertex 154.183990 11.698246 11.100025
      vertex 154.183990 11.698246 18.100025
      vertex 154.604584 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.292810 0.956171 0.000000
    outer loop
      vertex 153.778534 11.822410 18.100025
      vertex 154.183990 11.698246 18.100025
      vertex 154.183990 11.698246 11.100025
    endloop
  endfacet
  facet normal 0.292810 0.956171 -0.000000
    outer loop
      vertex 153.778534 11.822410 11.100025
      vertex 153.778534 11.822410 18.100025
      vertex 154.183990 11.698246 11.100025
    endloop
  endfacet
  facet normal 0.450219 0.892918 0.000000
    outer loop
      vertex 153.399918 12.013312 18.100025
      vertex 153.778534 11.822410 18.100025
      vertex 153.778534 11.822410 11.100025
    endloop
  endfacet
  facet normal 0.450219 0.892918 -0.000000
    outer loop
      vertex 153.399918 12.013312 11.100025
      vertex 153.399918 12.013312 18.100025
      vertex 153.778534 11.822410 11.100025
    endloop
  endfacet
  facet normal 0.594625 0.804003 0.000000
    outer loop
      vertex 153.058990 12.265455 18.100025
      vertex 153.399918 12.013312 18.100025
      vertex 153.399918 12.013312 11.100025
    endloop
  endfacet
  facet normal 0.594625 0.804003 -0.000000
    outer loop
      vertex 153.058990 12.265455 11.100025
      vertex 153.058990 12.265455 18.100025
      vertex 153.399918 12.013312 11.100025
    endloop
  endfacet
  facet normal 0.721962 0.691932 0.000000
    outer loop
      vertex 152.765594 12.571585 18.100025
      vertex 153.058990 12.265455 18.100025
      vertex 153.058990 12.265455 11.100025
    endloop
  endfacet
  facet normal 0.721962 0.691932 -0.000000
    outer loop
      vertex 152.765594 12.571585 11.100025
      vertex 152.765594 12.571585 18.100025
      vertex 153.058990 12.265455 11.100025
    endloop
  endfacet
  facet normal 0.828498 0.559992 0.000000
    outer loop
      vertex 152.528137 12.922898 18.100025
      vertex 152.765594 12.571585 18.100025
      vertex 152.765594 12.571585 11.100025
    endloop
  endfacet
  facet normal 0.828498 0.559992 -0.000000
    outer loop
      vertex 152.528137 12.922898 11.100025
      vertex 152.528137 12.922898 18.100025
      vertex 152.765594 12.571585 11.100025
    endloop
  endfacet
  facet normal 0.911234 0.411890 0.000000
    outer loop
      vertex 152.353485 13.309285 18.100025
      vertex 152.528137 12.922898 18.100025
      vertex 152.528137 12.922898 11.100025
    endloop
  endfacet
  facet normal 0.911234 0.411890 -0.000000
    outer loop
      vertex 152.353485 13.309285 11.100025
      vertex 152.353485 13.309285 18.100025
      vertex 152.528137 12.922898 11.100025
    endloop
  endfacet
  facet normal 0.967735 0.251969 0.000000
    outer loop
      vertex 152.246643 13.719633 18.100025
      vertex 152.353485 13.309285 18.100025
      vertex 152.353485 13.309285 11.100025
    endloop
  endfacet
  facet normal 0.967735 0.251969 -0.000000
    outer loop
      vertex 152.246643 13.719633 11.100025
      vertex 152.246643 13.719633 18.100025
      vertex 152.353485 13.309285 11.100025
    endloop
  endfacet
  facet normal 0.996396 0.084817 0.000000
    outer loop
      vertex 152.210678 14.142134 18.100025
      vertex 152.246643 13.719633 18.100025
      vertex 152.246643 13.719633 11.100025
    endloop
  endfacet
  facet normal 0.996396 0.084817 -0.000000
    outer loop
      vertex 152.210678 14.142134 11.100025
      vertex 152.210678 14.142134 18.100025
      vertex 152.246643 13.719633 11.100025
    endloop
  endfacet
  facet normal 0.996398 -0.084797 0.000000
    outer loop
      vertex 11.678092 14.564637 18.100025
      vertex 11.642136 14.142134 18.100025
      vertex 11.642136 14.142134 11.100025
    endloop
  endfacet
  facet normal 0.996398 -0.084797 0.000000
    outer loop
      vertex 11.678092 14.564637 11.100025
      vertex 11.678092 14.564637 18.100025
      vertex 11.642136 14.142134 11.100025
    endloop
  endfacet
  facet normal 0.967732 -0.251983 0.000000
    outer loop
      vertex 11.784941 14.974985 18.100025
      vertex 11.678092 14.564637 18.100025
      vertex 11.678092 14.564637 11.100025
    endloop
  endfacet
  facet normal 0.967732 -0.251983 0.000000
    outer loop
      vertex 11.784941 14.974985 11.100025
      vertex 11.784941 14.974985 18.100025
      vertex 11.678092 14.564637 11.100025
    endloop
  endfacet
  facet normal 0.911229 -0.411899 0.000000
    outer loop
      vertex 11.959598 15.361372 18.100025
      vertex 11.784941 14.974985 18.100025
      vertex 11.784941 14.974985 11.100025
    endloop
  endfacet
  facet normal 0.911229 -0.411899 0.000000
    outer loop
      vertex 11.959598 15.361372 11.100025
      vertex 11.959598 15.361372 18.100025
      vertex 11.784941 14.974985 11.100025
    endloop
  endfacet
  facet normal 0.828506 -0.559980 0.000000
    outer loop
      vertex 12.197047 15.712686 18.100025
      vertex 11.959598 15.361372 18.100025
      vertex 11.959598 15.361372 11.100025
    endloop
  endfacet
  facet normal 0.828506 -0.559980 0.000000
    outer loop
      vertex 12.197047 15.712686 11.100025
      vertex 12.197047 15.712686 18.100025
      vertex 11.959598 15.361372 11.100025
    endloop
  endfacet
  facet normal 0.721953 -0.691942 0.000000
    outer loop
      vertex 12.490452 16.018816 18.100025
      vertex 12.197047 15.712686 18.100025
      vertex 12.197047 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.721953 -0.691942 0.000000
    outer loop
      vertex 12.490452 16.018816 11.100025
      vertex 12.490452 16.018816 18.100025
      vertex 12.197047 15.712686 11.100025
    endloop
  endfacet
  facet normal 0.594636 -0.803995 0.000000
    outer loop
      vertex 12.831367 16.270958 18.100025
      vertex 12.490452 16.018816 18.100025
      vertex 12.490452 16.018816 11.100025
    endloop
  endfacet
  facet normal 0.594636 -0.803995 0.000000
    outer loop
      vertex 12.831367 16.270958 11.100025
      vertex 12.831367 16.270958 18.100025
      vertex 12.490452 16.018816 11.100025
    endloop
  endfacet
  facet normal 0.450205 -0.892925 0.000000
    outer loop
      vertex 13.209991 16.461857 18.100025
      vertex 12.831367 16.270958 18.100025
      vertex 12.831367 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.450205 -0.892925 0.000000
    outer loop
      vertex 13.209991 16.461857 11.100025
      vertex 13.209991 16.461857 18.100025
      vertex 12.831367 16.270958 11.100025
    endloop
  endfacet
  facet normal 0.292828 -0.956165 0.000000
    outer loop
      vertex 13.615437 16.586025 18.100025
      vertex 13.209991 16.461857 18.100025
      vertex 13.209991 16.461857 11.100025
    endloop
  endfacet
  facet normal 0.292828 -0.956165 0.000000
    outer loop
      vertex 13.615437 16.586025 11.100025
      vertex 13.615437 16.586025 18.100025
      vertex 13.209991 16.461857 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 14.036030 16.639881 18.100025
      vertex 13.615437 16.586025 18.100025
      vertex 13.615437 16.586025 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 14.036030 16.639881 11.100025
      vertex 14.036030 16.639881 18.100025
      vertex 13.615437 16.586025 11.100025
    endloop
  endfacet
  facet normal -0.042445 -0.999099 0.000000
    outer loop
      vertex 14.459677 16.621883 18.100025
      vertex 14.036030 16.639881 18.100025
      vertex 14.036030 16.639881 11.100025
    endloop
  endfacet
  facet normal -0.042445 -0.999099 0.000000
    outer loop
      vertex 14.459677 16.621883 11.100025
      vertex 14.459677 16.621883 18.100025
      vertex 14.036030 16.639881 11.100025
    endloop
  endfacet
  facet normal -0.210675 -0.977556 0.000000
    outer loop
      vertex 14.874190 16.532551 18.100025
      vertex 14.459677 16.621883 18.100025
      vertex 14.459677 16.621883 11.100025
    endloop
  endfacet
  facet normal -0.210675 -0.977556 0.000000
    outer loop
      vertex 14.874190 16.532551 11.100025
      vertex 14.874190 16.532551 18.100025
      vertex 14.459677 16.621883 11.100025
    endloop
  endfacet
  facet normal -0.372848 -0.927892 0.000000
    outer loop
      vertex 15.267648 16.374451 18.100025
      vertex 14.874190 16.532551 18.100025
      vertex 14.874190 16.532551 11.100025
    endloop
  endfacet
  facet normal -0.372848 -0.927892 0.000000
    outer loop
      vertex 15.267648 16.374451 11.100025
      vertex 15.267648 16.374451 18.100025
      vertex 14.874190 16.532551 11.100025
    endloop
  endfacet
  facet normal -0.524312 -0.851526 0.000000
    outer loop
      vertex 15.628717 16.152128 18.100025
      vertex 15.267648 16.374451 18.100025
      vertex 15.267648 16.374451 11.100025
    endloop
  endfacet
  facet normal -0.524312 -0.851526 0.000000
    outer loop
      vertex 15.628717 16.152128 11.100025
      vertex 15.628717 16.152128 18.100025
      vertex 15.267648 16.374451 11.100025
    endloop
  endfacet
  facet normal -0.660678 -0.750669 0.000000
    outer loop
      vertex 15.947021 15.871983 18.100025
      vertex 15.628717 16.152128 18.100025
      vertex 15.628717 16.152128 11.100025
    endloop
  endfacet
  facet normal -0.660678 -0.750669 0.000000
    outer loop
      vertex 15.947021 15.871983 11.100025
      vertex 15.947021 15.871983 18.100025
      vertex 15.628717 16.152128 11.100025
    endloop
  endfacet
  facet normal -0.778032 -0.628225 0.000000
    outer loop
      vertex 16.213409 15.542071 18.100025
      vertex 15.947021 15.871983 18.100025
      vertex 15.947021 15.871983 11.100025
    endloop
  endfacet
  facet normal -0.778032 -0.628225 0.000000
    outer loop
      vertex 16.213409 15.542071 11.100025
      vertex 16.213409 15.542071 18.100025
      vertex 15.947021 15.871983 11.100025
    endloop
  endfacet
  facet normal -0.873012 -0.487699 0.000000
    outer loop
      vertex 16.420208 15.171889 18.100025
      vertex 16.213409 15.542071 18.100025
      vertex 16.213409 15.542071 11.100025
    endloop
  endfacet
  facet normal -0.873012 -0.487699 0.000000
    outer loop
      vertex 16.420208 15.171889 11.100025
      vertex 16.420208 15.171889 18.100025
      vertex 16.213409 15.542071 11.100025
    endloop
  endfacet
  facet normal -0.942881 -0.333128 0.000000
    outer loop
      vertex 16.561464 14.772079 18.100025
      vertex 16.420208 15.171889 18.100025
      vertex 16.420208 15.171889 11.100025
    endloop
  endfacet
  facet normal -0.942881 -0.333128 0.000000
    outer loop
      vertex 16.561464 14.772079 11.100025
      vertex 16.561464 14.772079 18.100025
      vertex 16.420208 15.171889 11.100025
    endloop
  endfacet
  facet normal -0.985614 -0.169014 0.000000
    outer loop
      vertex 16.633131 14.354151 18.100025
      vertex 16.561464 14.772079 18.100025
      vertex 16.561464 14.772079 11.100025
    endloop
  endfacet
  facet normal -0.985614 -0.169014 0.000000
    outer loop
      vertex 16.633131 14.354151 11.100025
      vertex 16.633131 14.354151 18.100025
      vertex 16.561464 14.772079 11.100025
    endloop
  endfacet
  facet normal -0.999099 -0.042442 0.000000
    outer loop
      vertex 16.642138 14.142134 18.100025
      vertex 16.633131 14.354151 18.100025
      vertex 16.633131 14.354151 11.100025
    endloop
  endfacet
  facet normal -0.999099 -0.042442 0.000000
    outer loop
      vertex 16.642138 14.142134 11.100025
      vertex 16.642138 14.142134 18.100025
      vertex 16.633131 14.354151 11.100025
    endloop
  endfacet
  facet normal -0.999099 0.042442 0.000000
    outer loop
      vertex 16.633131 13.930120 18.100025
      vertex 16.642138 14.142134 18.100025
      vertex 16.642138 14.142134 11.100025
    endloop
  endfacet
  facet normal -0.999099 0.042442 0.000000
    outer loop
      vertex 16.633131 13.930120 11.100025
      vertex 16.633131 13.930120 18.100025
      vertex 16.642138 14.142134 11.100025
    endloop
  endfacet
  facet normal -0.985614 0.169014 0.000000
    outer loop
      vertex 16.561464 13.512191 18.100025
      vertex 16.633131 13.930120 18.100025
      vertex 16.633131 13.930120 11.100025
    endloop
  endfacet
  facet normal -0.985614 0.169014 0.000000
    outer loop
      vertex 16.561464 13.512191 11.100025
      vertex 16.561464 13.512191 18.100025
      vertex 16.633131 13.930120 11.100025
    endloop
  endfacet
  facet normal -0.942881 0.333128 0.000000
    outer loop
      vertex 16.420208 13.112381 18.100025
      vertex 16.561464 13.512191 18.100025
      vertex 16.561464 13.512191 11.100025
    endloop
  endfacet
  facet normal -0.942881 0.333128 0.000000
    outer loop
      vertex 16.420208 13.112381 11.100025
      vertex 16.420208 13.112381 18.100025
      vertex 16.561464 13.512191 11.100025
    endloop
  endfacet
  facet normal -0.873012 0.487699 0.000000
    outer loop
      vertex 16.213409 12.742199 18.100025
      vertex 16.420208 13.112381 18.100025
      vertex 16.420208 13.112381 11.100025
    endloop
  endfacet
  facet normal -0.873012 0.487699 0.000000
    outer loop
      vertex 16.213409 12.742199 11.100025
      vertex 16.213409 12.742199 18.100025
      vertex 16.420208 13.112381 11.100025
    endloop
  endfacet
  facet normal -0.778032 0.628225 0.000000
    outer loop
      vertex 15.947021 12.412288 18.100025
      vertex 16.213409 12.742199 18.100025
      vertex 16.213409 12.742199 11.100025
    endloop
  endfacet
  facet normal -0.778032 0.628225 0.000000
    outer loop
      vertex 15.947021 12.412288 11.100025
      vertex 15.947021 12.412288 18.100025
      vertex 16.213409 12.742199 11.100025
    endloop
  endfacet
  facet normal -0.660678 0.750669 0.000000
    outer loop
      vertex 15.628717 12.132142 18.100025
      vertex 15.947021 12.412288 18.100025
      vertex 15.947021 12.412288 11.100025
    endloop
  endfacet
  facet normal -0.660678 0.750669 0.000000
    outer loop
      vertex 15.628717 12.132142 11.100025
      vertex 15.628717 12.132142 18.100025
      vertex 15.947021 12.412288 11.100025
    endloop
  endfacet
  facet normal -0.524311 0.851527 0.000000
    outer loop
      vertex 15.267648 11.909821 18.100025
      vertex 15.628717 12.132142 18.100025
      vertex 15.628717 12.132142 11.100025
    endloop
  endfacet
  facet normal -0.524311 0.851527 0.000000
    outer loop
      vertex 15.267648 11.909821 11.100025
      vertex 15.267648 11.909821 18.100025
      vertex 15.628717 12.132142 11.100025
    endloop
  endfacet
  facet normal -0.372852 0.927891 0.000000
    outer loop
      vertex 14.874190 11.751719 18.100025
      vertex 15.267648 11.909821 18.100025
      vertex 15.267648 11.909821 11.100025
    endloop
  endfacet
  facet normal -0.372852 0.927891 0.000000
    outer loop
      vertex 14.874190 11.751719 11.100025
      vertex 14.874190 11.751719 18.100025
      vertex 15.267648 11.909821 11.100025
    endloop
  endfacet
  facet normal -0.210675 0.977556 0.000000
    outer loop
      vertex 14.459677 11.662386 18.100025
      vertex 14.874190 11.751719 18.100025
      vertex 14.874190 11.751719 11.100025
    endloop
  endfacet
  facet normal -0.210675 0.977556 0.000000
    outer loop
      vertex 14.459677 11.662386 11.100025
      vertex 14.459677 11.662386 18.100025
      vertex 14.874190 11.751719 11.100025
    endloop
  endfacet
  facet normal -0.042451 0.999099 0.000000
    outer loop
      vertex 14.036030 11.644385 18.100025
      vertex 14.459677 11.662386 18.100025
      vertex 14.459677 11.662386 11.100025
    endloop
  endfacet
  facet normal -0.042451 0.999099 0.000000
    outer loop
      vertex 14.036030 11.644385 11.100025
      vertex 14.036030 11.644385 18.100025
      vertex 14.459677 11.662386 11.100025
    endloop
  endfacet
  facet normal 0.127022 0.991900 0.000000
    outer loop
      vertex 13.615437 11.698246 18.100025
      vertex 14.036030 11.644385 18.100025
      vertex 14.036030 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.127022 0.991900 -0.000000
    outer loop
      vertex 13.615437 11.698246 11.100025
      vertex 13.615437 11.698246 18.100025
      vertex 14.036030 11.644385 11.100025
    endloop
  endfacet
  facet normal 0.292817 0.956168 0.000000
    outer loop
      vertex 13.209991 11.822410 18.100025
      vertex 13.615437 11.698246 18.100025
      vertex 13.615437 11.698246 11.100025
    endloop
  endfacet
  facet normal 0.292817 0.956168 -0.000000
    outer loop
      vertex 13.209991 11.822410 11.100025
      vertex 13.209991 11.822410 18.100025
      vertex 13.615437 11.698246 11.100025
    endloop
  endfacet
  facet normal 0.450212 0.892922 0.000000
    outer loop
      vertex 12.831367 12.013312 18.100025
      vertex 13.209991 11.822410 18.100025
      vertex 13.209991 11.822410 11.100025
    endloop
  endfacet
  facet normal 0.450212 0.892922 -0.000000
    outer loop
      vertex 12.831367 12.013312 11.100025
      vertex 12.831367 12.013312 18.100025
      vertex 13.209991 11.822410 11.100025
    endloop
  endfacet
  facet normal 0.594638 0.803994 0.000000
    outer loop
      vertex 12.490452 12.265455 18.100025
      vertex 12.831367 12.013312 18.100025
      vertex 12.831367 12.013312 11.100025
    endloop
  endfacet
  facet normal 0.594638 0.803994 -0.000000
    outer loop
      vertex 12.490452 12.265455 11.100025
      vertex 12.490452 12.265455 18.100025
      vertex 12.831367 12.013312 11.100025
    endloop
  endfacet
  facet normal 0.721952 0.691943 0.000000
    outer loop
      vertex 12.197047 12.571585 18.100025
      vertex 12.490452 12.265455 18.100025
      vertex 12.490452 12.265455 11.100025
    endloop
  endfacet
  facet normal 0.721952 0.691943 -0.000000
    outer loop
      vertex 12.197047 12.571585 11.100025
      vertex 12.197047 12.571585 18.100025
      vertex 12.490452 12.265455 11.100025
    endloop
  endfacet
  facet normal 0.828506 0.559980 0.000000
    outer loop
      vertex 11.959598 12.922898 18.100025
      vertex 12.197047 12.571585 18.100025
      vertex 12.197047 12.571585 11.100025
    endloop
  endfacet
  facet normal 0.828506 0.559980 -0.000000
    outer loop
      vertex 11.959598 12.922898 11.100025
      vertex 11.959598 12.922898 18.100025
      vertex 12.197047 12.571585 11.100025
    endloop
  endfacet
  facet normal 0.911229 0.411899 0.000000
    outer loop
      vertex 11.784941 13.309285 18.100025
      vertex 11.959598 12.922898 18.100025
      vertex 11.959598 12.922898 11.100025
    endloop
  endfacet
  facet normal 0.911229 0.411899 -0.000000
    outer loop
      vertex 11.784941 13.309285 11.100025
      vertex 11.784941 13.309285 18.100025
      vertex 11.959598 12.922898 11.100025
    endloop
  endfacet
  facet normal 0.967732 0.251983 0.000000
    outer loop
      vertex 11.678092 13.719633 18.100025
      vertex 11.784941 13.309285 18.100025
      vertex 11.784941 13.309285 11.100025
    endloop
  endfacet
  facet normal 0.967732 0.251983 -0.000000
    outer loop
      vertex 11.678092 13.719633 11.100025
      vertex 11.678092 13.719633 18.100025
      vertex 11.784941 13.309285 11.100025
    endloop
  endfacet
  facet normal 0.996398 0.084797 0.000000
    outer loop
      vertex 11.642136 14.142134 18.100025
      vertex 11.678092 13.719633 18.100025
      vertex 11.678092 13.719633 11.100025
    endloop
  endfacet
  facet normal 0.996398 0.084797 -0.000000
    outer loop
      vertex 11.642136 14.142134 11.100025
      vertex 11.642136 14.142134 18.100025
      vertex 11.678092 13.719633 11.100025
    endloop
  endfacet
  facet normal 0.996396 -0.084817 0.000000
    outer loop
      vertex 152.246643 105.133179 18.100025
      vertex 152.210678 104.710678 18.100025
      vertex 152.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.996396 -0.084817 0.000000
    outer loop
      vertex 152.246643 105.133179 11.100025
      vertex 152.246643 105.133179 18.100025
      vertex 152.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.967735 -0.251969 0.000000
    outer loop
      vertex 152.353485 105.543526 18.100025
      vertex 152.246643 105.133179 18.100025
      vertex 152.246643 105.133179 11.100025
    endloop
  endfacet
  facet normal 0.967735 -0.251969 0.000000
    outer loop
      vertex 152.353485 105.543526 11.100025
      vertex 152.353485 105.543526 18.100025
      vertex 152.246643 105.133179 11.100025
    endloop
  endfacet
  facet normal 0.911232 -0.411893 0.000000
    outer loop
      vertex 152.528137 105.929909 18.100025
      vertex 152.353485 105.543526 18.100025
      vertex 152.353485 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.911232 -0.411893 0.000000
    outer loop
      vertex 152.528137 105.929909 11.100025
      vertex 152.528137 105.929909 18.100025
      vertex 152.353485 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.828501 -0.559987 0.000000
    outer loop
      vertex 152.765594 106.281227 18.100025
      vertex 152.528137 105.929909 18.100025
      vertex 152.528137 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.828501 -0.559987 0.000000
    outer loop
      vertex 152.765594 106.281227 11.100025
      vertex 152.765594 106.281227 18.100025
      vertex 152.528137 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.721962 -0.691932 0.000000
    outer loop
      vertex 153.058990 106.587357 18.100025
      vertex 152.765594 106.281227 18.100025
      vertex 152.765594 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.721962 -0.691932 0.000000
    outer loop
      vertex 153.058990 106.587357 11.100025
      vertex 153.058990 106.587357 18.100025
      vertex 152.765594 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.594626 -0.804002 0.000000
    outer loop
      vertex 153.399918 106.839500 18.100025
      vertex 153.058990 106.587357 18.100025
      vertex 153.058990 106.587357 11.100025
    endloop
  endfacet
  facet normal 0.594626 -0.804002 0.000000
    outer loop
      vertex 153.399918 106.839500 11.100025
      vertex 153.399918 106.839500 18.100025
      vertex 153.058990 106.587357 11.100025
    endloop
  endfacet
  facet normal 0.450205 -0.892925 0.000000
    outer loop
      vertex 153.778534 107.030396 18.100025
      vertex 153.399918 106.839500 18.100025
      vertex 153.399918 106.839500 11.100025
    endloop
  endfacet
  facet normal 0.450205 -0.892925 0.000000
    outer loop
      vertex 153.778534 107.030396 11.100025
      vertex 153.778534 107.030396 18.100025
      vertex 153.399918 106.839500 11.100025
    endloop
  endfacet
  facet normal 0.292820 -0.956168 0.000000
    outer loop
      vertex 154.183990 107.154564 18.100025
      vertex 153.778534 107.030396 18.100025
      vertex 153.778534 107.030396 11.100025
    endloop
  endfacet
  facet normal 0.292820 -0.956168 0.000000
    outer loop
      vertex 154.183990 107.154564 11.100025
      vertex 154.183990 107.154564 18.100025
      vertex 153.778534 107.030396 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 154.604584 107.208420 18.100025
      vertex 154.183990 107.154564 18.100025
      vertex 154.183990 107.154564 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 154.604584 107.208420 11.100025
      vertex 154.604584 107.208420 18.100025
      vertex 154.183990 107.154564 11.100025
    endloop
  endfacet
  facet normal -0.042427 -0.999100 0.000000
    outer loop
      vertex 155.028229 107.190430 18.100025
      vertex 154.604584 107.208420 18.100025
      vertex 154.604584 107.208420 11.100025
    endloop
  endfacet
  facet normal -0.042427 -0.999100 0.000000
    outer loop
      vertex 155.028229 107.190430 11.100025
      vertex 155.028229 107.190430 18.100025
      vertex 154.604584 107.208420 11.100025
    endloop
  endfacet
  facet normal -0.210672 -0.977557 0.000000
    outer loop
      vertex 155.442749 107.101097 18.100025
      vertex 155.028229 107.190430 18.100025
      vertex 155.028229 107.190430 11.100025
    endloop
  endfacet
  facet normal -0.210672 -0.977557 0.000000
    outer loop
      vertex 155.442749 107.101097 11.100025
      vertex 155.442749 107.101097 18.100025
      vertex 155.028229 107.190430 11.100025
    endloop
  endfacet
  facet normal -0.372864 -0.927886 0.000000
    outer loop
      vertex 155.836197 106.942993 18.100025
      vertex 155.442749 107.101097 18.100025
      vertex 155.442749 107.101097 11.100025
    endloop
  endfacet
  facet normal -0.372864 -0.927886 0.000000
    outer loop
      vertex 155.836197 106.942993 11.100025
      vertex 155.836197 106.942993 18.100025
      vertex 155.442749 107.101097 11.100025
    endloop
  endfacet
  facet normal -0.524326 -0.851517 0.000000
    outer loop
      vertex 156.197250 106.720673 18.100025
      vertex 155.836197 106.942993 18.100025
      vertex 155.836197 106.942993 11.100025
    endloop
  endfacet
  facet normal -0.524326 -0.851517 0.000000
    outer loop
      vertex 156.197250 106.720673 11.100025
      vertex 156.197250 106.720673 18.100025
      vertex 155.836197 106.942993 11.100025
    endloop
  endfacet
  facet normal -0.660665 -0.750681 0.000000
    outer loop
      vertex 156.515564 106.440529 18.100025
      vertex 156.197250 106.720673 18.100025
      vertex 156.197250 106.720673 11.100025
    endloop
  endfacet
  facet normal -0.660665 -0.750681 0.000000
    outer loop
      vertex 156.515564 106.440529 11.100025
      vertex 156.515564 106.440529 18.100025
      vertex 156.197250 106.720673 11.100025
    endloop
  endfacet
  facet normal -0.778049 -0.628204 0.000000
    outer loop
      vertex 156.781937 106.110619 18.100025
      vertex 156.515564 106.440529 18.100025
      vertex 156.515564 106.440529 11.100025
    endloop
  endfacet
  facet normal -0.778049 -0.628204 0.000000
    outer loop
      vertex 156.781937 106.110619 11.100025
      vertex 156.781937 106.110619 18.100025
      vertex 156.515564 106.440529 11.100025
    endloop
  endfacet
  facet normal -0.873014 -0.487695 0.000000
    outer loop
      vertex 156.988739 105.740425 18.100025
      vertex 156.781937 106.110619 18.100025
      vertex 156.781937 106.110619 11.100025
    endloop
  endfacet
  facet normal -0.873014 -0.487695 0.000000
    outer loop
      vertex 156.988739 105.740425 11.100025
      vertex 156.988739 105.740425 18.100025
      vertex 156.781937 106.110619 11.100025
    endloop
  endfacet
  facet normal -0.942873 -0.333153 0.000000
    outer loop
      vertex 157.130005 105.340622 18.100025
      vertex 156.988739 105.740425 18.100025
      vertex 156.988739 105.740425 11.100025
    endloop
  endfacet
  facet normal -0.942873 -0.333153 0.000000
    outer loop
      vertex 157.130005 105.340622 11.100025
      vertex 157.130005 105.340622 18.100025
      vertex 156.988739 105.740425 11.100025
    endloop
  endfacet
  facet normal -0.985612 -0.169022 0.000000
    outer loop
      vertex 157.201675 104.922691 18.100025
      vertex 157.130005 105.340622 18.100025
      vertex 157.130005 105.340622 11.100025
    endloop
  endfacet
  facet normal -0.985612 -0.169022 0.000000
    outer loop
      vertex 157.201675 104.922691 11.100025
      vertex 157.201675 104.922691 18.100025
      vertex 157.130005 105.340622 11.100025
    endloop
  endfacet
  facet normal -0.999100 -0.042425 0.000000
    outer loop
      vertex 157.210678 104.710678 18.100025
      vertex 157.201675 104.922691 18.100025
      vertex 157.201675 104.922691 11.100025
    endloop
  endfacet
  facet normal -0.999100 -0.042425 0.000000
    outer loop
      vertex 157.210678 104.710678 11.100025
      vertex 157.210678 104.710678 18.100025
      vertex 157.201675 104.922691 11.100025
    endloop
  endfacet
  facet normal -0.999100 0.042425 0.000000
    outer loop
      vertex 157.201675 104.498665 18.100025
      vertex 157.210678 104.710678 18.100025
      vertex 157.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal -0.999100 0.042425 0.000000
    outer loop
      vertex 157.201675 104.498665 11.100025
      vertex 157.201675 104.498665 18.100025
      vertex 157.210678 104.710678 11.100025
    endloop
  endfacet
  facet normal -0.985612 0.169022 0.000000
    outer loop
      vertex 157.130005 104.080734 18.100025
      vertex 157.201675 104.498665 18.100025
      vertex 157.201675 104.498665 11.100025
    endloop
  endfacet
  facet normal -0.985612 0.169022 0.000000
    outer loop
      vertex 157.130005 104.080734 11.100025
      vertex 157.130005 104.080734 18.100025
      vertex 157.201675 104.498665 11.100025
    endloop
  endfacet
  facet normal -0.942875 0.333148 0.000000
    outer loop
      vertex 156.988739 103.680923 18.100025
      vertex 157.130005 104.080734 18.100025
      vertex 157.130005 104.080734 11.100025
    endloop
  endfacet
  facet normal -0.942875 0.333148 0.000000
    outer loop
      vertex 156.988739 103.680923 11.100025
      vertex 156.988739 103.680923 18.100025
      vertex 157.130005 104.080734 11.100025
    endloop
  endfacet
  facet normal -0.873006 0.487710 0.000000
    outer loop
      vertex 156.781937 103.310745 18.100025
      vertex 156.988739 103.680923 18.100025
      vertex 156.988739 103.680923 11.100025
    endloop
  endfacet
  facet normal -0.873006 0.487710 0.000000
    outer loop
      vertex 156.781937 103.310745 11.100025
      vertex 156.781937 103.310745 18.100025
      vertex 156.988739 103.680923 11.100025
    endloop
  endfacet
  facet normal -0.778056 0.628195 0.000000
    outer loop
      vertex 156.515564 102.980827 18.100025
      vertex 156.781937 103.310745 18.100025
      vertex 156.781937 103.310745 11.100025
    endloop
  endfacet
  facet normal -0.778056 0.628195 0.000000
    outer loop
      vertex 156.515564 102.980827 11.100025
      vertex 156.515564 102.980827 18.100025
      vertex 156.781937 103.310745 11.100025
    endloop
  endfacet
  facet normal -0.660665 0.750681 0.000000
    outer loop
      vertex 156.197250 102.700684 18.100025
      vertex 156.515564 102.980827 18.100025
      vertex 156.515564 102.980827 11.100025
    endloop
  endfacet
  facet normal -0.660665 0.750681 0.000000
    outer loop
      vertex 156.197250 102.700684 11.100025
      vertex 156.197250 102.700684 18.100025
      vertex 156.515564 102.980827 11.100025
    endloop
  endfacet
  facet normal -0.524326 0.851517 0.000000
    outer loop
      vertex 155.836197 102.478363 18.100025
      vertex 156.197250 102.700684 18.100025
      vertex 156.197250 102.700684 11.100025
    endloop
  endfacet
  facet normal -0.524326 0.851517 0.000000
    outer loop
      vertex 155.836197 102.478363 11.100025
      vertex 155.836197 102.478363 18.100025
      vertex 156.197250 102.700684 11.100025
    endloop
  endfacet
  facet normal -0.372864 0.927886 0.000000
    outer loop
      vertex 155.442749 102.320259 18.100025
      vertex 155.836197 102.478363 18.100025
      vertex 155.836197 102.478363 11.100025
    endloop
  endfacet
  facet normal -0.372864 0.927886 0.000000
    outer loop
      vertex 155.442749 102.320259 11.100025
      vertex 155.442749 102.320259 18.100025
      vertex 155.836197 102.478363 11.100025
    endloop
  endfacet
  facet normal -0.210672 0.977557 0.000000
    outer loop
      vertex 155.028229 102.230927 18.100025
      vertex 155.442749 102.320259 18.100025
      vertex 155.442749 102.320259 11.100025
    endloop
  endfacet
  facet normal -0.210672 0.977557 0.000000
    outer loop
      vertex 155.028229 102.230927 11.100025
      vertex 155.028229 102.230927 18.100025
      vertex 155.442749 102.320259 11.100025
    endloop
  endfacet
  facet normal -0.042445 0.999099 0.000000
    outer loop
      vertex 154.604584 102.212929 18.100025
      vertex 155.028229 102.230927 18.100025
      vertex 155.028229 102.230927 11.100025
    endloop
  endfacet
  facet normal -0.042445 0.999099 0.000000
    outer loop
      vertex 154.604584 102.212929 11.100025
      vertex 154.604584 102.212929 18.100025
      vertex 155.028229 102.230927 11.100025
    endloop
  endfacet
  facet normal 0.127010 0.991901 0.000000
    outer loop
      vertex 154.183990 102.266785 18.100025
      vertex 154.604584 102.212929 18.100025
      vertex 154.604584 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.127010 0.991901 -0.000000
    outer loop
      vertex 154.183990 102.266785 11.100025
      vertex 154.183990 102.266785 18.100025
      vertex 154.604584 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.292820 0.956168 0.000000
    outer loop
      vertex 153.778534 102.390953 18.100025
      vertex 154.183990 102.266785 18.100025
      vertex 154.183990 102.266785 11.100025
    endloop
  endfacet
  facet normal 0.292820 0.956168 -0.000000
    outer loop
      vertex 153.778534 102.390953 11.100025
      vertex 153.778534 102.390953 18.100025
      vertex 154.183990 102.266785 11.100025
    endloop
  endfacet
  facet normal 0.450219 0.892918 0.000000
    outer loop
      vertex 153.399918 102.581856 18.100025
      vertex 153.778534 102.390953 18.100025
      vertex 153.778534 102.390953 11.100025
    endloop
  endfacet
  facet normal 0.450219 0.892918 -0.000000
    outer loop
      vertex 153.399918 102.581856 11.100025
      vertex 153.399918 102.581856 18.100025
      vertex 153.778534 102.390953 11.100025
    endloop
  endfacet
  facet normal 0.594615 0.804011 0.000000
    outer loop
      vertex 153.058990 102.833992 18.100025
      vertex 153.399918 102.581856 18.100025
      vertex 153.399918 102.581856 11.100025
    endloop
  endfacet
  facet normal 0.594615 0.804011 -0.000000
    outer loop
      vertex 153.058990 102.833992 11.100025
      vertex 153.058990 102.833992 18.100025
      vertex 153.399918 102.581856 11.100025
    endloop
  endfacet
  facet normal 0.721971 0.691923 0.000000
    outer loop
      vertex 152.765594 103.140129 18.100025
      vertex 153.058990 102.833992 18.100025
      vertex 153.058990 102.833992 11.100025
    endloop
  endfacet
  facet normal 0.721971 0.691923 -0.000000
    outer loop
      vertex 152.765594 103.140129 11.100025
      vertex 152.765594 103.140129 18.100025
      vertex 153.058990 102.833992 11.100025
    endloop
  endfacet
  facet normal 0.828496 0.559995 0.000000
    outer loop
      vertex 152.528137 103.491440 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 152.765594 103.140129 11.100025
    endloop
  endfacet
  facet normal 0.828496 0.559995 -0.000000
    outer loop
      vertex 152.528137 103.491440 11.100025
      vertex 152.528137 103.491440 18.100025
      vertex 152.765594 103.140129 11.100025
    endloop
  endfacet
  facet normal 0.911235 0.411887 0.000000
    outer loop
      vertex 152.353485 103.877831 18.100025
      vertex 152.528137 103.491440 18.100025
      vertex 152.528137 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.911235 0.411887 -0.000000
    outer loop
      vertex 152.353485 103.877831 11.100025
      vertex 152.353485 103.877831 18.100025
      vertex 152.528137 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.967735 0.251969 0.000000
    outer loop
      vertex 152.246643 104.288177 18.100025
      vertex 152.353485 103.877831 18.100025
      vertex 152.353485 103.877831 11.100025
    endloop
  endfacet
  facet normal 0.967735 0.251969 -0.000000
    outer loop
      vertex 152.246643 104.288177 11.100025
      vertex 152.246643 104.288177 18.100025
      vertex 152.353485 103.877831 11.100025
    endloop
  endfacet
  facet normal 0.996396 0.084817 0.000000
    outer loop
      vertex 152.210678 104.710678 18.100025
      vertex 152.246643 104.288177 18.100025
      vertex 152.246643 104.288177 11.100025
    endloop
  endfacet
  facet normal 0.996396 0.084817 -0.000000
    outer loop
      vertex 152.210678 104.710678 11.100025
      vertex 152.210678 104.710678 18.100025
      vertex 152.246643 104.288177 11.100025
    endloop
  endfacet
  facet normal 0.996398 -0.084797 0.000000
    outer loop
      vertex 11.678092 105.133179 18.100025
      vertex 11.642136 104.710678 18.100025
      vertex 11.642136 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.996398 -0.084797 0.000000
    outer loop
      vertex 11.678092 105.133179 11.100025
      vertex 11.678092 105.133179 18.100025
      vertex 11.642136 104.710678 11.100025
    endloop
  endfacet
  facet normal 0.967731 -0.251984 0.000000
    outer loop
      vertex 11.784941 105.543526 18.100025
      vertex 11.678092 105.133179 18.100025
      vertex 11.678092 105.133179 11.100025
    endloop
  endfacet
  facet normal 0.967731 -0.251984 0.000000
    outer loop
      vertex 11.784941 105.543526 11.100025
      vertex 11.784941 105.543526 18.100025
      vertex 11.678092 105.133179 11.100025
    endloop
  endfacet
  facet normal 0.911228 -0.411903 0.000000
    outer loop
      vertex 11.959598 105.929909 18.100025
      vertex 11.784941 105.543526 18.100025
      vertex 11.784941 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.911228 -0.411903 0.000000
    outer loop
      vertex 11.959598 105.929909 11.100025
      vertex 11.959598 105.929909 18.100025
      vertex 11.784941 105.543526 11.100025
    endloop
  endfacet
  facet normal 0.828510 -0.559975 0.000000
    outer loop
      vertex 12.197047 106.281227 18.100025
      vertex 11.959598 105.929909 18.100025
      vertex 11.959598 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.828510 -0.559975 0.000000
    outer loop
      vertex 12.197047 106.281227 11.100025
      vertex 12.197047 106.281227 18.100025
      vertex 11.959598 105.929909 11.100025
    endloop
  endfacet
  facet normal 0.721952 -0.691943 0.000000
    outer loop
      vertex 12.490452 106.587357 18.100025
      vertex 12.197047 106.281227 18.100025
      vertex 12.197047 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.721952 -0.691943 0.000000
    outer loop
      vertex 12.490452 106.587357 11.100025
      vertex 12.490452 106.587357 18.100025
      vertex 12.197047 106.281227 11.100025
    endloop
  endfacet
  facet normal 0.594639 -0.803993 0.000000
    outer loop
      vertex 12.831367 106.839500 18.100025
      vertex 12.490452 106.587357 18.100025
      vertex 12.490452 106.587357 11.100025
    endloop
  endfacet
  facet normal 0.594639 -0.803993 0.000000
    outer loop
      vertex 12.831367 106.839500 11.100025
      vertex 12.831367 106.839500 18.100025
      vertex 12.490452 106.587357 11.100025
    endloop
  endfacet
  facet normal 0.450198 -0.892929 0.000000
    outer loop
      vertex 13.209991 107.030396 18.100025
      vertex 12.831367 106.839500 18.100025
      vertex 12.831367 106.839500 11.100025
    endloop
  endfacet
  facet normal 0.450198 -0.892929 0.000000
    outer loop
      vertex 13.209991 107.030396 11.100025
      vertex 13.209991 107.030396 18.100025
      vertex 12.831367 106.839500 11.100025
    endloop
  endfacet
  facet normal 0.292828 -0.956165 0.000000
    outer loop
      vertex 13.615437 107.154564 18.100025
      vertex 13.209991 107.030396 18.100025
      vertex 13.209991 107.030396 11.100025
    endloop
  endfacet
  facet normal 0.292828 -0.956165 0.000000
    outer loop
      vertex 13.615437 107.154564 11.100025
      vertex 13.615437 107.154564 18.100025
      vertex 13.209991 107.030396 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 14.036030 107.208420 18.100025
      vertex 13.615437 107.154564 18.100025
      vertex 13.615437 107.154564 11.100025
    endloop
  endfacet
  facet normal 0.127010 -0.991901 0.000000
    outer loop
      vertex 14.036030 107.208420 11.100025
      vertex 14.036030 107.208420 18.100025
      vertex 13.615437 107.154564 11.100025
    endloop
  endfacet
  facet normal -0.042427 -0.999100 0.000000
    outer loop
      vertex 14.459677 107.190430 18.100025
      vertex 14.036030 107.208420 18.100025
      vertex 14.036030 107.208420 11.100025
    endloop
  endfacet
  facet normal -0.042427 -0.999100 0.000000
    outer loop
      vertex 14.459677 107.190430 11.100025
      vertex 14.459677 107.190430 18.100025
      vertex 14.036030 107.208420 11.100025
    endloop
  endfacet
  facet normal -0.210675 -0.977556 0.000000
    outer loop
      vertex 14.874190 107.101097 18.100025
      vertex 14.459677 107.190430 18.100025
      vertex 14.459677 107.190430 11.100025
    endloop
  endfacet
  facet normal -0.210675 -0.977556 0.000000
    outer loop
      vertex 14.874190 107.101097 11.100025
      vertex 14.874190 107.101097 18.100025
      vertex 14.459677 107.190430 11.100025
    endloop
  endfacet
  facet normal -0.372856 -0.927889 0.000000
    outer loop
      vertex 15.267648 106.942993 18.100025
      vertex 14.874190 107.101097 18.100025
      vertex 14.874190 107.101097 11.100025
    endloop
  endfacet
  facet normal -0.372856 -0.927889 0.000000
    outer loop
      vertex 15.267648 106.942993 11.100025
      vertex 15.267648 106.942993 18.100025
      vertex 14.874190 107.101097 11.100025
    endloop
  endfacet
  facet normal -0.524309 -0.851528 0.000000
    outer loop
      vertex 15.628717 106.720673 18.100025
      vertex 15.267648 106.942993 18.100025
      vertex 15.267648 106.942993 11.100025
    endloop
  endfacet
  facet normal -0.524309 -0.851528 0.000000
    outer loop
      vertex 15.628717 106.720673 11.100025
      vertex 15.628717 106.720673 18.100025
      vertex 15.267648 106.942993 11.100025
    endloop
  endfacet
  facet normal -0.660676 -0.750671 0.000000
    outer loop
      vertex 15.947021 106.440529 18.100025
      vertex 15.628717 106.720673 18.100025
      vertex 15.628717 106.720673 11.100025
    endloop
  endfacet
  facet normal -0.660676 -0.750671 0.000000
    outer loop
      vertex 15.947021 106.440529 11.100025
      vertex 15.947021 106.440529 18.100025
      vertex 15.628717 106.720673 11.100025
    endloop
  endfacet
  facet normal -0.778031 -0.628226 0.000000
    outer loop
      vertex 16.213409 106.110619 18.100025
      vertex 15.947021 106.440529 18.100025
      vertex 15.947021 106.440529 11.100025
    endloop
  endfacet
  facet normal -0.778031 -0.628226 0.000000
    outer loop
      vertex 16.213409 106.110619 11.100025
      vertex 16.213409 106.110619 18.100025
      vertex 15.947021 106.440529 11.100025
    endloop
  endfacet
  facet normal -0.873018 -0.487688 0.000000
    outer loop
      vertex 16.420208 105.740425 18.100025
      vertex 16.213409 106.110619 18.100025
      vertex 16.213409 106.110619 11.100025
    endloop
  endfacet
  facet normal -0.873018 -0.487688 0.000000
    outer loop
      vertex 16.420208 105.740425 11.100025
      vertex 16.420208 105.740425 18.100025
      vertex 16.213409 106.110619 11.100025
    endloop
  endfacet
  facet normal -0.942880 -0.333133 0.000000
    outer loop
      vertex 16.561464 105.340622 18.100025
      vertex 16.420208 105.740425 18.100025
      vertex 16.420208 105.740425 11.100025
    endloop
  endfacet
  facet normal -0.942880 -0.333133 0.000000
    outer loop
      vertex 16.561464 105.340622 11.100025
      vertex 16.561464 105.340622 18.100025
      vertex 16.420208 105.740425 11.100025
    endloop
  endfacet
  facet normal -0.985614 -0.169013 0.000000
    outer loop
      vertex 16.633131 104.922691 18.100025
      vertex 16.561464 105.340622 18.100025
      vertex 16.561464 105.340622 11.100025
    endloop
  endfacet
  facet normal -0.985614 -0.169013 0.000000
    outer loop
      vertex 16.633131 104.922691 11.100025
      vertex 16.633131 104.922691 18.100025
      vertex 16.561464 105.340622 11.100025
    endloop
  endfacet
  facet normal -0.999099 -0.042443 0.000000
    outer loop
      vertex 16.642138 104.710678 18.100025
      vertex 16.633131 104.922691 18.100025
      vertex 16.633131 104.922691 11.100025
    endloop
  endfacet
  facet normal -0.999099 -0.042443 0.000000
    outer loop
      vertex 16.642138 104.710678 11.100025
      vertex 16.642138 104.710678 18.100025
      vertex 16.633131 104.922691 11.100025
    endloop
  endfacet
  facet normal -0.999099 0.042443 0.000000
    outer loop
      vertex 16.633131 104.498665 18.100025
      vertex 16.642138 104.710678 18.100025
      vertex 16.642138 104.710678 11.100025
    endloop
  endfacet
  facet normal -0.999099 0.042443 0.000000
    outer loop
      vertex 16.633131 104.498665 11.100025
      vertex 16.633131 104.498665 18.100025
      vertex 16.642138 104.710678 11.100025
    endloop
  endfacet
  facet normal -0.985614 0.169013 0.000000
    outer loop
      vertex 16.561464 104.080734 18.100025
      vertex 16.633131 104.498665 18.100025
      vertex 16.633131 104.498665 11.100025
    endloop
  endfacet
  facet normal -0.985614 0.169013 0.000000
    outer loop
      vertex 16.561464 104.080734 11.100025
      vertex 16.561464 104.080734 18.100025
      vertex 16.633131 104.498665 11.100025
    endloop
  endfacet
  facet normal -0.942882 0.333128 0.000000
    outer loop
      vertex 16.420208 103.680923 18.100025
      vertex 16.561464 104.080734 18.100025
      vertex 16.561464 104.080734 11.100025
    endloop
  endfacet
  facet normal -0.942882 0.333128 0.000000
    outer loop
      vertex 16.420208 103.680923 11.100025
      vertex 16.420208 103.680923 18.100025
      vertex 16.561464 104.080734 11.100025
    endloop
  endfacet
  facet normal -0.873010 0.487703 0.000000
    outer loop
      vertex 16.213409 103.310745 18.100025
      vertex 16.420208 103.680923 18.100025
      vertex 16.420208 103.680923 11.100025
    endloop
  endfacet
  facet normal -0.873010 0.487703 0.000000
    outer loop
      vertex 16.213409 103.310745 11.100025
      vertex 16.213409 103.310745 18.100025
      vertex 16.420208 103.680923 11.100025
    endloop
  endfacet
  facet normal -0.778038 0.628217 0.000000
    outer loop
      vertex 15.947021 102.980827 18.100025
      vertex 16.213409 103.310745 18.100025
      vertex 16.213409 103.310745 11.100025
    endloop
  endfacet
  facet normal -0.778038 0.628217 0.000000
    outer loop
      vertex 15.947021 102.980827 11.100025
      vertex 15.947021 102.980827 18.100025
      vertex 16.213409 103.310745 11.100025
    endloop
  endfacet
  facet normal -0.660676 0.750671 0.000000
    outer loop
      vertex 15.628717 102.700684 18.100025
      vertex 15.947021 102.980827 18.100025
      vertex 15.947021 102.980827 11.100025
    endloop
  endfacet
  facet normal -0.660676 0.750671 0.000000
    outer loop
      vertex 15.628717 102.700684 11.100025
      vertex 15.628717 102.700684 18.100025
      vertex 15.947021 102.980827 11.100025
    endloop
  endfacet
  facet normal -0.524309 0.851528 0.000000
    outer loop
      vertex 15.267648 102.478363 18.100025
      vertex 15.628717 102.700684 18.100025
      vertex 15.628717 102.700684 11.100025
    endloop
  endfacet
  facet normal -0.524309 0.851528 0.000000
    outer loop
      vertex 15.267648 102.478363 11.100025
      vertex 15.267648 102.478363 18.100025
      vertex 15.628717 102.700684 11.100025
    endloop
  endfacet
  facet normal -0.372856 0.927889 0.000000
    outer loop
      vertex 14.874190 102.320259 18.100025
      vertex 15.267648 102.478363 18.100025
      vertex 15.267648 102.478363 11.100025
    endloop
  endfacet
  facet normal -0.372856 0.927889 0.000000
    outer loop
      vertex 14.874190 102.320259 11.100025
      vertex 14.874190 102.320259 18.100025
      vertex 15.267648 102.478363 11.100025
    endloop
  endfacet
  facet normal -0.210675 0.977556 0.000000
    outer loop
      vertex 14.459677 102.230927 18.100025
      vertex 14.874190 102.320259 18.100025
      vertex 14.874190 102.320259 11.100025
    endloop
  endfacet
  facet normal -0.210675 0.977556 0.000000
    outer loop
      vertex 14.459677 102.230927 11.100025
      vertex 14.459677 102.230927 18.100025
      vertex 14.874190 102.320259 11.100025
    endloop
  endfacet
  facet normal -0.042445 0.999099 0.000000
    outer loop
      vertex 14.036030 102.212929 18.100025
      vertex 14.459677 102.230927 18.100025
      vertex 14.459677 102.230927 11.100025
    endloop
  endfacet
  facet normal -0.042445 0.999099 0.000000
    outer loop
      vertex 14.036030 102.212929 11.100025
      vertex 14.036030 102.212929 18.100025
      vertex 14.459677 102.230927 11.100025
    endloop
  endfacet
  facet normal 0.127010 0.991901 0.000000
    outer loop
      vertex 13.615437 102.266785 18.100025
      vertex 14.036030 102.212929 18.100025
      vertex 14.036030 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.127010 0.991901 -0.000000
    outer loop
      vertex 13.615437 102.266785 11.100025
      vertex 13.615437 102.266785 18.100025
      vertex 14.036030 102.212929 11.100025
    endloop
  endfacet
  facet normal 0.292828 0.956165 0.000000
    outer loop
      vertex 13.209991 102.390953 18.100025
      vertex 13.615437 102.266785 18.100025
      vertex 13.615437 102.266785 11.100025
    endloop
  endfacet
  facet normal 0.292828 0.956165 -0.000000
    outer loop
      vertex 13.209991 102.390953 11.100025
      vertex 13.209991 102.390953 18.100025
      vertex 13.615437 102.266785 11.100025
    endloop
  endfacet
  facet normal 0.450212 0.892922 0.000000
    outer loop
      vertex 12.831367 102.581856 18.100025
      vertex 13.209991 102.390953 18.100025
      vertex 13.209991 102.390953 11.100025
    endloop
  endfacet
  facet normal 0.450212 0.892922 -0.000000
    outer loop
      vertex 12.831367 102.581856 11.100025
      vertex 12.831367 102.581856 18.100025
      vertex 13.209991 102.390953 11.100025
    endloop
  endfacet
  facet normal 0.594628 0.804001 0.000000
    outer loop
      vertex 12.490452 102.833992 18.100025
      vertex 12.831367 102.581856 18.100025
      vertex 12.831367 102.581856 11.100025
    endloop
  endfacet
  facet normal 0.594628 0.804001 -0.000000
    outer loop
      vertex 12.490452 102.833992 11.100025
      vertex 12.490452 102.833992 18.100025
      vertex 12.831367 102.581856 11.100025
    endloop
  endfacet
  facet normal 0.721961 0.691934 0.000000
    outer loop
      vertex 12.197047 103.140129 18.100025
      vertex 12.490452 102.833992 18.100025
      vertex 12.490452 102.833992 11.100025
    endloop
  endfacet
  facet normal 0.721961 0.691934 -0.000000
    outer loop
      vertex 12.197047 103.140129 11.100025
      vertex 12.197047 103.140129 18.100025
      vertex 12.490452 102.833992 11.100025
    endloop
  endfacet
  facet normal 0.828504 0.559983 0.000000
    outer loop
      vertex 11.959598 103.491440 18.100025
      vertex 12.197047 103.140129 18.100025
      vertex 12.197047 103.140129 11.100025
    endloop
  endfacet
  facet normal 0.828504 0.559983 -0.000000
    outer loop
      vertex 11.959598 103.491440 11.100025
      vertex 11.959598 103.491440 18.100025
      vertex 12.197047 103.140129 11.100025
    endloop
  endfacet
  facet normal 0.911231 0.411896 0.000000
    outer loop
      vertex 11.784941 103.877831 18.100025
      vertex 11.959598 103.491440 18.100025
      vertex 11.959598 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.911231 0.411896 -0.000000
    outer loop
      vertex 11.784941 103.877831 11.100025
      vertex 11.784941 103.877831 18.100025
      vertex 11.959598 103.491440 11.100025
    endloop
  endfacet
  facet normal 0.967731 0.251984 0.000000
    outer loop
      vertex 11.678092 104.288177 18.100025
      vertex 11.784941 103.877831 18.100025
      vertex 11.784941 103.877831 11.100025
    endloop
  endfacet
  facet normal 0.967731 0.251984 -0.000000
    outer loop
      vertex 11.678092 104.288177 11.100025
      vertex 11.678092 104.288177 18.100025
      vertex 11.784941 103.877831 11.100025
    endloop
  endfacet
  facet normal 0.996398 0.084797 0.000000
    outer loop
      vertex 11.642136 104.710678 18.100025
      vertex 11.678092 104.288177 18.100025
      vertex 11.678092 104.288177 11.100025
    endloop
  endfacet
  facet normal 0.996398 0.084797 -0.000000
    outer loop
      vertex 11.642136 104.710678 11.100025
      vertex 11.642136 104.710678 18.100025
      vertex 11.678092 104.288177 11.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 32.426407 52.426407 11.100025
      vertex 32.426407 52.426407 18.100025
      vertex 32.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 32.426407 66.426407 11.100025
      vertex 32.426407 52.426407 11.100025
      vertex 32.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 45.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 32.426407 66.426407 18.100025
      vertex 35.765850 38.314171 18.100025
      vertex 36.091396 38.398148 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 86.426407 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 54.385723 84.426407 18.100025
      vertex 52.426407 86.426407 18.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 52.426407 86.426407 18.100025
      vertex 54.385723 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 54.385723 82.426407 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 54.385723 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 42.391396 84.426407 18.100025
      vertex 37.990067 83.673386 18.100025
      vertex 38.176853 83.393845 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 35.458965 38.176853 18.100025
      vertex 35.765850 38.314171 18.100025
      vertex 32.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 136.426407 66.426407 18.100025
      vertex 164.710678 94.710678 18.100025
      vertex 134.423248 82.314270 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 136.426407 66.426407 18.100025
      vertex 134.423248 82.314270 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.130005 105.340622 18.100025
      vertex 168.840729 105.295097 18.100025
      vertex 168.551834 107.612862 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 37.759098 83.917694 18.100025
      vertex 37.990067 83.673386 18.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.398148 82.761421 18.100025
      vertex 38.426407 82.426407 18.100025
      vertex 42.391396 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 42.391396 84.426407 18.100025
      vertex 38.398148 82.761421 18.100025
      vertex 42.391396 82.426407 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 38.314171 83.086967 18.100025
      vertex 38.398148 82.761421 18.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 38.176853 83.393845 18.100025
      vertex 38.314171 83.086967 18.100025
      vertex 42.391396 84.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.429554 36.538544 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 34.438984 36.202477 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 32.426407 66.426407 18.100025
      vertex 34.429554 36.538544 18.100025
      vertex 34.476547 36.871449 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.578648 37.191772 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 34.476547 36.871449 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.732956 37.490467 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 34.578648 37.191772 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 32.426407 66.426407 18.100025
      vertex 34.732956 37.490467 18.100025
      vertex 34.935120 37.759098 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.179424 37.990067 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 34.935120 37.759098 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.458965 38.176853 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 35.179424 37.990067 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 132.761414 38.398148 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 152.353485 103.877831 18.100025
      vertex 152.246643 104.288177 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 34.935120 81.093712 18.100025
      vertex 34.732956 81.362343 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.578648 81.661041 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 34.732956 81.362343 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.476547 81.981361 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 34.578648 81.661041 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 34.476547 81.981361 18.100025
      vertex 34.429554 82.314270 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 82.650337 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 34.429554 82.314270 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 34.438984 82.650337 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.504570 82.980072 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 34.438984 82.650337 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.624470 83.294174 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 34.504570 82.980072 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 130.862747 35.179424 18.100025
      vertex 130.675949 35.458965 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 36.426407 18.100025
      vertex 130.454666 36.091396 18.100025
      vertex 130.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 134.423248 82.314270 18.100025
      vertex 134.376251 81.981361 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 134.274170 81.661041 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 134.376251 81.981361 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 134.119858 81.362343 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 134.274170 81.661041 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.426407 80.426407 18.100025
      vertex 36.091396 80.454666 18.100025
      vertex 32.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 36.091396 38.398148 18.100025
      vertex 36.426407 80.426407 18.100025
      vertex 32.426407 66.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 36.426407 38.426407 18.100025
      vertex 36.426407 80.426407 18.100025
      vertex 36.091396 38.398148 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.398148 36.091396 18.100025
      vertex 38.314171 35.765850 18.100025
      vertex 52.426407 32.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 36.426407 18.100025
      vertex 38.398148 36.091396 18.100025
      vertex 52.426407 32.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 36.426407 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 130.675949 35.458965 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.538635 35.765850 18.100025
      vertex 38.426407 36.426407 18.100025
      vertex 130.675949 35.458965 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.454666 36.091396 18.100025
      vertex 38.426407 36.426407 18.100025
      vertex 130.538635 35.765850 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 134.376251 36.871449 18.100025
      vertex 134.423248 36.538544 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 134.119858 81.362343 18.100025
      vertex 133.917694 81.093712 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 133.673386 80.862747 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 133.917694 81.093712 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 133.393845 80.675957 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 133.673386 80.862747 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.761414 80.454666 18.100025
      vertex 132.426407 80.426407 18.100025
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 132.761414 80.454666 18.100025
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 80.538635 18.100025
      vertex 132.761414 80.454666 18.100025
      vertex 136.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.393845 80.675957 18.100025
      vertex 133.086960 80.538635 18.100025
      vertex 136.426407 52.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 32.426407 66.426407 18.100025
      vertex 36.091396 80.454666 18.100025
      vertex 35.765850 80.538635 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.458965 80.675957 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 35.765850 80.538635 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 32.426407 66.426407 18.100025
      vertex 35.458965 80.675957 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.179424 80.862747 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 35.458965 80.675957 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.935120 81.093712 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 35.179424 80.862747 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 35.269062 84.057526 18.100025
      vertex 35.558636 84.228348 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.872734 84.348236 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 35.558636 84.228348 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.202477 84.413826 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 35.872734 84.348236 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 42.391396 84.426407 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 37.191776 84.274162 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 37.490467 84.119858 18.100025
      vertex 42.391396 84.426407 18.100025
      vertex 37.191776 84.274162 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 37.759098 83.917694 18.100025
      vertex 42.391396 84.426407 18.100025
      vertex 37.490467 84.119858 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 131.661041 34.578648 18.100025
      vertex 131.362350 34.732956 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 131.093704 34.935120 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 131.362350 34.732956 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.862747 35.179424 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 131.093704 34.935120 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 132.761414 38.398148 18.100025
      vertex 133.086960 38.314171 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 133.393845 38.176853 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 133.086960 38.314171 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 133.673386 37.990067 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 133.393845 38.176853 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 134.423248 36.538544 18.100025
      vertex 134.413834 36.202477 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 134.348236 35.872734 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 134.413834 36.202477 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 134.228348 35.558636 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 134.348236 35.872734 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.423248 82.314270 18.100025
      vertex 154.183990 102.266785 18.100025
      vertex 153.778534 102.390953 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 152.246643 104.288177 18.100025
      vertex 152.210678 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.246643 105.133179 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 152.210678 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 144.710678 114.710670 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 152.246643 105.133179 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.353485 105.543526 18.100025
      vertex 144.710678 114.710670 18.100025
      vertex 152.246643 105.133179 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.528137 105.929909 18.100025
      vertex 144.710678 114.710670 18.100025
      vertex 152.353485 105.543526 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 144.710678 114.710670 18.100025
      vertex 152.528137 105.929909 18.100025
      vertex 152.765594 106.281227 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.058990 106.587357 18.100025
      vertex 144.710678 114.710670 18.100025
      vertex 152.765594 106.281227 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 146.493011 116.220238 18.100025
      vertex 144.710678 114.710670 18.100025
      vertex 153.058990 106.587357 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.399918 106.839500 18.100025
      vertex 146.493011 116.220238 18.100025
      vertex 153.058990 106.587357 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 148.499496 117.415848 18.100025
      vertex 146.493011 116.220238 18.100025
      vertex 153.399918 106.839500 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.778534 107.030396 18.100025
      vertex 148.499496 117.415848 18.100025
      vertex 153.399918 106.839500 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 150.675415 118.264885 18.100025
      vertex 148.499496 117.415848 18.100025
      vertex 153.778534 107.030396 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.183990 107.154564 18.100025
      vertex 150.675415 118.264885 18.100025
      vertex 153.778534 107.030396 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.961411 118.744209 18.100025
      vertex 150.675415 118.264885 18.100025
      vertex 154.183990 107.154564 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.604584 107.208420 18.100025
      vertex 152.961411 118.744209 18.100025
      vertex 154.183990 107.154564 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.295105 118.840729 18.100025
      vertex 152.961411 118.744209 18.100025
      vertex 154.604584 107.208420 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.028229 107.190430 18.100025
      vertex 155.295105 118.840729 18.100025
      vertex 154.604584 107.208420 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 34.624470 83.294174 18.100025
      vertex 34.795284 83.583748 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.012192 83.840622 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 34.795284 83.583748 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.269062 84.057526 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 35.012192 83.840622 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 36.202477 84.413826 18.100025
      vertex 36.538548 84.423256 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.871449 84.376259 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 36.538548 84.423256 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.191776 84.274162 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 36.871449 84.376259 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 38.314171 35.765850 18.100025
      vertex 38.176853 35.458965 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 37.990067 35.179424 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 38.176853 35.458965 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 37.759098 34.935120 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 37.990067 35.179424 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 36.538548 34.429554 18.100025
      vertex 36.202477 34.438984 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.872734 34.504570 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 36.202477 34.438984 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.558636 34.624470 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 35.872734 34.504570 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 45.534267 18.100025
      vertex 5.534269 25.534269 18.100025
      vertex 25.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 36.202477 18.100025
      vertex 25.534271 45.534267 18.100025
      vertex 25.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 32.426407 52.426407 18.100025
      vertex 25.534271 45.534267 18.100025
      vertex 34.438984 36.202477 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 32.426407 66.426407 18.100025
      vertex 32.426407 52.426407 18.100025
      vertex 34.438984 36.202477 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 134.228348 35.558636 18.100025
      vertex 134.057526 35.269062 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 133.840622 35.012192 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 134.057526 35.269062 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 133.583755 34.795284 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 133.840622 35.012192 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 133.583755 34.795284 18.100025
      vertex 133.294159 34.624470 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 132.980072 34.504570 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 133.294159 34.624470 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 123.318535 25.534269 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 132.980072 34.504570 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 132.650330 34.438984 18.100025
      vertex 123.318535 25.534269 18.100025
      vertex 132.980072 34.504570 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 116.426407 32.426407 18.100025
      vertex 123.318535 25.534269 18.100025
      vertex 132.650330 34.438984 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 132.314270 34.429554 18.100025
      vertex 116.426407 32.426407 18.100025
      vertex 132.650330 34.438984 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 116.426407 32.426407 18.100025
      vertex 132.314270 34.429554 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 131.981369 34.476547 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 132.314270 34.429554 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 131.661041 34.578648 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 131.981369 34.476547 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.988739 105.740425 18.100025
      vertex 157.130005 105.340622 18.100025
      vertex 168.551834 107.612862 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 167.885361 109.851456 18.100025
      vertex 156.988739 105.740425 18.100025
      vertex 168.551834 107.612862 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.781937 106.110619 18.100025
      vertex 156.988739 105.740425 18.100025
      vertex 167.885361 109.851456 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 166.859543 111.949821 18.100025
      vertex 156.781937 106.110619 18.100025
      vertex 167.885361 109.851456 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.515564 106.440529 18.100025
      vertex 156.781937 106.110619 18.100025
      vertex 166.859543 111.949821 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 165.502304 113.850731 18.100025
      vertex 156.515564 106.440529 18.100025
      vertex 166.859543 111.949821 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.197250 106.720673 18.100025
      vertex 156.515564 106.440529 18.100025
      vertex 165.502304 113.850731 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.850723 115.502312 18.100025
      vertex 156.197250 106.720673 18.100025
      vertex 165.502304 113.850731 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.836197 106.942993 18.100025
      vertex 156.197250 106.720673 18.100025
      vertex 163.850723 115.502312 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 161.949829 116.859535 18.100025
      vertex 155.836197 106.942993 18.100025
      vertex 163.850723 115.502312 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.442749 107.101097 18.100025
      vertex 155.836197 106.942993 18.100025
      vertex 161.949829 116.859535 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 159.851456 117.885368 18.100025
      vertex 155.442749 107.101097 18.100025
      vertex 161.949829 116.859535 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.028229 107.190430 18.100025
      vertex 155.442749 107.101097 18.100025
      vertex 159.851456 117.885368 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.612854 118.551819 18.100025
      vertex 155.028229 107.190430 18.100025
      vertex 159.851456 117.885368 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.295105 118.840729 18.100025
      vertex 155.028229 107.190430 18.100025
      vertex 157.612854 118.551819 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 52.426407 32.426407 18.100025
      vertex 37.759098 34.935120 18.100025
      vertex 37.490467 34.732956 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 37.191776 34.578648 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 37.490467 34.732956 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 52.426407 32.426407 18.100025
      vertex 37.191776 34.578648 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 36.871449 34.476547 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 37.191776 34.578648 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 36.538548 34.429554 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 36.871449 34.476547 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 35.558636 34.624470 18.100025
      vertex 35.269062 34.795284 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.012192 35.012192 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 35.269062 34.795284 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.795284 35.269062 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 35.012192 35.012192 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 34.795284 35.269062 18.100025
      vertex 34.624470 35.558636 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.504570 35.872734 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 34.624470 35.558636 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 36.202477 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 34.504570 35.872734 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 136.426407 52.426407 18.100025
      vertex 133.673386 37.990067 18.100025
      vertex 133.917694 37.759098 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 134.119858 37.490467 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 133.917694 37.759098 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 136.426407 52.426407 18.100025
      vertex 134.119858 37.490467 18.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 134.274170 37.191772 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 134.119858 37.490467 18.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 134.376251 36.871449 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 134.274170 37.191772 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 164.710678 94.710678 18.100025
      vertex 156.197250 102.700684 18.100025
      vertex 155.836197 102.478363 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.423248 82.314270 18.100025
      vertex 153.778534 102.390953 18.100025
      vertex 153.399918 102.581856 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.058990 102.833992 18.100025
      vertex 134.423248 82.314270 18.100025
      vertex 153.399918 102.581856 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 134.413834 82.650337 18.100025
      vertex 134.423248 82.314270 18.100025
      vertex 153.058990 102.833992 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 164.710678 94.710678 18.100025
      vertex 155.836197 102.478363 18.100025
      vertex 155.442749 102.320259 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.028229 102.230927 18.100025
      vertex 164.710678 94.710678 18.100025
      vertex 155.442749 102.320259 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.423248 82.314270 18.100025
      vertex 164.710678 94.710678 18.100025
      vertex 155.028229 102.230927 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 154.604584 102.212929 18.100025
      vertex 134.423248 82.314270 18.100025
      vertex 155.028229 102.230927 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.183990 102.266785 18.100025
      vertex 134.423248 82.314270 18.100025
      vertex 154.604584 102.212929 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.765594 103.140129 18.100025
      vertex 132.650330 84.413826 18.100025
      vertex 132.980072 84.348236 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 54.385723 82.426407 18.100025
      vertex 130.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.454666 82.761421 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 130.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.538635 83.086967 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 130.454666 82.761421 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 116.426407 86.426407 18.100025
      vertex 130.538635 83.086967 18.100025
      vertex 130.675949 83.393845 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.862747 83.673386 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 130.675949 83.393845 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 131.093704 83.917694 18.100025
      vertex 116.426407 86.426407 18.100025
      vertex 130.862747 83.673386 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.840729 105.295097 18.100025
      vertex 157.130005 105.340622 18.100025
      vertex 157.201675 104.922691 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.210678 104.710678 18.100025
      vertex 168.840729 105.295097 18.100025
      vertex 157.201675 104.922691 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 168.744202 102.961395 18.100025
      vertex 168.840729 105.295097 18.100025
      vertex 157.210678 104.710678 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.201675 104.498665 18.100025
      vertex 168.744202 102.961395 18.100025
      vertex 157.210678 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 168.264893 100.675415 18.100025
      vertex 168.744202 102.961395 18.100025
      vertex 157.201675 104.498665 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.130005 104.080734 18.100025
      vertex 168.264893 100.675415 18.100025
      vertex 157.201675 104.498665 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 167.415848 98.499496 18.100025
      vertex 168.264893 100.675415 18.100025
      vertex 157.130005 104.080734 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.988739 103.680923 18.100025
      vertex 167.415848 98.499496 18.100025
      vertex 157.130005 104.080734 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 166.220230 96.493004 18.100025
      vertex 167.415848 98.499496 18.100025
      vertex 156.988739 103.680923 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.781937 103.310745 18.100025
      vertex 166.220230 96.493004 18.100025
      vertex 156.988739 103.680923 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 164.710678 94.710678 18.100025
      vertex 166.220230 96.493004 18.100025
      vertex 156.781937 103.310745 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.515564 102.980827 18.100025
      vertex 164.710678 94.710678 18.100025
      vertex 156.781937 103.310745 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.197250 102.700684 18.100025
      vertex 164.710678 94.710678 18.100025
      vertex 156.515564 102.980827 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.058990 102.833992 18.100025
      vertex 134.057526 83.583748 18.100025
      vertex 134.228348 83.294174 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 134.348236 82.980072 18.100025
      vertex 153.058990 102.833992 18.100025
      vertex 134.228348 83.294174 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 134.413834 82.650337 18.100025
      vertex 153.058990 102.833992 18.100025
      vertex 134.348236 82.980072 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.765594 103.140129 18.100025
      vertex 131.661041 84.274162 18.100025
      vertex 131.981369 84.376259 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 132.314270 84.423256 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 131.981369 84.376259 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 132.650330 84.413826 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 132.314270 84.423256 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.528137 103.491440 18.100025
      vertex 152.353485 103.877831 18.100025
      vertex 116.426407 86.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 131.093704 83.917694 18.100025
      vertex 152.528137 103.491440 18.100025
      vertex 116.426407 86.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.765594 103.140129 18.100025
      vertex 152.528137 103.491440 18.100025
      vertex 131.093704 83.917694 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 131.362350 84.119858 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 131.093704 83.917694 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 131.661041 84.274162 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 131.362350 84.119858 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.765594 103.140129 18.100025
      vertex 132.980072 84.348236 18.100025
      vertex 133.294159 84.228348 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 133.583755 84.057526 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 133.294159 84.228348 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.058990 102.833992 18.100025
      vertex 152.765594 103.140129 18.100025
      vertex 133.583755 84.057526 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 133.840622 83.840622 18.100025
      vertex 153.058990 102.833992 18.100025
      vertex 133.583755 84.057526 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 134.057526 83.583748 18.100025
      vertex 153.058990 102.833992 18.100025
      vertex 133.840622 83.840622 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 16.420208 105.740425 18.100025
      vertex 16.561464 105.340622 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.633131 104.922691 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 16.561464 105.340622 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 16.420208 103.680923 18.100025
      vertex 16.213409 103.310745 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 16.633131 104.922691 18.100025
      vertex 16.642138 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.633131 104.498665 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 16.642138 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 16.633131 104.498665 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 16.561464 104.080734 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 16.633131 104.498665 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 16.420208 103.680923 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 16.561464 104.080734 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 15.267648 102.478363 18.100025
      vertex 14.874190 102.320259 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.459677 102.230927 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 14.874190 102.320259 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.615437 102.266785 18.100025
      vertex 13.209991 102.390953 18.100025
      vertex 4.142136 94.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 13.615437 102.266785 18.100025
      vertex 4.142136 94.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.036030 102.212929 18.100025
      vertex 13.615437 102.266785 18.100025
      vertex 25.534271 73.318542 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.459677 102.230927 18.100025
      vertex 14.036030 102.212929 18.100025
      vertex 25.534271 73.318542 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 4.142136 94.710678 18.100025
      vertex 13.209991 102.390953 18.100025
      vertex 12.831367 102.581856 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.490452 102.833992 18.100025
      vertex 4.142136 94.710678 18.100025
      vertex 12.831367 102.581856 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 2.632573 96.493004 18.100025
      vertex 4.142136 94.710678 18.100025
      vertex 12.490452 102.833992 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.197047 103.140129 18.100025
      vertex 2.632573 96.493004 18.100025
      vertex 12.490452 102.833992 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 1.436971 98.499496 18.100025
      vertex 2.632573 96.493004 18.100025
      vertex 12.197047 103.140129 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.959598 103.491440 18.100025
      vertex 1.436971 98.499496 18.100025
      vertex 12.197047 103.140129 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.587925 100.675415 18.100025
      vertex 1.436971 98.499496 18.100025
      vertex 11.959598 103.491440 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.784941 103.877831 18.100025
      vertex 0.587925 100.675415 18.100025
      vertex 11.959598 103.491440 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.108600 102.961395 18.100025
      vertex 0.587925 100.675415 18.100025
      vertex 11.784941 103.877831 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.678092 104.288177 18.100025
      vertex 0.108600 102.961395 18.100025
      vertex 11.784941 103.877831 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.012077 105.295097 18.100025
      vertex 0.108600 102.961395 18.100025
      vertex 11.678092 104.288177 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.642136 104.710678 18.100025
      vertex 0.012077 105.295097 18.100025
      vertex 11.678092 104.288177 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.300989 107.612862 18.100025
      vertex 0.012077 105.295097 18.100025
      vertex 11.642136 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.678092 105.133179 18.100025
      vertex 0.300989 107.612862 18.100025
      vertex 11.642136 104.710678 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.967450 109.851456 18.100025
      vertex 0.300989 107.612862 18.100025
      vertex 11.678092 105.133179 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.784941 105.543526 18.100025
      vertex 0.967450 109.851456 18.100025
      vertex 11.678092 105.133179 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 1.993276 111.949821 18.100025
      vertex 0.967450 109.851456 18.100025
      vertex 11.784941 105.543526 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.959598 105.929909 18.100025
      vertex 1.993276 111.949821 18.100025
      vertex 11.784941 105.543526 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 3.350496 113.850731 18.100025
      vertex 1.993276 111.949821 18.100025
      vertex 11.959598 105.929909 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.197047 106.281227 18.100025
      vertex 3.350496 113.850731 18.100025
      vertex 11.959598 105.929909 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 5.002081 115.502312 18.100025
      vertex 3.350496 113.850731 18.100025
      vertex 12.197047 106.281227 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.490452 106.587357 18.100025
      vertex 5.002081 115.502312 18.100025
      vertex 12.197047 106.281227 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 6.902985 116.859535 18.100025
      vertex 5.002081 115.502312 18.100025
      vertex 12.490452 106.587357 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.831367 106.839500 18.100025
      vertex 6.902985 116.859535 18.100025
      vertex 12.490452 106.587357 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 9.001359 117.885368 18.100025
      vertex 6.902985 116.859535 18.100025
      vertex 12.831367 106.839500 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.209991 107.030396 18.100025
      vertex 9.001359 117.885368 18.100025
      vertex 12.831367 106.839500 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.239953 118.551819 18.100025
      vertex 9.001359 117.885368 18.100025
      vertex 13.209991 107.030396 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.615437 107.154564 18.100025
      vertex 11.239953 118.551819 18.100025
      vertex 13.209991 107.030396 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.557710 118.840729 18.100025
      vertex 11.239953 118.551819 18.100025
      vertex 13.615437 107.154564 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.036030 107.208420 18.100025
      vertex 13.557710 118.840729 18.100025
      vertex 13.615437 107.154564 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 15.891411 118.744209 18.100025
      vertex 13.557710 118.840729 18.100025
      vertex 14.036030 107.208420 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 14.459677 107.190430 18.100025
      vertex 15.891411 118.744209 18.100025
      vertex 14.036030 107.208420 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 18.177397 118.264885 18.100025
      vertex 15.891411 118.744209 18.100025
      vertex 14.459677 107.190430 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 14.874190 107.101097 18.100025
      vertex 18.177397 118.264885 18.100025
      vertex 14.459677 107.190430 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 20.353310 117.415848 18.100025
      vertex 18.177397 118.264885 18.100025
      vertex 14.874190 107.101097 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 15.267648 106.942993 18.100025
      vertex 20.353310 117.415848 18.100025
      vertex 14.874190 107.101097 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 22.359804 116.220238 18.100025
      vertex 20.353310 117.415848 18.100025
      vertex 15.267648 106.942993 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 15.628717 106.720673 18.100025
      vertex 22.359804 116.220238 18.100025
      vertex 15.267648 106.942993 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 24.142132 114.710670 18.100025
      vertex 22.359804 116.220238 18.100025
      vertex 15.628717 106.720673 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 15.947021 106.440529 18.100025
      vertex 24.142132 114.710670 18.100025
      vertex 15.628717 106.720673 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 113.318542 18.100025
      vertex 24.142132 114.710670 18.100025
      vertex 15.947021 106.440529 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.213409 106.110619 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 15.947021 106.440529 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.420208 105.740425 18.100025
      vertex 25.534271 113.318542 18.100025
      vertex 16.213409 106.110619 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 73.318542 18.100025
      vertex 16.213409 103.310745 18.100025
      vertex 15.947021 102.980827 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.628717 102.700684 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 15.947021 102.980827 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.267648 102.478363 18.100025
      vertex 25.534271 73.318542 18.100025
      vertex 15.628717 102.700684 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 144.710678 4.142136 18.100025
      vertex 153.058990 12.265455 18.100025
      vertex 152.765594 12.571585 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.778534 16.461857 18.100025
      vertex 154.183990 16.586025 18.100025
      vertex 163.318542 25.534269 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 123.318535 25.534269 18.100025
      vertex 153.778534 16.461857 18.100025
      vertex 163.318542 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 153.399918 16.270958 18.100025
      vertex 153.778534 16.461857 18.100025
      vertex 123.318535 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 153.058990 16.018816 18.100025
      vertex 153.399918 16.270958 18.100025
      vertex 123.318535 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 154.183990 16.586025 18.100025
      vertex 154.604584 16.639881 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.028229 16.621883 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 154.604584 16.639881 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.442749 16.532551 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 155.028229 16.621883 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.353485 13.309285 18.100025
      vertex 152.246643 13.719633 18.100025
      vertex 123.318535 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 144.710678 4.142136 18.100025
      vertex 152.353485 13.309285 18.100025
      vertex 123.318535 25.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.528137 12.922898 18.100025
      vertex 152.353485 13.309285 18.100025
      vertex 144.710678 4.142136 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.765594 12.571585 18.100025
      vertex 152.528137 12.922898 18.100025
      vertex 144.710678 4.142136 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 123.318535 25.534269 18.100025
      vertex 152.246643 13.719633 18.100025
      vertex 152.210678 14.142134 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.246643 14.564637 18.100025
      vertex 123.318535 25.534269 18.100025
      vertex 152.210678 14.142134 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.353485 14.974985 18.100025
      vertex 123.318535 25.534269 18.100025
      vertex 152.246643 14.564637 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.399918 12.013312 18.100025
      vertex 153.058990 12.265455 18.100025
      vertex 144.710678 4.142136 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 146.493011 2.632573 18.100025
      vertex 153.399918 12.013312 18.100025
      vertex 144.710678 4.142136 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.778534 11.822410 18.100025
      vertex 153.399918 12.013312 18.100025
      vertex 146.493011 2.632573 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 148.499496 1.436971 18.100025
      vertex 153.778534 11.822410 18.100025
      vertex 146.493011 2.632573 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.183990 11.698246 18.100025
      vertex 153.778534 11.822410 18.100025
      vertex 148.499496 1.436971 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 150.675415 0.587925 18.100025
      vertex 154.183990 11.698246 18.100025
      vertex 148.499496 1.436971 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.604584 11.644385 18.100025
      vertex 154.183990 11.698246 18.100025
      vertex 150.675415 0.587925 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 123.318535 25.534269 18.100025
      vertex 152.353485 14.974985 18.100025
      vertex 152.528137 15.361372 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.765594 15.712686 18.100025
      vertex 123.318535 25.534269 18.100025
      vertex 152.528137 15.361372 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.058990 16.018816 18.100025
      vertex 123.318535 25.534269 18.100025
      vertex 152.765594 15.712686 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.318542 25.534269 18.100025
      vertex 155.442749 16.532551 18.100025
      vertex 155.836197 16.374451 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.197250 16.152128 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 155.836197 16.374451 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 164.710678 24.142136 18.100025
      vertex 163.318542 25.534269 18.100025
      vertex 156.197250 16.152128 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.515564 15.871983 18.100025
      vertex 164.710678 24.142136 18.100025
      vertex 156.197250 16.152128 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 166.220230 22.359804 18.100025
      vertex 164.710678 24.142136 18.100025
      vertex 156.515564 15.871983 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.781937 15.542071 18.100025
      vertex 166.220230 22.359804 18.100025
      vertex 156.515564 15.871983 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 167.415848 20.353313 18.100025
      vertex 166.220230 22.359804 18.100025
      vertex 156.781937 15.542071 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.988739 15.171889 18.100025
      vertex 167.415848 20.353313 18.100025
      vertex 156.781937 15.542071 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.264893 18.177397 18.100025
      vertex 167.415848 20.353313 18.100025
      vertex 156.988739 15.171889 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.130005 14.772079 18.100025
      vertex 168.264893 18.177397 18.100025
      vertex 156.988739 15.171889 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.744202 15.891414 18.100025
      vertex 168.264893 18.177397 18.100025
      vertex 157.130005 14.772079 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.201675 14.354151 18.100025
      vertex 168.744202 15.891414 18.100025
      vertex 157.130005 14.772079 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.840729 13.557710 18.100025
      vertex 168.744202 15.891414 18.100025
      vertex 157.201675 14.354151 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.604584 11.644385 18.100025
      vertex 150.675415 0.587925 18.100025
      vertex 152.961411 0.108600 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.295105 0.012077 18.100025
      vertex 154.604584 11.644385 18.100025
      vertex 152.961411 0.108600 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.028229 11.662386 18.100025
      vertex 154.604584 11.644385 18.100025
      vertex 155.295105 0.012077 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.612854 0.300989 18.100025
      vertex 155.028229 11.662386 18.100025
      vertex 155.295105 0.012077 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.442749 11.751719 18.100025
      vertex 155.028229 11.662386 18.100025
      vertex 157.612854 0.300989 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 159.851456 0.967450 18.100025
      vertex 155.442749 11.751719 18.100025
      vertex 157.612854 0.300989 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.836197 11.909821 18.100025
      vertex 155.442749 11.751719 18.100025
      vertex 159.851456 0.967450 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 161.949829 1.993276 18.100025
      vertex 155.836197 11.909821 18.100025
      vertex 159.851456 0.967450 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 156.197250 12.132142 18.100025
      vertex 155.836197 11.909821 18.100025
      vertex 161.949829 1.993276 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.850723 3.350496 18.100025
      vertex 156.197250 12.132142 18.100025
      vertex 161.949829 1.993276 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 156.515564 12.412288 18.100025
      vertex 156.197250 12.132142 18.100025
      vertex 163.850723 3.350496 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 165.502304 5.002081 18.100025
      vertex 156.515564 12.412288 18.100025
      vertex 163.850723 3.350496 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 156.781937 12.742199 18.100025
      vertex 156.515564 12.412288 18.100025
      vertex 165.502304 5.002081 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 166.859543 6.902985 18.100025
      vertex 156.781937 12.742199 18.100025
      vertex 165.502304 5.002081 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 156.988739 13.112381 18.100025
      vertex 156.781937 12.742199 18.100025
      vertex 166.859543 6.902985 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 167.885361 9.001359 18.100025
      vertex 156.988739 13.112381 18.100025
      vertex 166.859543 6.902985 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.130005 13.512191 18.100025
      vertex 156.988739 13.112381 18.100025
      vertex 167.885361 9.001359 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.551834 11.239953 18.100025
      vertex 157.130005 13.512191 18.100025
      vertex 167.885361 9.001359 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.201675 13.930120 18.100025
      vertex 157.130005 13.512191 18.100025
      vertex 168.551834 11.239953 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.840729 13.557710 18.100025
      vertex 157.201675 13.930120 18.100025
      vertex 168.551834 11.239953 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.210678 14.142134 18.100025
      vertex 157.201675 13.930120 18.100025
      vertex 168.840729 13.557710 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.201675 14.354151 18.100025
      vertex 157.210678 14.142134 18.100025
      vertex 168.840729 13.557710 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.633131 13.930120 18.100025
      vertex 16.561464 13.512191 18.100025
      vertex 25.534271 5.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.642138 14.142134 18.100025
      vertex 16.633131 13.930120 18.100025
      vertex 25.534271 5.534269 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 5.534269 18.100025
      vertex 45.534271 25.534269 18.100025
      vertex 25.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 16.633131 14.354151 18.100025
      vertex 25.534271 5.534269 18.100025
      vertex 25.534271 25.534269 18.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 16.642138 14.142134 18.100025
      vertex 25.534271 5.534269 18.100025
      vertex 16.633131 14.354151 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.213409 15.542071 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 15.947021 15.871983 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 5.534269 25.534269 18.100025
      vertex 13.209991 16.461857 18.100025
      vertex 13.615437 16.586025 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.036030 16.639881 18.100025
      vertex 5.534269 25.534269 18.100025
      vertex 13.615437 16.586025 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 5.534269 25.534269 18.100025
      vertex 14.036030 16.639881 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 14.459677 16.621883 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 14.036030 16.639881 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 14.874190 16.532551 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 14.459677 16.621883 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 16.213409 15.542071 18.100025
      vertex 16.420208 15.171889 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.561464 14.772079 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 16.420208 15.171889 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.633131 14.354151 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 16.561464 14.772079 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 25.534269 18.100025
      vertex 14.874190 16.532551 18.100025
      vertex 15.267648 16.374451 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 15.628717 16.152128 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 15.267648 16.374451 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 15.947021 15.871983 18.100025
      vertex 25.534271 25.534269 18.100025
      vertex 15.628717 16.152128 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 25.534271 5.534269 18.100025
      vertex 16.561464 13.512191 18.100025
      vertex 16.420208 13.112381 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 16.213409 12.742199 18.100025
      vertex 25.534271 5.534269 18.100025
      vertex 16.420208 13.112381 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 24.142132 4.142136 18.100025
      vertex 25.534271 5.534269 18.100025
      vertex 16.213409 12.742199 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.947021 12.412288 18.100025
      vertex 24.142132 4.142136 18.100025
      vertex 16.213409 12.742199 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 22.359804 2.632573 18.100025
      vertex 24.142132 4.142136 18.100025
      vertex 15.947021 12.412288 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.628717 12.132142 18.100025
      vertex 22.359804 2.632573 18.100025
      vertex 15.947021 12.412288 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 20.353310 1.436971 18.100025
      vertex 22.359804 2.632573 18.100025
      vertex 15.628717 12.132142 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.267648 11.909821 18.100025
      vertex 20.353310 1.436971 18.100025
      vertex 15.628717 12.132142 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 18.177397 0.587925 18.100025
      vertex 20.353310 1.436971 18.100025
      vertex 15.267648 11.909821 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.874190 11.751719 18.100025
      vertex 18.177397 0.587925 18.100025
      vertex 15.267648 11.909821 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 15.891411 0.108600 18.100025
      vertex 18.177397 0.587925 18.100025
      vertex 14.874190 11.751719 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.459677 11.662386 18.100025
      vertex 15.891411 0.108600 18.100025
      vertex 14.874190 11.751719 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.557710 0.012077 18.100025
      vertex 15.891411 0.108600 18.100025
      vertex 14.459677 11.662386 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.036030 11.644385 18.100025
      vertex 13.557710 0.012077 18.100025
      vertex 14.459677 11.662386 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 11.239953 0.300989 18.100025
      vertex 13.557710 0.012077 18.100025
      vertex 14.036030 11.644385 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.615437 11.698246 18.100025
      vertex 11.239953 0.300989 18.100025
      vertex 14.036030 11.644385 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 9.001359 0.967450 18.100025
      vertex 11.239953 0.300989 18.100025
      vertex 13.615437 11.698246 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.209991 11.822410 18.100025
      vertex 9.001359 0.967450 18.100025
      vertex 13.615437 11.698246 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 6.902985 1.993276 18.100025
      vertex 9.001359 0.967450 18.100025
      vertex 13.209991 11.822410 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.831367 12.013312 18.100025
      vertex 6.902985 1.993276 18.100025
      vertex 13.209991 11.822410 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 5.002081 3.350496 18.100025
      vertex 6.902985 1.993276 18.100025
      vertex 12.831367 12.013312 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.490452 12.265455 18.100025
      vertex 5.002081 3.350496 18.100025
      vertex 12.831367 12.013312 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 3.350496 5.002081 18.100025
      vertex 5.002081 3.350496 18.100025
      vertex 12.490452 12.265455 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.197047 12.571585 18.100025
      vertex 3.350496 5.002081 18.100025
      vertex 12.490452 12.265455 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 1.993276 6.902985 18.100025
      vertex 3.350496 5.002081 18.100025
      vertex 12.197047 12.571585 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.959598 12.922898 18.100025
      vertex 1.993276 6.902985 18.100025
      vertex 12.197047 12.571585 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.967450 9.001359 18.100025
      vertex 1.993276 6.902985 18.100025
      vertex 11.959598 12.922898 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.784941 13.309285 18.100025
      vertex 0.967450 9.001359 18.100025
      vertex 11.959598 12.922898 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.300989 11.239953 18.100025
      vertex 0.967450 9.001359 18.100025
      vertex 11.784941 13.309285 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.678092 13.719633 18.100025
      vertex 0.300989 11.239953 18.100025
      vertex 11.784941 13.309285 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.012077 13.557710 18.100025
      vertex 0.300989 11.239953 18.100025
      vertex 11.678092 13.719633 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.642136 14.142134 18.100025
      vertex 0.012077 13.557710 18.100025
      vertex 11.678092 13.719633 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.108600 15.891414 18.100025
      vertex 0.012077 13.557710 18.100025
      vertex 11.642136 14.142134 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.678092 14.564637 18.100025
      vertex 0.108600 15.891414 18.100025
      vertex 11.642136 14.142134 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.587925 18.177397 18.100025
      vertex 0.108600 15.891414 18.100025
      vertex 11.678092 14.564637 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.784941 14.974985 18.100025
      vertex 0.587925 18.177397 18.100025
      vertex 11.678092 14.564637 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 1.436971 20.353313 18.100025
      vertex 0.587925 18.177397 18.100025
      vertex 11.784941 14.974985 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.959598 15.361372 18.100025
      vertex 1.436971 20.353313 18.100025
      vertex 11.784941 14.974985 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 2.632573 22.359804 18.100025
      vertex 1.436971 20.353313 18.100025
      vertex 11.959598 15.361372 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.197047 15.712686 18.100025
      vertex 2.632573 22.359804 18.100025
      vertex 11.959598 15.361372 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 4.142136 24.142136 18.100025
      vertex 2.632573 22.359804 18.100025
      vertex 12.197047 15.712686 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.490452 16.018816 18.100025
      vertex 4.142136 24.142136 18.100025
      vertex 12.197047 15.712686 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 5.534269 25.534269 18.100025
      vertex 4.142136 24.142136 18.100025
      vertex 12.490452 16.018816 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.831367 16.270958 18.100025
      vertex 5.534269 25.534269 18.100025
      vertex 12.490452 16.018816 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.209991 16.461857 18.100025
      vertex 5.534269 25.534269 18.100025
      vertex 12.831367 16.270958 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 34.176407 16.100025
      vertex 34.176407 84.676407 16.100025
      vertex 36.426407 82.426407 16.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 36.426407 36.426407 16.100025
      vertex 34.176407 34.176407 16.100025
      vertex 36.426407 82.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 34.176407 16.100025
      vertex 34.176407 34.176407 16.100025
      vertex 36.426407 36.426407 16.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 132.426407 36.426407 16.100025
      vertex 134.676392 34.176407 16.100025
      vertex 36.426407 36.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 134.676392 84.676407 16.100025
      vertex 134.676392 34.176407 16.100025
      vertex 132.426407 36.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 132.426407 82.426407 16.100025
      vertex 134.676392 84.676407 16.100025
      vertex 132.426407 36.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 42.391396 84.426407 16.100025
      vertex 42.391396 82.426407 16.100025
      vertex 36.426407 82.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 84.676407 16.100025
      vertex 42.391396 84.426407 16.100025
      vertex 36.426407 82.426407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 54.385723 84.426407 16.100025
      vertex 42.391396 84.426407 16.100025
      vertex 34.176407 84.676407 16.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 84.676407 16.100025
      vertex 54.385723 84.426407 16.100025
      vertex 34.176407 84.676407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 54.385723 82.426407 16.100025
      vertex 54.385723 84.426407 16.100025
      vertex 134.676392 84.676407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 132.426407 82.426407 16.100025
      vertex 54.385723 82.426407 16.100025
      vertex 134.676392 84.676407 16.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 134.676392 34.176407 0.000025
      vertex 134.676392 52.426407 11.100025
      vertex 134.676392 52.426407 0.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 134.676392 66.426407 0.000025
      vertex 134.676392 84.676407 16.100025
      vertex 134.676392 84.676407 0.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 134.676392 84.676407 16.100025
      vertex 134.676392 66.426407 0.000025
      vertex 134.676392 66.426407 11.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 134.676392 52.426407 11.100025
      vertex 134.676392 84.676407 16.100025
      vertex 134.676392 66.426407 11.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 134.676392 34.176407 16.100025
      vertex 134.676392 84.676407 16.100025
      vertex 134.676392 52.426407 11.100025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 134.676392 34.176407 0.000025
      vertex 134.676392 34.176407 16.100025
      vertex 134.676392 52.426407 11.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 116.426407 84.676407 11.100025
      vertex 116.426407 84.676407 0.000025
      vertex 134.676392 84.676407 0.000025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 134.676392 84.676407 16.100025
      vertex 116.426407 84.676407 11.100025
      vertex 134.676392 84.676407 0.000025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 84.676407 11.100025
      vertex 116.426407 84.676407 11.100025
      vertex 134.676392 84.676407 16.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 34.176407 84.676407 16.100025
      vertex 52.426407 84.676407 11.100025
      vertex 134.676392 84.676407 16.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 52.426407 84.676407 0.000025
      vertex 52.426407 84.676407 11.100025
      vertex 34.176407 84.676407 16.100025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 34.176407 84.676407 0.000025
      vertex 52.426407 84.676407 0.000025
      vertex 34.176407 84.676407 16.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 34.176407 66.426407 11.100025
      vertex 34.176407 66.426407 0.000025
      vertex 34.176407 84.676407 0.000025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 34.176407 84.676407 16.100025
      vertex 34.176407 66.426407 11.100025
      vertex 34.176407 84.676407 0.000025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 34.176407 52.426407 11.100025
      vertex 34.176407 66.426407 11.100025
      vertex 34.176407 84.676407 16.100025
    endloop
  endfacet
  facet normal 1.000000 -0.000000 0.000000
    outer loop
      vertex 34.176407 34.176407 16.100025
      vertex 34.176407 52.426407 11.100025
      vertex 34.176407 84.676407 16.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 -0.000000
    outer loop
      vertex 34.176407 52.426407 0.000025
      vertex 34.176407 52.426407 11.100025
      vertex 34.176407 34.176407 16.100025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 34.176407 34.176407 0.000025
      vertex 34.176407 52.426407 0.000025
      vertex 34.176407 34.176407 16.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 52.426407 34.176407 11.100025
      vertex 52.426407 34.176407 0.000025
      vertex 34.176407 34.176407 0.000025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 34.176407 34.176407 16.100025
      vertex 52.426407 34.176407 11.100025
      vertex 34.176407 34.176407 0.000025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 34.176407 11.100025
      vertex 52.426407 34.176407 11.100025
      vertex 34.176407 34.176407 16.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 134.676392 34.176407 16.100025
      vertex 116.426407 34.176407 11.100025
      vertex 34.176407 34.176407 16.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 116.426407 34.176407 0.000025
      vertex 116.426407 34.176407 11.100025
      vertex 134.676392 34.176407 16.100025
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 134.676392 34.176407 0.000025
      vertex 116.426407 34.176407 0.000025
      vertex 134.676392 34.176407 16.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 36.426407 38.426407 18.100025
      vertex 38.426407 36.426407 18.100025
      vertex 36.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 38.426407 82.426407 18.100025
      vertex 84.426407 60.894489 18.100025
      vertex 81.290047 59.426403 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 36.426407 80.426407 18.100025
      vertex 38.426407 82.426407 18.100025
      vertex 81.290047 59.426403 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 36.426407 82.426407 18.100025
      vertex 38.426407 82.426407 18.100025
      vertex 36.426407 80.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 130.426407 36.426407 18.100025
      vertex 84.426407 57.958321 18.100025
      vertex 87.562767 59.426403 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 132.426407 38.426407 18.100025
      vertex 130.426407 36.426407 18.100025
      vertex 87.562767 59.426403 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 132.426407 36.426407 18.100025
      vertex 130.426407 36.426407 18.100025
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 84.426407 57.958321 18.100025
      vertex 38.426407 36.426407 18.100025
      vertex 36.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 81.290047 59.426403 18.100025
      vertex 84.426407 57.958321 18.100025
      vertex 36.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 87.562767 59.426403 18.100025
      vertex 84.426407 57.958321 18.100025
      vertex 81.290047 59.426403 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 84.426407 60.894489 18.100025
      vertex 87.562767 59.426403 18.100025
      vertex 81.290047 59.426403 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 132.426407 80.426407 18.100025
      vertex 87.562767 59.426403 18.100025
      vertex 84.426407 60.894489 18.100025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 130.426407 82.426407 18.100025
      vertex 132.426407 80.426407 18.100025
      vertex 84.426407 60.894489 18.100025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 132.426407 82.426407 18.100025
      vertex 132.426407 80.426407 18.100025
      vertex 130.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.423940 -0.905690 0.000000
    outer loop
      vertex 84.426407 57.958321 18.100025
      vertex 84.426407 57.958321 20.100023
      vertex 38.426407 36.426407 20.100023
    endloop
  endfacet
  facet normal 0.423940 -0.905690 0.000000
    outer loop
      vertex 38.426407 36.426407 18.100025
      vertex 84.426407 57.958321 18.100025
      vertex 38.426407 36.426407 20.100023
    endloop
  endfacet
  facet normal -0.423940 -0.905690 0.000000
    outer loop
      vertex 130.426407 36.426407 18.100025
      vertex 130.426407 36.426407 20.100023
      vertex 84.426407 57.958321 20.100023
    endloop
  endfacet
  facet normal -0.423940 -0.905690 0.000000
    outer loop
      vertex 84.426407 57.958321 18.100025
      vertex 130.426407 36.426407 18.100025
      vertex 84.426407 57.958321 20.100023
    endloop
  endfacet
  facet normal -0.996461 -0.084055 0.000000
    outer loop
      vertex 130.454666 36.091396 18.100025
      vertex 130.426407 36.426407 20.100023
      vertex 130.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal -0.996461 -0.084055 -0.000000
    outer loop
      vertex 130.454666 36.091396 20.100023
      vertex 130.426407 36.426407 20.100023
      vertex 130.454666 36.091396 18.100025
    endloop
  endfacet
  facet normal -0.968308 -0.249759 0.000000
    outer loop
      vertex 130.538635 35.765850 18.100025
      vertex 130.454666 36.091396 20.100023
      vertex 130.454666 36.091396 18.100025
    endloop
  endfacet
  facet normal -0.968308 -0.249759 -0.000000
    outer loop
      vertex 130.538635 35.765850 20.100023
      vertex 130.454666 36.091396 20.100023
      vertex 130.538635 35.765850 18.100025
    endloop
  endfacet
  facet normal -0.912792 -0.408424 0.000000
    outer loop
      vertex 130.675949 35.458965 18.100025
      vertex 130.538635 35.765850 20.100023
      vertex 130.538635 35.765850 18.100025
    endloop
  endfacet
  facet normal -0.912792 -0.408424 -0.000000
    outer loop
      vertex 130.675949 35.458965 20.100023
      vertex 130.538635 35.765850 20.100023
      vertex 130.675949 35.458965 18.100025
    endloop
  endfacet
  facet normal -0.831449 -0.555601 0.000000
    outer loop
      vertex 130.862747 35.179424 18.100025
      vertex 130.675949 35.458965 20.100023
      vertex 130.675949 35.458965 18.100025
    endloop
  endfacet
  facet normal -0.831449 -0.555601 -0.000000
    outer loop
      vertex 130.862747 35.179424 20.100023
      vertex 130.675949 35.458965 20.100023
      vertex 130.862747 35.179424 18.100025
    endloop
  endfacet
  facet normal -0.726679 -0.686977 0.000000
    outer loop
      vertex 131.093704 34.935120 18.100025
      vertex 130.862747 35.179424 20.100023
      vertex 130.862747 35.179424 18.100025
    endloop
  endfacet
  facet normal -0.726679 -0.686977 -0.000000
    outer loop
      vertex 131.093704 34.935120 20.100023
      vertex 130.862747 35.179424 20.100023
      vertex 131.093704 34.935120 18.100025
    endloop
  endfacet
  facet normal -0.601292 -0.799030 0.000000
    outer loop
      vertex 131.362350 34.732956 18.100025
      vertex 131.093704 34.935120 20.100023
      vertex 131.093704 34.935120 18.100025
    endloop
  endfacet
  facet normal -0.601292 -0.799030 -0.000000
    outer loop
      vertex 131.362350 34.732956 20.100023
      vertex 131.093704 34.935120 20.100023
      vertex 131.362350 34.732956 18.100025
    endloop
  endfacet
  facet normal -0.458984 -0.888444 0.000000
    outer loop
      vertex 131.661041 34.578648 18.100025
      vertex 131.362350 34.732956 20.100023
      vertex 131.362350 34.732956 18.100025
    endloop
  endfacet
  facet normal -0.458984 -0.888444 -0.000000
    outer loop
      vertex 131.661041 34.578648 20.100023
      vertex 131.362350 34.732956 20.100023
      vertex 131.661041 34.578648 18.100025
    endloop
  endfacet
  facet normal -0.303684 -0.952773 0.000000
    outer loop
      vertex 131.981369 34.476547 18.100025
      vertex 131.661041 34.578648 20.100023
      vertex 131.661041 34.578648 18.100025
    endloop
  endfacet
  facet normal -0.303684 -0.952773 -0.000000
    outer loop
      vertex 131.981369 34.476547 20.100023
      vertex 131.661041 34.578648 20.100023
      vertex 131.981369 34.476547 18.100025
    endloop
  endfacet
  facet normal -0.139777 -0.990183 0.000000
    outer loop
      vertex 132.314270 34.429554 18.100025
      vertex 131.981369 34.476547 20.100023
      vertex 131.981369 34.476547 18.100025
    endloop
  endfacet
  facet normal -0.139777 -0.990183 -0.000000
    outer loop
      vertex 132.314270 34.429554 20.100023
      vertex 131.981369 34.476547 20.100023
      vertex 132.314270 34.429554 18.100025
    endloop
  endfacet
  facet normal 0.028049 -0.999607 0.000000
    outer loop
      vertex 132.650330 34.438984 18.100025
      vertex 132.314270 34.429554 20.100023
      vertex 132.314270 34.429554 18.100025
    endloop
  endfacet
  facet normal 0.028049 -0.999607 0.000000
    outer loop
      vertex 132.650330 34.438984 20.100023
      vertex 132.314270 34.429554 20.100023
      vertex 132.650330 34.438984 18.100025
    endloop
  endfacet
  facet normal 0.195080 -0.980787 0.000000
    outer loop
      vertex 132.980072 34.504570 18.100025
      vertex 132.650330 34.438984 20.100023
      vertex 132.650330 34.438984 18.100025
    endloop
  endfacet
  facet normal 0.195080 -0.980787 0.000000
    outer loop
      vertex 132.980072 34.504570 20.100023
      vertex 132.650330 34.438984 20.100023
      vertex 132.980072 34.504570 18.100025
    endloop
  endfacet
  facet normal 0.356638 -0.934242 0.000000
    outer loop
      vertex 133.294159 34.624470 18.100025
      vertex 132.980072 34.504570 20.100023
      vertex 132.980072 34.504570 18.100025
    endloop
  endfacet
  facet normal 0.356638 -0.934242 0.000000
    outer loop
      vertex 133.294159 34.624470 20.100023
      vertex 132.980072 34.504570 20.100023
      vertex 133.294159 34.624470 18.100025
    endloop
  endfacet
  facet normal 0.508044 -0.861331 0.000000
    outer loop
      vertex 133.583755 34.795284 18.100025
      vertex 133.294159 34.624470 20.100023
      vertex 133.294159 34.624470 18.100025
    endloop
  endfacet
  facet normal 0.508044 -0.861331 0.000000
    outer loop
      vertex 133.583755 34.795284 20.100023
      vertex 133.294159 34.624470 20.100023
      vertex 133.583755 34.795284 18.100025
    endloop
  endfacet
  facet normal 0.645177 -0.764033 0.000000
    outer loop
      vertex 133.840622 35.012192 18.100025
      vertex 133.583755 34.795284 20.100023
      vertex 133.583755 34.795284 18.100025
    endloop
  endfacet
  facet normal 0.645177 -0.764033 0.000000
    outer loop
      vertex 133.840622 35.012192 20.100023
      vertex 133.583755 34.795284 20.100023
      vertex 133.840622 35.012192 18.100025
    endloop
  endfacet
  facet normal 0.764043 -0.645165 0.000000
    outer loop
      vertex 134.057526 35.269062 18.100025
      vertex 133.840622 35.012192 20.100023
      vertex 133.840622 35.012192 18.100025
    endloop
  endfacet
  facet normal 0.764043 -0.645165 0.000000
    outer loop
      vertex 134.057526 35.269062 20.100023
      vertex 133.840622 35.012192 20.100023
      vertex 134.057526 35.269062 18.100025
    endloop
  endfacet
  facet normal 0.861304 -0.508091 0.000000
    outer loop
      vertex 134.228348 35.558636 18.100025
      vertex 134.057526 35.269062 20.100023
      vertex 134.057526 35.269062 18.100025
    endloop
  endfacet
  facet normal 0.861304 -0.508091 0.000000
    outer loop
      vertex 134.228348 35.558636 20.100023
      vertex 134.057526 35.269062 20.100023
      vertex 134.228348 35.558636 18.100025
    endloop
  endfacet
  facet normal 0.934258 -0.356597 0.000000
    outer loop
      vertex 134.348236 35.872734 18.100025
      vertex 134.228348 35.558636 20.100023
      vertex 134.228348 35.558636 18.100025
    endloop
  endfacet
  facet normal 0.934258 -0.356597 0.000000
    outer loop
      vertex 134.348236 35.872734 20.100023
      vertex 134.228348 35.558636 20.100023
      vertex 134.348236 35.872734 18.100025
    endloop
  endfacet
  facet normal 0.980781 -0.195112 0.000000
    outer loop
      vertex 134.413834 36.202477 18.100025
      vertex 134.348236 35.872734 20.100023
      vertex 134.348236 35.872734 18.100025
    endloop
  endfacet
  facet normal 0.980781 -0.195112 0.000000
    outer loop
      vertex 134.413834 36.202477 20.100023
      vertex 134.348236 35.872734 20.100023
      vertex 134.413834 36.202477 18.100025
    endloop
  endfacet
  facet normal 0.999608 -0.028003 0.000000
    outer loop
      vertex 134.423248 36.538544 18.100025
      vertex 134.413834 36.202477 20.100023
      vertex 134.413834 36.202477 18.100025
    endloop
  endfacet
  facet normal 0.999608 -0.028003 0.000000
    outer loop
      vertex 134.423248 36.538544 20.100023
      vertex 134.413834 36.202477 20.100023
      vertex 134.423248 36.538544 18.100025
    endloop
  endfacet
  facet normal 0.990182 0.139787 0.000000
    outer loop
      vertex 134.376251 36.871449 18.100025
      vertex 134.423248 36.538544 20.100023
      vertex 134.423248 36.538544 18.100025
    endloop
  endfacet
  facet normal 0.990182 0.139787 0.000000
    outer loop
      vertex 134.376251 36.871449 20.100023
      vertex 134.423248 36.538544 20.100023
      vertex 134.376251 36.871449 18.100025
    endloop
  endfacet
  facet normal 0.952788 0.303636 0.000000
    outer loop
      vertex 134.274170 37.191772 18.100025
      vertex 134.376251 36.871449 20.100023
      vertex 134.376251 36.871449 18.100025
    endloop
  endfacet
  facet normal 0.952788 0.303636 0.000000
    outer loop
      vertex 134.274170 37.191772 20.100023
      vertex 134.376251 36.871449 20.100023
      vertex 134.274170 37.191772 18.100025
    endloop
  endfacet
  facet normal 0.888442 0.458989 0.000000
    outer loop
      vertex 134.119858 37.490467 18.100025
      vertex 134.274170 37.191772 20.100023
      vertex 134.274170 37.191772 18.100025
    endloop
  endfacet
  facet normal 0.888442 0.458989 0.000000
    outer loop
      vertex 134.119858 37.490467 20.100023
      vertex 134.274170 37.191772 20.100023
      vertex 134.119858 37.490467 18.100025
    endloop
  endfacet
  facet normal 0.799013 0.601314 0.000000
    outer loop
      vertex 133.917694 37.759098 18.100025
      vertex 134.119858 37.490467 20.100023
      vertex 134.119858 37.490467 18.100025
    endloop
  endfacet
  facet normal 0.799013 0.601314 0.000000
    outer loop
      vertex 133.917694 37.759098 20.100023
      vertex 134.119858 37.490467 20.100023
      vertex 133.917694 37.759098 18.100025
    endloop
  endfacet
  facet normal 0.686989 0.726668 0.000000
    outer loop
      vertex 133.673386 37.990067 18.100025
      vertex 133.917694 37.759098 20.100023
      vertex 133.917694 37.759098 18.100025
    endloop
  endfacet
  facet normal 0.686989 0.726668 0.000000
    outer loop
      vertex 133.673386 37.990067 20.100023
      vertex 133.917694 37.759098 20.100023
      vertex 133.673386 37.990067 18.100025
    endloop
  endfacet
  facet normal 0.555577 0.831465 0.000000
    outer loop
      vertex 133.393845 38.176853 18.100025
      vertex 133.673386 37.990067 20.100023
      vertex 133.673386 37.990067 18.100025
    endloop
  endfacet
  facet normal 0.555577 0.831465 0.000000
    outer loop
      vertex 133.393845 38.176853 20.100023
      vertex 133.673386 37.990067 20.100023
      vertex 133.393845 38.176853 18.100025
    endloop
  endfacet
  facet normal 0.408433 0.912788 0.000000
    outer loop
      vertex 133.086960 38.314171 18.100025
      vertex 133.393845 38.176853 20.100023
      vertex 133.393845 38.176853 18.100025
    endloop
  endfacet
  facet normal 0.408433 0.912788 0.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 133.393845 38.176853 20.100023
      vertex 133.086960 38.314171 18.100025
    endloop
  endfacet
  facet normal 0.249780 0.968303 0.000000
    outer loop
      vertex 132.761414 38.398148 18.100025
      vertex 133.086960 38.314171 20.100023
      vertex 133.086960 38.314171 18.100025
    endloop
  endfacet
  facet normal 0.249780 0.968303 0.000000
    outer loop
      vertex 132.761414 38.398148 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 132.761414 38.398148 18.100025
    endloop
  endfacet
  facet normal 0.084056 0.996461 0.000000
    outer loop
      vertex 132.426407 38.426407 18.100025
      vertex 132.761414 38.398148 20.100023
      vertex 132.761414 38.398148 18.100025
    endloop
  endfacet
  facet normal 0.084056 0.996461 0.000000
    outer loop
      vertex 132.426407 38.426407 20.100023
      vertex 132.761414 38.398148 20.100023
      vertex 132.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal 0.423940 0.905690 -0.000000
    outer loop
      vertex 87.562767 59.426403 18.100025
      vertex 87.562767 59.426403 20.100023
      vertex 132.426407 38.426407 20.100023
    endloop
  endfacet
  facet normal 0.423940 0.905690 -0.000000
    outer loop
      vertex 132.426407 38.426407 18.100025
      vertex 87.562767 59.426403 18.100025
      vertex 132.426407 38.426407 20.100023
    endloop
  endfacet
  facet normal 0.423940 -0.905690 0.000000
    outer loop
      vertex 132.426407 80.426407 18.100025
      vertex 132.426407 80.426407 20.100023
      vertex 87.562767 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.423940 -0.905690 0.000000
    outer loop
      vertex 87.562767 59.426403 18.100025
      vertex 132.426407 80.426407 18.100025
      vertex 87.562767 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.084056 -0.996461 0.000000
    outer loop
      vertex 132.761414 80.454666 18.100025
      vertex 132.426407 80.426407 20.100023
      vertex 132.426407 80.426407 18.100025
    endloop
  endfacet
  facet normal 0.084056 -0.996461 0.000000
    outer loop
      vertex 132.761414 80.454666 20.100023
      vertex 132.426407 80.426407 20.100023
      vertex 132.761414 80.454666 18.100025
    endloop
  endfacet
  facet normal 0.249759 -0.968308 0.000000
    outer loop
      vertex 133.086960 80.538635 18.100025
      vertex 132.761414 80.454666 20.100023
      vertex 132.761414 80.454666 18.100025
    endloop
  endfacet
  facet normal 0.249759 -0.968308 0.000000
    outer loop
      vertex 133.086960 80.538635 20.100023
      vertex 132.761414 80.454666 20.100023
      vertex 133.086960 80.538635 18.100025
    endloop
  endfacet
  facet normal 0.408443 -0.912784 0.000000
    outer loop
      vertex 133.393845 80.675957 18.100025
      vertex 133.086960 80.538635 20.100023
      vertex 133.086960 80.538635 18.100025
    endloop
  endfacet
  facet normal 0.408443 -0.912784 0.000000
    outer loop
      vertex 133.393845 80.675957 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 133.393845 80.675957 18.100025
    endloop
  endfacet
  facet normal 0.555585 -0.831460 0.000000
    outer loop
      vertex 133.673386 80.862747 18.100025
      vertex 133.393845 80.675957 20.100023
      vertex 133.393845 80.675957 18.100025
    endloop
  endfacet
  facet normal 0.555585 -0.831460 0.000000
    outer loop
      vertex 133.673386 80.862747 20.100023
      vertex 133.393845 80.675957 20.100023
      vertex 133.673386 80.862747 18.100025
    endloop
  endfacet
  facet normal 0.686983 -0.726673 0.000000
    outer loop
      vertex 133.917694 81.093712 18.100025
      vertex 133.673386 80.862747 20.100023
      vertex 133.673386 80.862747 18.100025
    endloop
  endfacet
  facet normal 0.686983 -0.726673 0.000000
    outer loop
      vertex 133.917694 81.093712 20.100023
      vertex 133.673386 80.862747 20.100023
      vertex 133.917694 81.093712 18.100025
    endloop
  endfacet
  facet normal 0.799013 -0.601314 0.000000
    outer loop
      vertex 134.119858 81.362343 18.100025
      vertex 133.917694 81.093712 20.100023
      vertex 133.917694 81.093712 18.100025
    endloop
  endfacet
  facet normal 0.799013 -0.601314 0.000000
    outer loop
      vertex 134.119858 81.362343 20.100023
      vertex 133.917694 81.093712 20.100023
      vertex 134.119858 81.362343 18.100025
    endloop
  endfacet
  facet normal 0.888445 -0.458984 0.000000
    outer loop
      vertex 134.274170 81.661041 18.100025
      vertex 134.119858 81.362343 20.100023
      vertex 134.119858 81.362343 18.100025
    endloop
  endfacet
  facet normal 0.888445 -0.458984 0.000000
    outer loop
      vertex 134.274170 81.661041 20.100023
      vertex 134.119858 81.362343 20.100023
      vertex 134.274170 81.661041 18.100025
    endloop
  endfacet
  facet normal 0.952787 -0.303639 0.000000
    outer loop
      vertex 134.376251 81.981361 18.100025
      vertex 134.274170 81.661041 20.100023
      vertex 134.274170 81.661041 18.100025
    endloop
  endfacet
  facet normal 0.952787 -0.303639 0.000000
    outer loop
      vertex 134.376251 81.981361 20.100023
      vertex 134.274170 81.661041 20.100023
      vertex 134.376251 81.981361 18.100025
    endloop
  endfacet
  facet normal 0.990182 -0.139785 0.000000
    outer loop
      vertex 134.423248 82.314270 18.100025
      vertex 134.376251 81.981361 20.100023
      vertex 134.376251 81.981361 18.100025
    endloop
  endfacet
  facet normal 0.990182 -0.139785 0.000000
    outer loop
      vertex 134.423248 82.314270 20.100023
      vertex 134.376251 81.981361 20.100023
      vertex 134.423248 82.314270 18.100025
    endloop
  endfacet
  facet normal 0.999608 0.028003 0.000000
    outer loop
      vertex 134.413834 82.650337 18.100025
      vertex 134.423248 82.314270 20.100023
      vertex 134.423248 82.314270 18.100025
    endloop
  endfacet
  facet normal 0.999608 0.028003 0.000000
    outer loop
      vertex 134.413834 82.650337 20.100023
      vertex 134.423248 82.314270 20.100023
      vertex 134.413834 82.650337 18.100025
    endloop
  endfacet
  facet normal 0.980780 0.195117 0.000000
    outer loop
      vertex 134.348236 82.980072 18.100025
      vertex 134.413834 82.650337 20.100023
      vertex 134.413834 82.650337 18.100025
    endloop
  endfacet
  facet normal 0.980780 0.195117 0.000000
    outer loop
      vertex 134.348236 82.980072 20.100023
      vertex 134.413834 82.650337 20.100023
      vertex 134.348236 82.980072 18.100025
    endloop
  endfacet
  facet normal 0.934260 0.356594 0.000000
    outer loop
      vertex 134.228348 83.294174 18.100025
      vertex 134.348236 82.980072 20.100023
      vertex 134.348236 82.980072 18.100025
    endloop
  endfacet
  facet normal 0.934260 0.356594 0.000000
    outer loop
      vertex 134.228348 83.294174 20.100023
      vertex 134.348236 82.980072 20.100023
      vertex 134.228348 83.294174 18.100025
    endloop
  endfacet
  facet normal 0.861304 0.508091 0.000000
    outer loop
      vertex 134.057526 83.583748 18.100025
      vertex 134.228348 83.294174 20.100023
      vertex 134.228348 83.294174 18.100025
    endloop
  endfacet
  facet normal 0.861304 0.508091 0.000000
    outer loop
      vertex 134.057526 83.583748 20.100023
      vertex 134.228348 83.294174 20.100023
      vertex 134.057526 83.583748 18.100025
    endloop
  endfacet
  facet normal 0.764048 0.645160 0.000000
    outer loop
      vertex 133.840622 83.840622 18.100025
      vertex 134.057526 83.583748 20.100023
      vertex 134.057526 83.583748 18.100025
    endloop
  endfacet
  facet normal 0.764048 0.645160 0.000000
    outer loop
      vertex 133.840622 83.840622 20.100023
      vertex 134.057526 83.583748 20.100023
      vertex 133.840622 83.840622 18.100025
    endloop
  endfacet
  facet normal 0.645171 0.764038 0.000000
    outer loop
      vertex 133.583755 84.057526 18.100025
      vertex 133.840622 83.840622 20.100023
      vertex 133.840622 83.840622 18.100025
    endloop
  endfacet
  facet normal 0.645171 0.764038 0.000000
    outer loop
      vertex 133.583755 84.057526 20.100023
      vertex 133.840622 83.840622 20.100023
      vertex 133.583755 84.057526 18.100025
    endloop
  endfacet
  facet normal 0.508061 0.861321 0.000000
    outer loop
      vertex 133.294159 84.228348 18.100025
      vertex 133.583755 84.057526 20.100023
      vertex 133.583755 84.057526 18.100025
    endloop
  endfacet
  facet normal 0.508061 0.861321 0.000000
    outer loop
      vertex 133.294159 84.228348 20.100023
      vertex 133.583755 84.057526 20.100023
      vertex 133.294159 84.228348 18.100025
    endloop
  endfacet
  facet normal 0.356609 0.934254 0.000000
    outer loop
      vertex 132.980072 84.348236 18.100025
      vertex 133.294159 84.228348 20.100023
      vertex 133.294159 84.228348 18.100025
    endloop
  endfacet
  facet normal 0.356609 0.934254 0.000000
    outer loop
      vertex 132.980072 84.348236 20.100023
      vertex 133.294159 84.228348 20.100023
      vertex 132.980072 84.348236 18.100025
    endloop
  endfacet
  facet normal 0.195091 0.980785 0.000000
    outer loop
      vertex 132.650330 84.413826 18.100025
      vertex 132.980072 84.348236 20.100023
      vertex 132.980072 84.348236 18.100025
    endloop
  endfacet
  facet normal 0.195091 0.980785 0.000000
    outer loop
      vertex 132.650330 84.413826 20.100023
      vertex 132.980072 84.348236 20.100023
      vertex 132.650330 84.413826 18.100025
    endloop
  endfacet
  facet normal 0.028049 0.999607 0.000000
    outer loop
      vertex 132.314270 84.423256 18.100025
      vertex 132.650330 84.413826 20.100023
      vertex 132.650330 84.413826 18.100025
    endloop
  endfacet
  facet normal 0.028049 0.999607 0.000000
    outer loop
      vertex 132.314270 84.423256 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 132.314270 84.423256 18.100025
    endloop
  endfacet
  facet normal -0.139788 0.990181 0.000000
    outer loop
      vertex 131.981369 84.376259 18.100025
      vertex 132.314270 84.423256 20.100023
      vertex 132.314270 84.423256 18.100025
    endloop
  endfacet
  facet normal -0.139788 0.990181 0.000000
    outer loop
      vertex 131.981369 84.376259 20.100023
      vertex 132.314270 84.423256 20.100023
      vertex 131.981369 84.376259 18.100025
    endloop
  endfacet
  facet normal -0.303674 0.952776 0.000000
    outer loop
      vertex 131.661041 84.274162 18.100025
      vertex 131.981369 84.376259 20.100023
      vertex 131.981369 84.376259 18.100025
    endloop
  endfacet
  facet normal -0.303674 0.952776 0.000000
    outer loop
      vertex 131.661041 84.274162 20.100023
      vertex 131.981369 84.376259 20.100023
      vertex 131.661041 84.274162 18.100025
    endloop
  endfacet
  facet normal -0.458975 0.888449 0.000000
    outer loop
      vertex 131.362350 84.119858 18.100025
      vertex 131.661041 84.274162 20.100023
      vertex 131.661041 84.274162 18.100025
    endloop
  endfacet
  facet normal -0.458975 0.888449 0.000000
    outer loop
      vertex 131.362350 84.119858 20.100023
      vertex 131.661041 84.274162 20.100023
      vertex 131.362350 84.119858 18.100025
    endloop
  endfacet
  facet normal -0.601292 0.799030 0.000000
    outer loop
      vertex 131.093704 83.917694 18.100025
      vertex 131.362350 84.119858 20.100023
      vertex 131.362350 84.119858 18.100025
    endloop
  endfacet
  facet normal -0.601292 0.799030 0.000000
    outer loop
      vertex 131.093704 83.917694 20.100023
      vertex 131.362350 84.119858 20.100023
      vertex 131.093704 83.917694 18.100025
    endloop
  endfacet
  facet normal -0.726685 0.686971 0.000000
    outer loop
      vertex 130.862747 83.673386 18.100025
      vertex 131.093704 83.917694 20.100023
      vertex 131.093704 83.917694 18.100025
    endloop
  endfacet
  facet normal -0.726685 0.686971 0.000000
    outer loop
      vertex 130.862747 83.673386 20.100023
      vertex 131.093704 83.917694 20.100023
      vertex 130.862747 83.673386 18.100025
    endloop
  endfacet
  facet normal -0.831449 0.555601 0.000000
    outer loop
      vertex 130.675949 83.393845 18.100025
      vertex 130.862747 83.673386 20.100023
      vertex 130.862747 83.673386 18.100025
    endloop
  endfacet
  facet normal -0.831449 0.555601 0.000000
    outer loop
      vertex 130.675949 83.393845 20.100023
      vertex 130.862747 83.673386 20.100023
      vertex 130.675949 83.393845 18.100025
    endloop
  endfacet
  facet normal -0.912789 0.408432 0.000000
    outer loop
      vertex 130.538635 83.086967 18.100025
      vertex 130.675949 83.393845 20.100023
      vertex 130.675949 83.393845 18.100025
    endloop
  endfacet
  facet normal -0.912789 0.408432 0.000000
    outer loop
      vertex 130.538635 83.086967 20.100023
      vertex 130.675949 83.393845 20.100023
      vertex 130.538635 83.086967 18.100025
    endloop
  endfacet
  facet normal -0.968308 0.249759 0.000000
    outer loop
      vertex 130.454666 82.761421 18.100025
      vertex 130.538635 83.086967 20.100023
      vertex 130.538635 83.086967 18.100025
    endloop
  endfacet
  facet normal -0.968308 0.249759 0.000000
    outer loop
      vertex 130.454666 82.761421 20.100023
      vertex 130.538635 83.086967 20.100023
      vertex 130.454666 82.761421 18.100025
    endloop
  endfacet
  facet normal -0.996461 0.084054 0.000000
    outer loop
      vertex 130.426407 82.426407 18.100025
      vertex 130.454666 82.761421 20.100023
      vertex 130.454666 82.761421 18.100025
    endloop
  endfacet
  facet normal -0.996461 0.084054 0.000000
    outer loop
      vertex 130.426407 82.426407 20.100023
      vertex 130.454666 82.761421 20.100023
      vertex 130.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal -0.423940 0.905690 0.000000
    outer loop
      vertex 84.426407 60.894489 18.100025
      vertex 84.426407 60.894489 20.100023
      vertex 130.426407 82.426407 20.100023
    endloop
  endfacet
  facet normal -0.423940 0.905690 0.000000
    outer loop
      vertex 130.426407 82.426407 18.100025
      vertex 84.426407 60.894489 18.100025
      vertex 130.426407 82.426407 20.100023
    endloop
  endfacet
  facet normal 0.423940 0.905690 -0.000000
    outer loop
      vertex 38.426407 82.426407 18.100025
      vertex 38.426407 82.426407 20.100023
      vertex 84.426407 60.894489 20.100023
    endloop
  endfacet
  facet normal 0.423940 0.905690 -0.000000
    outer loop
      vertex 84.426407 60.894489 18.100025
      vertex 38.426407 82.426407 18.100025
      vertex 84.426407 60.894489 20.100023
    endloop
  endfacet
  facet normal 0.996461 0.084054 0.000000
    outer loop
      vertex 38.398148 82.761421 18.100025
      vertex 38.426407 82.426407 20.100023
      vertex 38.426407 82.426407 18.100025
    endloop
  endfacet
  facet normal 0.996461 0.084054 0.000000
    outer loop
      vertex 38.398148 82.761421 20.100023
      vertex 38.426407 82.426407 20.100023
      vertex 38.398148 82.761421 18.100025
    endloop
  endfacet
  facet normal 0.968303 0.249780 0.000000
    outer loop
      vertex 38.314171 83.086967 18.100025
      vertex 38.398148 82.761421 20.100023
      vertex 38.398148 82.761421 18.100025
    endloop
  endfacet
  facet normal 0.968303 0.249780 0.000000
    outer loop
      vertex 38.314171 83.086967 20.100023
      vertex 38.398148 82.761421 20.100023
      vertex 38.314171 83.086967 18.100025
    endloop
  endfacet
  facet normal 0.912784 0.408442 0.000000
    outer loop
      vertex 38.176853 83.393845 18.100025
      vertex 38.314171 83.086967 20.100023
      vertex 38.314171 83.086967 18.100025
    endloop
  endfacet
  facet normal 0.912784 0.408442 0.000000
    outer loop
      vertex 38.176853 83.393845 20.100023
      vertex 38.314171 83.086967 20.100023
      vertex 38.176853 83.393845 18.100025
    endloop
  endfacet
  facet normal 0.831465 0.555577 0.000000
    outer loop
      vertex 37.990067 83.673386 18.100025
      vertex 38.176853 83.393845 20.100023
      vertex 38.176853 83.393845 18.100025
    endloop
  endfacet
  facet normal 0.831465 0.555577 0.000000
    outer loop
      vertex 37.990067 83.673386 20.100023
      vertex 38.176853 83.393845 20.100023
      vertex 37.990067 83.673386 18.100025
    endloop
  endfacet
  facet normal 0.726668 0.686989 0.000000
    outer loop
      vertex 37.759098 83.917694 18.100025
      vertex 37.990067 83.673386 20.100023
      vertex 37.990067 83.673386 18.100025
    endloop
  endfacet
  facet normal 0.726668 0.686989 0.000000
    outer loop
      vertex 37.759098 83.917694 20.100023
      vertex 37.990067 83.673386 20.100023
      vertex 37.759098 83.917694 18.100025
    endloop
  endfacet
  facet normal 0.601314 0.799013 0.000000
    outer loop
      vertex 37.490467 84.119858 18.100025
      vertex 37.759098 83.917694 20.100023
      vertex 37.759098 83.917694 18.100025
    endloop
  endfacet
  facet normal 0.601314 0.799013 0.000000
    outer loop
      vertex 37.490467 84.119858 20.100023
      vertex 37.759098 83.917694 20.100023
      vertex 37.490467 84.119858 18.100025
    endloop
  endfacet
  facet normal 0.458975 0.888449 0.000000
    outer loop
      vertex 37.191776 84.274162 18.100025
      vertex 37.490467 84.119858 20.100023
      vertex 37.490467 84.119858 18.100025
    endloop
  endfacet
  facet normal 0.458975 0.888449 0.000000
    outer loop
      vertex 37.191776 84.274162 20.100023
      vertex 37.490467 84.119858 20.100023
      vertex 37.191776 84.274162 18.100025
    endloop
  endfacet
  facet normal 0.303674 0.952776 0.000000
    outer loop
      vertex 36.871449 84.376259 18.100025
      vertex 37.191776 84.274162 20.100023
      vertex 37.191776 84.274162 18.100025
    endloop
  endfacet
  facet normal 0.303674 0.952776 0.000000
    outer loop
      vertex 36.871449 84.376259 20.100023
      vertex 37.191776 84.274162 20.100023
      vertex 36.871449 84.376259 18.100025
    endloop
  endfacet
  facet normal 0.139788 0.990181 0.000000
    outer loop
      vertex 36.538548 84.423256 18.100025
      vertex 36.871449 84.376259 20.100023
      vertex 36.871449 84.376259 18.100025
    endloop
  endfacet
  facet normal 0.139788 0.990181 0.000000
    outer loop
      vertex 36.538548 84.423256 20.100023
      vertex 36.871449 84.376259 20.100023
      vertex 36.538548 84.423256 18.100025
    endloop
  endfacet
  facet normal -0.028048 0.999607 0.000000
    outer loop
      vertex 36.202477 84.413826 18.100025
      vertex 36.538548 84.423256 20.100023
      vertex 36.538548 84.423256 18.100025
    endloop
  endfacet
  facet normal -0.028048 0.999607 0.000000
    outer loop
      vertex 36.202477 84.413826 20.100023
      vertex 36.538548 84.423256 20.100023
      vertex 36.202477 84.413826 18.100025
    endloop
  endfacet
  facet normal -0.195091 0.980785 0.000000
    outer loop
      vertex 35.872734 84.348236 18.100025
      vertex 36.202477 84.413826 20.100023
      vertex 36.202477 84.413826 18.100025
    endloop
  endfacet
  facet normal -0.195091 0.980785 0.000000
    outer loop
      vertex 35.872734 84.348236 20.100023
      vertex 36.202477 84.413826 20.100023
      vertex 35.872734 84.348236 18.100025
    endloop
  endfacet
  facet normal -0.356597 0.934258 0.000000
    outer loop
      vertex 35.558636 84.228348 18.100025
      vertex 35.872734 84.348236 20.100023
      vertex 35.872734 84.348236 18.100025
    endloop
  endfacet
  facet normal -0.356597 0.934258 0.000000
    outer loop
      vertex 35.558636 84.228348 20.100023
      vertex 35.872734 84.348236 20.100023
      vertex 35.558636 84.228348 18.100025
    endloop
  endfacet
  facet normal -0.508091 0.861304 0.000000
    outer loop
      vertex 35.269062 84.057526 18.100025
      vertex 35.558636 84.228348 20.100023
      vertex 35.558636 84.228348 18.100025
    endloop
  endfacet
  facet normal -0.508091 0.861304 0.000000
    outer loop
      vertex 35.269062 84.057526 20.100023
      vertex 35.558636 84.228348 20.100023
      vertex 35.269062 84.057526 18.100025
    endloop
  endfacet
  facet normal -0.645165 0.764043 0.000000
    outer loop
      vertex 35.012192 83.840622 18.100025
      vertex 35.269062 84.057526 20.100023
      vertex 35.269062 84.057526 18.100025
    endloop
  endfacet
  facet normal -0.645165 0.764043 0.000000
    outer loop
      vertex 35.012192 83.840622 20.100023
      vertex 35.269062 84.057526 20.100023
      vertex 35.012192 83.840622 18.100025
    endloop
  endfacet
  facet normal -0.764042 0.645166 0.000000
    outer loop
      vertex 34.795284 83.583748 18.100025
      vertex 35.012192 83.840622 20.100023
      vertex 35.012192 83.840622 18.100025
    endloop
  endfacet
  facet normal -0.764042 0.645166 0.000000
    outer loop
      vertex 34.795284 83.583748 20.100023
      vertex 35.012192 83.840622 20.100023
      vertex 34.795284 83.583748 18.100025
    endloop
  endfacet
  facet normal -0.861313 0.508074 0.000000
    outer loop
      vertex 34.624470 83.294174 18.100025
      vertex 34.795284 83.583748 20.100023
      vertex 34.795284 83.583748 18.100025
    endloop
  endfacet
  facet normal -0.861313 0.508074 0.000000
    outer loop
      vertex 34.624470 83.294174 20.100023
      vertex 34.795284 83.583748 20.100023
      vertex 34.624470 83.294174 18.100025
    endloop
  endfacet
  facet normal -0.934248 0.356623 0.000000
    outer loop
      vertex 34.504570 82.980072 18.100025
      vertex 34.624470 83.294174 20.100023
      vertex 34.624470 83.294174 18.100025
    endloop
  endfacet
  facet normal -0.934248 0.356623 0.000000
    outer loop
      vertex 34.504570 82.980072 20.100023
      vertex 34.624470 83.294174 20.100023
      vertex 34.504570 82.980072 18.100025
    endloop
  endfacet
  facet normal -0.980787 0.195084 0.000000
    outer loop
      vertex 34.438984 82.650337 18.100025
      vertex 34.504570 82.980072 20.100023
      vertex 34.504570 82.980072 18.100025
    endloop
  endfacet
  facet normal -0.980787 0.195084 0.000000
    outer loop
      vertex 34.438984 82.650337 20.100023
      vertex 34.504570 82.980072 20.100023
      vertex 34.438984 82.650337 18.100025
    endloop
  endfacet
  facet normal -0.999607 0.028049 0.000000
    outer loop
      vertex 34.429554 82.314270 18.100025
      vertex 34.438984 82.650337 20.100023
      vertex 34.438984 82.650337 18.100025
    endloop
  endfacet
  facet normal -0.999607 0.028049 0.000000
    outer loop
      vertex 34.429554 82.314270 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 34.429554 82.314270 18.100025
    endloop
  endfacet
  facet normal -0.990183 -0.139774 0.000000
    outer loop
      vertex 34.476547 81.981361 18.100025
      vertex 34.429554 82.314270 20.100023
      vertex 34.429554 82.314270 18.100025
    endloop
  endfacet
  facet normal -0.990183 -0.139774 -0.000000
    outer loop
      vertex 34.476547 81.981361 20.100023
      vertex 34.429554 82.314270 20.100023
      vertex 34.476547 81.981361 18.100025
    endloop
  endfacet
  facet normal -0.952771 -0.303691 0.000000
    outer loop
      vertex 34.578648 81.661041 18.100025
      vertex 34.476547 81.981361 20.100023
      vertex 34.476547 81.981361 18.100025
    endloop
  endfacet
  facet normal -0.952771 -0.303691 -0.000000
    outer loop
      vertex 34.578648 81.661041 20.100023
      vertex 34.476547 81.981361 20.100023
      vertex 34.578648 81.661041 18.100025
    endloop
  endfacet
  facet normal -0.888449 -0.458975 0.000000
    outer loop
      vertex 34.732956 81.362343 18.100025
      vertex 34.578648 81.661041 20.100023
      vertex 34.578648 81.661041 18.100025
    endloop
  endfacet
  facet normal -0.888449 -0.458975 -0.000000
    outer loop
      vertex 34.732956 81.362343 20.100023
      vertex 34.578648 81.661041 20.100023
      vertex 34.732956 81.362343 18.100025
    endloop
  endfacet
  facet normal -0.799013 -0.601314 0.000000
    outer loop
      vertex 34.935120 81.093712 18.100025
      vertex 34.732956 81.362343 20.100023
      vertex 34.732956 81.362343 18.100025
    endloop
  endfacet
  facet normal -0.799013 -0.601314 -0.000000
    outer loop
      vertex 34.935120 81.093712 20.100023
      vertex 34.732956 81.362343 20.100023
      vertex 34.935120 81.093712 18.100025
    endloop
  endfacet
  facet normal -0.686989 -0.726668 0.000000
    outer loop
      vertex 35.179424 80.862747 18.100025
      vertex 34.935120 81.093712 20.100023
      vertex 34.935120 81.093712 18.100025
    endloop
  endfacet
  facet normal -0.686989 -0.726668 -0.000000
    outer loop
      vertex 35.179424 80.862747 20.100023
      vertex 34.935120 81.093712 20.100023
      vertex 35.179424 80.862747 18.100025
    endloop
  endfacet
  facet normal -0.555585 -0.831460 0.000000
    outer loop
      vertex 35.458965 80.675957 18.100025
      vertex 35.179424 80.862747 20.100023
      vertex 35.179424 80.862747 18.100025
    endloop
  endfacet
  facet normal -0.555585 -0.831460 -0.000000
    outer loop
      vertex 35.458965 80.675957 20.100023
      vertex 35.179424 80.862747 20.100023
      vertex 35.458965 80.675957 18.100025
    endloop
  endfacet
  facet normal -0.408443 -0.912784 0.000000
    outer loop
      vertex 35.765850 80.538635 18.100025
      vertex 35.458965 80.675957 20.100023
      vertex 35.458965 80.675957 18.100025
    endloop
  endfacet
  facet normal -0.408443 -0.912784 -0.000000
    outer loop
      vertex 35.765850 80.538635 20.100023
      vertex 35.458965 80.675957 20.100023
      vertex 35.765850 80.538635 18.100025
    endloop
  endfacet
  facet normal -0.249759 -0.968308 0.000000
    outer loop
      vertex 36.091396 80.454666 18.100025
      vertex 35.765850 80.538635 20.100023
      vertex 35.765850 80.538635 18.100025
    endloop
  endfacet
  facet normal -0.249759 -0.968308 -0.000000
    outer loop
      vertex 36.091396 80.454666 20.100023
      vertex 35.765850 80.538635 20.100023
      vertex 36.091396 80.454666 18.100025
    endloop
  endfacet
  facet normal -0.084055 -0.996461 0.000000
    outer loop
      vertex 36.426407 80.426407 18.100025
      vertex 36.091396 80.454666 20.100023
      vertex 36.091396 80.454666 18.100025
    endloop
  endfacet
  facet normal -0.084055 -0.996461 -0.000000
    outer loop
      vertex 36.426407 80.426407 20.100023
      vertex 36.091396 80.454666 20.100023
      vertex 36.426407 80.426407 18.100025
    endloop
  endfacet
  facet normal -0.423940 -0.905690 0.000000
    outer loop
      vertex 81.290047 59.426403 18.100025
      vertex 81.290047 59.426403 20.100023
      vertex 36.426407 80.426407 20.100023
    endloop
  endfacet
  facet normal -0.423940 -0.905690 0.000000
    outer loop
      vertex 36.426407 80.426407 18.100025
      vertex 81.290047 59.426403 18.100025
      vertex 36.426407 80.426407 20.100023
    endloop
  endfacet
  facet normal -0.423940 0.905690 0.000000
    outer loop
      vertex 36.426407 38.426407 18.100025
      vertex 36.426407 38.426407 20.100023
      vertex 81.290047 59.426403 20.100023
    endloop
  endfacet
  facet normal -0.423940 0.905690 0.000000
    outer loop
      vertex 81.290047 59.426403 18.100025
      vertex 36.426407 38.426407 18.100025
      vertex 81.290047 59.426403 20.100023
    endloop
  endfacet
  facet normal -0.084055 0.996461 0.000000
    outer loop
      vertex 36.091396 38.398148 18.100025
      vertex 36.426407 38.426407 20.100023
      vertex 36.426407 38.426407 18.100025
    endloop
  endfacet
  facet normal -0.084055 0.996461 0.000000
    outer loop
      vertex 36.091396 38.398148 20.100023
      vertex 36.426407 38.426407 20.100023
      vertex 36.091396 38.398148 18.100025
    endloop
  endfacet
  facet normal -0.249780 0.968303 0.000000
    outer loop
      vertex 35.765850 38.314171 18.100025
      vertex 36.091396 38.398148 20.100023
      vertex 36.091396 38.398148 18.100025
    endloop
  endfacet
  facet normal -0.249780 0.968303 0.000000
    outer loop
      vertex 35.765850 38.314171 20.100023
      vertex 36.091396 38.398148 20.100023
      vertex 35.765850 38.314171 18.100025
    endloop
  endfacet
  facet normal -0.408433 0.912788 0.000000
    outer loop
      vertex 35.458965 38.176853 18.100025
      vertex 35.765850 38.314171 20.100023
      vertex 35.765850 38.314171 18.100025
    endloop
  endfacet
  facet normal -0.408433 0.912788 0.000000
    outer loop
      vertex 35.458965 38.176853 20.100023
      vertex 35.765850 38.314171 20.100023
      vertex 35.458965 38.176853 18.100025
    endloop
  endfacet
  facet normal -0.555577 0.831465 0.000000
    outer loop
      vertex 35.179424 37.990067 18.100025
      vertex 35.458965 38.176853 20.100023
      vertex 35.458965 38.176853 18.100025
    endloop
  endfacet
  facet normal -0.555577 0.831465 0.000000
    outer loop
      vertex 35.179424 37.990067 20.100023
      vertex 35.458965 38.176853 20.100023
      vertex 35.179424 37.990067 18.100025
    endloop
  endfacet
  facet normal -0.686995 0.726662 0.000000
    outer loop
      vertex 34.935120 37.759098 18.100025
      vertex 35.179424 37.990067 20.100023
      vertex 35.179424 37.990067 18.100025
    endloop
  endfacet
  facet normal -0.686995 0.726662 0.000000
    outer loop
      vertex 34.935120 37.759098 20.100023
      vertex 35.179424 37.990067 20.100023
      vertex 34.935120 37.759098 18.100025
    endloop
  endfacet
  facet normal -0.799013 0.601314 0.000000
    outer loop
      vertex 34.732956 37.490467 18.100025
      vertex 34.935120 37.759098 20.100023
      vertex 34.935120 37.759098 18.100025
    endloop
  endfacet
  facet normal -0.799013 0.601314 0.000000
    outer loop
      vertex 34.732956 37.490467 20.100023
      vertex 34.935120 37.759098 20.100023
      vertex 34.732956 37.490467 18.100025
    endloop
  endfacet
  facet normal -0.888447 0.458980 0.000000
    outer loop
      vertex 34.578648 37.191772 18.100025
      vertex 34.732956 37.490467 20.100023
      vertex 34.732956 37.490467 18.100025
    endloop
  endfacet
  facet normal -0.888447 0.458980 0.000000
    outer loop
      vertex 34.578648 37.191772 20.100023
      vertex 34.732956 37.490467 20.100023
      vertex 34.578648 37.191772 18.100025
    endloop
  endfacet
  facet normal -0.952772 0.303687 0.000000
    outer loop
      vertex 34.476547 36.871449 18.100025
      vertex 34.578648 37.191772 20.100023
      vertex 34.578648 37.191772 18.100025
    endloop
  endfacet
  facet normal -0.952772 0.303687 0.000000
    outer loop
      vertex 34.476547 36.871449 20.100023
      vertex 34.578648 37.191772 20.100023
      vertex 34.476547 36.871449 18.100025
    endloop
  endfacet
  facet normal -0.990183 0.139775 0.000000
    outer loop
      vertex 34.429554 36.538544 18.100025
      vertex 34.476547 36.871449 20.100023
      vertex 34.476547 36.871449 18.100025
    endloop
  endfacet
  facet normal -0.990183 0.139775 0.000000
    outer loop
      vertex 34.429554 36.538544 20.100023
      vertex 34.476547 36.871449 20.100023
      vertex 34.429554 36.538544 18.100025
    endloop
  endfacet
  facet normal -0.999607 -0.028049 0.000000
    outer loop
      vertex 34.438984 36.202477 18.100025
      vertex 34.429554 36.538544 20.100023
      vertex 34.429554 36.538544 18.100025
    endloop
  endfacet
  facet normal -0.999607 -0.028049 -0.000000
    outer loop
      vertex 34.438984 36.202477 20.100023
      vertex 34.429554 36.538544 20.100023
      vertex 34.438984 36.202477 18.100025
    endloop
  endfacet
  facet normal -0.980787 -0.195080 0.000000
    outer loop
      vertex 34.504570 35.872734 18.100025
      vertex 34.438984 36.202477 20.100023
      vertex 34.438984 36.202477 18.100025
    endloop
  endfacet
  facet normal -0.980787 -0.195080 -0.000000
    outer loop
      vertex 34.504570 35.872734 20.100023
      vertex 34.438984 36.202477 20.100023
      vertex 34.504570 35.872734 18.100025
    endloop
  endfacet
  facet normal -0.934247 -0.356627 0.000000
    outer loop
      vertex 34.624470 35.558636 18.100025
      vertex 34.504570 35.872734 20.100023
      vertex 34.504570 35.872734 18.100025
    endloop
  endfacet
  facet normal -0.934247 -0.356627 -0.000000
    outer loop
      vertex 34.624470 35.558636 20.100023
      vertex 34.504570 35.872734 20.100023
      vertex 34.624470 35.558636 18.100025
    endloop
  endfacet
  facet normal -0.861313 -0.508074 0.000000
    outer loop
      vertex 34.795284 35.269062 18.100025
      vertex 34.624470 35.558636 20.100023
      vertex 34.624470 35.558636 18.100025
    endloop
  endfacet
  facet normal -0.861313 -0.508074 -0.000000
    outer loop
      vertex 34.795284 35.269062 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 34.795284 35.269062 18.100025
    endloop
  endfacet
  facet normal -0.764038 -0.645172 0.000000
    outer loop
      vertex 35.012192 35.012192 18.100025
      vertex 34.795284 35.269062 20.100023
      vertex 34.795284 35.269062 18.100025
    endloop
  endfacet
  facet normal -0.764038 -0.645172 -0.000000
    outer loop
      vertex 35.012192 35.012192 20.100023
      vertex 34.795284 35.269062 20.100023
      vertex 35.012192 35.012192 18.100025
    endloop
  endfacet
  facet normal -0.645172 -0.764038 0.000000
    outer loop
      vertex 35.269062 34.795284 18.100025
      vertex 35.012192 35.012192 20.100023
      vertex 35.012192 35.012192 18.100025
    endloop
  endfacet
  facet normal -0.645172 -0.764038 -0.000000
    outer loop
      vertex 35.269062 34.795284 20.100023
      vertex 35.012192 35.012192 20.100023
      vertex 35.269062 34.795284 18.100025
    endloop
  endfacet
  facet normal -0.508074 -0.861313 0.000000
    outer loop
      vertex 35.558636 34.624470 18.100025
      vertex 35.269062 34.795284 20.100023
      vertex 35.269062 34.795284 18.100025
    endloop
  endfacet
  facet normal -0.508074 -0.861313 -0.000000
    outer loop
      vertex 35.558636 34.624470 20.100023
      vertex 35.269062 34.795284 20.100023
      vertex 35.558636 34.624470 18.100025
    endloop
  endfacet
  facet normal -0.356627 -0.934247 0.000000
    outer loop
      vertex 35.872734 34.504570 18.100025
      vertex 35.558636 34.624470 20.100023
      vertex 35.558636 34.624470 18.100025
    endloop
  endfacet
  facet normal -0.356627 -0.934247 -0.000000
    outer loop
      vertex 35.872734 34.504570 20.100023
      vertex 35.558636 34.624470 20.100023
      vertex 35.872734 34.504570 18.100025
    endloop
  endfacet
  facet normal -0.195080 -0.980787 0.000000
    outer loop
      vertex 36.202477 34.438984 18.100025
      vertex 35.872734 34.504570 20.100023
      vertex 35.872734 34.504570 18.100025
    endloop
  endfacet
  facet normal -0.195080 -0.980787 -0.000000
    outer loop
      vertex 36.202477 34.438984 20.100023
      vertex 35.872734 34.504570 20.100023
      vertex 36.202477 34.438984 18.100025
    endloop
  endfacet
  facet normal -0.028048 -0.999607 0.000000
    outer loop
      vertex 36.538548 34.429554 18.100025
      vertex 36.202477 34.438984 20.100023
      vertex 36.202477 34.438984 18.100025
    endloop
  endfacet
  facet normal -0.028048 -0.999607 -0.000000
    outer loop
      vertex 36.538548 34.429554 20.100023
      vertex 36.202477 34.438984 20.100023
      vertex 36.538548 34.429554 18.100025
    endloop
  endfacet
  facet normal 0.139777 -0.990183 0.000000
    outer loop
      vertex 36.871449 34.476547 18.100025
      vertex 36.538548 34.429554 20.100023
      vertex 36.538548 34.429554 18.100025
    endloop
  endfacet
  facet normal 0.139777 -0.990183 0.000000
    outer loop
      vertex 36.871449 34.476547 20.100023
      vertex 36.538548 34.429554 20.100023
      vertex 36.871449 34.476547 18.100025
    endloop
  endfacet
  facet normal 0.303684 -0.952773 0.000000
    outer loop
      vertex 37.191776 34.578648 18.100025
      vertex 36.871449 34.476547 20.100023
      vertex 36.871449 34.476547 18.100025
    endloop
  endfacet
  facet normal 0.303684 -0.952773 0.000000
    outer loop
      vertex 37.191776 34.578648 20.100023
      vertex 36.871449 34.476547 20.100023
      vertex 37.191776 34.578648 18.100025
    endloop
  endfacet
  facet normal 0.458984 -0.888444 0.000000
    outer loop
      vertex 37.490467 34.732956 18.100025
      vertex 37.191776 34.578648 20.100023
      vertex 37.191776 34.578648 18.100025
    endloop
  endfacet
  facet normal 0.458984 -0.888444 0.000000
    outer loop
      vertex 37.490467 34.732956 20.100023
      vertex 37.191776 34.578648 20.100023
      vertex 37.490467 34.732956 18.100025
    endloop
  endfacet
  facet normal 0.601314 -0.799013 0.000000
    outer loop
      vertex 37.759098 34.935120 18.100025
      vertex 37.490467 34.732956 20.100023
      vertex 37.490467 34.732956 18.100025
    endloop
  endfacet
  facet normal 0.601314 -0.799013 0.000000
    outer loop
      vertex 37.759098 34.935120 20.100023
      vertex 37.490467 34.732956 20.100023
      vertex 37.759098 34.935120 18.100025
    endloop
  endfacet
  facet normal 0.726662 -0.686995 0.000000
    outer loop
      vertex 37.990067 35.179424 18.100025
      vertex 37.759098 34.935120 20.100023
      vertex 37.759098 34.935120 18.100025
    endloop
  endfacet
  facet normal 0.726662 -0.686995 0.000000
    outer loop
      vertex 37.990067 35.179424 20.100023
      vertex 37.759098 34.935120 20.100023
      vertex 37.990067 35.179424 18.100025
    endloop
  endfacet
  facet normal 0.831465 -0.555577 0.000000
    outer loop
      vertex 38.176853 35.458965 18.100025
      vertex 37.990067 35.179424 20.100023
      vertex 37.990067 35.179424 18.100025
    endloop
  endfacet
  facet normal 0.831465 -0.555577 0.000000
    outer loop
      vertex 38.176853 35.458965 20.100023
      vertex 37.990067 35.179424 20.100023
      vertex 38.176853 35.458965 18.100025
    endloop
  endfacet
  facet normal 0.912788 -0.408433 0.000000
    outer loop
      vertex 38.314171 35.765850 18.100025
      vertex 38.176853 35.458965 20.100023
      vertex 38.176853 35.458965 18.100025
    endloop
  endfacet
  facet normal 0.912788 -0.408433 0.000000
    outer loop
      vertex 38.314171 35.765850 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 38.314171 35.765850 18.100025
    endloop
  endfacet
  facet normal 0.968303 -0.249780 0.000000
    outer loop
      vertex 38.398148 36.091396 18.100025
      vertex 38.314171 35.765850 20.100023
      vertex 38.314171 35.765850 18.100025
    endloop
  endfacet
  facet normal 0.968303 -0.249780 0.000000
    outer loop
      vertex 38.398148 36.091396 20.100023
      vertex 38.314171 35.765850 20.100023
      vertex 38.398148 36.091396 18.100025
    endloop
  endfacet
  facet normal 0.996461 -0.084055 0.000000
    outer loop
      vertex 38.426407 36.426407 18.100025
      vertex 38.398148 36.091396 20.100023
      vertex 38.398148 36.091396 18.100025
    endloop
  endfacet
  facet normal 0.996461 -0.084055 0.000000
    outer loop
      vertex 38.426407 36.426407 20.100023
      vertex 38.398148 36.091396 20.100023
      vertex 38.426407 36.426407 18.100025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 82.426407 20.100023
      vertex 35.458965 80.675957 20.100023
      vertex 35.765850 80.538635 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.624470 35.558636 20.100023
      vertex 37.990067 35.179424 20.100023
      vertex 38.176853 35.458965 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.426407 82.426407 20.100023
      vertex 132.761414 80.454666 20.100023
      vertex 133.086960 80.538635 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 133.086960 80.538635 20.100023
      vertex 133.393845 80.675957 20.100023
      vertex 132.650330 84.413826 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.314270 84.423256 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 132.650330 84.413826 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 82.650337 20.100023
      vertex 34.429554 82.314270 20.100023
      vertex 38.426407 82.426407 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.398148 82.761421 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 38.426407 82.426407 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.314171 83.086967 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 38.398148 82.761421 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 82.426407 20.100023
      vertex 34.429554 82.314270 20.100023
      vertex 34.476547 81.981361 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 34.578648 81.661041 20.100023
      vertex 38.426407 82.426407 20.100023
      vertex 34.476547 81.981361 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 34.732956 81.362343 20.100023
      vertex 38.426407 82.426407 20.100023
      vertex 34.578648 81.661041 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.176853 35.458965 20.100023
      vertex 35.458965 38.176853 20.100023
      vertex 35.179424 37.990067 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 34.935120 37.759098 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 35.179424 37.990067 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 34.732956 37.490467 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 34.935120 37.759098 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 36.426407 20.100023
      vertex 84.426407 57.958321 20.100023
      vertex 81.290047 59.426403 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 36.426407 38.426407 20.100023
      vertex 38.426407 36.426407 20.100023
      vertex 81.290047 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.458965 38.176853 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 38.314171 35.765850 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.398148 36.091396 20.100023
      vertex 35.458965 38.176853 20.100023
      vertex 38.314171 35.765850 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.765850 38.314171 20.100023
      vertex 35.458965 38.176853 20.100023
      vertex 38.398148 36.091396 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 36.426407 20.100023
      vertex 35.765850 38.314171 20.100023
      vertex 38.398148 36.091396 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.091396 38.398148 20.100023
      vertex 35.765850 38.314171 20.100023
      vertex 38.426407 36.426407 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.426407 38.426407 20.100023
      vertex 36.091396 38.398148 20.100023
      vertex 38.426407 36.426407 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 130.454666 36.091396 20.100023
      vertex 130.538635 35.765850 20.100023
      vertex 133.086960 38.314171 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 130.426407 36.426407 20.100023
      vertex 130.454666 36.091396 20.100023
      vertex 133.086960 38.314171 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.650330 84.413826 20.100023
      vertex 133.393845 80.675957 20.100023
      vertex 133.673386 80.862747 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.917694 81.093712 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 133.673386 80.862747 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.119858 81.362343 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 133.917694 81.093712 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.426407 82.426407 20.100023
      vertex 84.426407 60.894489 20.100023
      vertex 87.562767 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.426407 80.426407 20.100023
      vertex 130.426407 82.426407 20.100023
      vertex 87.562767 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.761414 80.454666 20.100023
      vertex 130.426407 82.426407 20.100023
      vertex 132.426407 80.426407 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 82.650337 20.100023
      vertex 37.759098 83.917694 20.100023
      vertex 37.490467 84.119858 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.191776 84.274162 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 37.490467 84.119858 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.871449 84.376259 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 37.191776 84.274162 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.558636 84.228348 20.100023
      vertex 34.624470 83.294174 20.100023
      vertex 34.504570 82.980072 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 82.650337 20.100023
      vertex 35.558636 84.228348 20.100023
      vertex 34.504570 82.980072 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.872734 84.348236 20.100023
      vertex 35.558636 84.228348 20.100023
      vertex 34.438984 82.650337 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 82.426407 20.100023
      vertex 34.732956 81.362343 20.100023
      vertex 34.935120 81.093712 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 35.179424 80.862747 20.100023
      vertex 38.426407 82.426407 20.100023
      vertex 34.935120 81.093712 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 35.458965 80.675957 20.100023
      vertex 38.426407 82.426407 20.100023
      vertex 35.179424 80.862747 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.176853 35.458965 20.100023
      vertex 34.732956 37.490467 20.100023
      vertex 34.578648 37.191772 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 34.476547 36.871449 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 34.578648 37.191772 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 34.429554 36.538544 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 34.476547 36.871449 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 130.426407 36.426407 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 132.761414 38.398148 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.426407 38.426407 20.100023
      vertex 130.426407 36.426407 20.100023
      vertex 132.761414 38.398148 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 84.426407 57.958321 20.100023
      vertex 130.426407 36.426407 20.100023
      vertex 132.426407 38.426407 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 87.562767 59.426403 20.100023
      vertex 84.426407 57.958321 20.100023
      vertex 132.426407 38.426407 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 81.290047 59.426403 20.100023
      vertex 84.426407 57.958321 20.100023
      vertex 87.562767 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 84.426407 60.894489 20.100023
      vertex 81.290047 59.426403 20.100023
      vertex 87.562767 59.426403 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.426407 80.426407 20.100023
      vertex 81.290047 59.426403 20.100023
      vertex 84.426407 60.894489 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.426407 82.426407 20.100023
      vertex 36.426407 80.426407 20.100023
      vertex 84.426407 60.894489 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 36.091396 80.454666 20.100023
      vertex 36.426407 80.426407 20.100023
      vertex 38.426407 82.426407 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 35.765850 80.538635 20.100023
      vertex 36.091396 80.454666 20.100023
      vertex 38.426407 82.426407 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 132.980072 34.504570 20.100023
      vertex 133.294159 34.624470 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.583755 34.795284 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 133.294159 34.624470 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 133.583755 34.795284 20.100023
      vertex 133.840622 35.012192 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.057526 35.269062 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 133.840622 35.012192 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.228348 35.558636 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 134.057526 35.269062 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 134.228348 35.558636 20.100023
      vertex 134.348236 35.872734 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.413834 36.202477 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 134.348236 35.872734 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.393845 38.176853 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 134.413834 36.202477 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 80.538635 20.100023
      vertex 132.314270 84.423256 20.100023
      vertex 131.981369 84.376259 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 131.661041 84.274162 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 131.981369 84.376259 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 131.362350 84.119858 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 131.661041 84.274162 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 82.650337 20.100023
      vertex 38.314171 83.086967 20.100023
      vertex 38.176853 83.393845 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.990067 83.673386 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 38.176853 83.393845 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.759098 83.917694 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 37.990067 83.673386 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.438984 82.650337 20.100023
      vertex 36.871449 84.376259 20.100023
      vertex 36.538548 84.423256 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 36.202477 84.413826 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 36.538548 84.423256 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 35.872734 84.348236 20.100023
      vertex 34.438984 82.650337 20.100023
      vertex 36.202477 84.413826 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.558636 84.228348 20.100023
      vertex 35.269062 84.057526 20.100023
      vertex 35.012192 83.840622 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.795284 83.583748 20.100023
      vertex 35.558636 84.228348 20.100023
      vertex 35.012192 83.840622 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.624470 83.294174 20.100023
      vertex 35.558636 84.228348 20.100023
      vertex 34.795284 83.583748 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 38.176853 35.458965 20.100023
      vertex 34.429554 36.538544 20.100023
      vertex 34.438984 36.202477 20.100023
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 34.504570 35.872734 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 34.438984 36.202477 20.100023
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 34.624470 35.558636 20.100023
      vertex 38.176853 35.458965 20.100023
      vertex 34.504570 35.872734 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.624470 35.558636 20.100023
      vertex 37.191776 34.578648 20.100023
      vertex 37.490467 34.732956 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.759098 34.935120 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 37.490467 34.732956 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.990067 35.179424 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 37.759098 34.935120 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.650330 84.413826 20.100023
      vertex 134.119858 81.362343 20.100023
      vertex 134.274170 81.661041 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.376251 81.981361 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 134.274170 81.661041 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.423248 82.314270 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 134.376251 81.981361 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.650330 84.413826 20.100023
      vertex 134.423248 82.314270 20.100023
      vertex 134.413834 82.650337 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.348236 82.980072 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 134.413834 82.650337 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.228348 83.294174 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 134.348236 82.980072 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 80.538635 20.100023
      vertex 131.362350 84.119858 20.100023
      vertex 131.093704 83.917694 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 130.862747 83.673386 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 131.093704 83.917694 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 130.675949 83.393845 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 130.862747 83.673386 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 80.538635 20.100023
      vertex 130.675949 83.393845 20.100023
      vertex 130.538635 83.086967 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 130.454666 82.761421 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 130.538635 83.086967 20.100023
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 130.426407 82.426407 20.100023
      vertex 133.086960 80.538635 20.100023
      vertex 130.454666 82.761421 20.100023
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 35.012192 35.012192 20.100023
      vertex 35.269062 34.795284 20.100023
      vertex 34.624470 35.558636 20.100023
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 34.795284 35.269062 20.100023
      vertex 35.012192 35.012192 20.100023
      vertex 34.624470 35.558636 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 130.538635 35.765850 20.100023
      vertex 130.675949 35.458965 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 130.862747 35.179424 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 130.675949 35.458965 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 131.093704 34.935120 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 130.862747 35.179424 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.274170 37.191772 20.100023
      vertex 134.119858 37.490467 20.100023
      vertex 133.917694 37.759098 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.673386 37.990067 20.100023
      vertex 134.274170 37.191772 20.100023
      vertex 133.917694 37.759098 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.376251 36.871449 20.100023
      vertex 134.274170 37.191772 20.100023
      vertex 133.673386 37.990067 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.980072 84.348236 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 133.583755 84.057526 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.294159 84.228348 20.100023
      vertex 132.980072 84.348236 20.100023
      vertex 133.583755 84.057526 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.624470 35.558636 20.100023
      vertex 35.269062 34.795284 20.100023
      vertex 35.558636 34.624470 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 35.872734 34.504570 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 35.558636 34.624470 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.202477 34.438984 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 35.872734 34.504570 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 131.093704 34.935120 20.100023
      vertex 131.362350 34.732956 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 131.661041 34.578648 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 131.362350 34.732956 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 131.981369 34.476547 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 131.661041 34.578648 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.086960 38.314171 20.100023
      vertex 131.981369 34.476547 20.100023
      vertex 132.314270 34.429554 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 132.650330 34.438984 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 132.314270 34.429554 20.100023
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 132.980072 34.504570 20.100023
      vertex 133.086960 38.314171 20.100023
      vertex 132.650330 34.438984 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.673386 37.990067 20.100023
      vertex 133.393845 38.176853 20.100023
      vertex 134.413834 36.202477 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.423248 36.538544 20.100023
      vertex 133.673386 37.990067 20.100023
      vertex 134.413834 36.202477 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 134.376251 36.871449 20.100023
      vertex 133.673386 37.990067 20.100023
      vertex 134.423248 36.538544 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 132.650330 84.413826 20.100023
      vertex 134.228348 83.294174 20.100023
      vertex 134.057526 83.583748 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.840622 83.840622 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 134.057526 83.583748 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 133.583755 84.057526 20.100023
      vertex 132.650330 84.413826 20.100023
      vertex 133.840622 83.840622 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 34.624470 35.558636 20.100023
      vertex 36.202477 34.438984 20.100023
      vertex 36.538548 34.429554 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 36.871449 34.476547 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 36.538548 34.429554 20.100023
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 37.191776 34.578648 20.100023
      vertex 34.624470 35.558636 20.100023
      vertex 36.871449 34.476547 20.100023
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 34.176407 52.426407 11.100025
      vertex 34.176407 52.426407 0.000025
      vertex 32.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 32.426407 52.426407 11.100025
      vertex 34.176407 52.426407 11.100025
      vertex 32.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 52.426407 32.426407 11.100025
      vertex 52.426407 32.426407 0.000025
      vertex 52.426407 34.176407 0.000025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 52.426407 34.176407 11.100025
      vertex 52.426407 32.426407 11.100025
      vertex 52.426407 34.176407 0.000025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 -0.000000
    outer loop
      vertex 11.213205 31.213202 11.100025
      vertex 11.213205 31.213202 2.000025
      vertex 31.213202 11.213205 2.000025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 -0.000000
    outer loop
      vertex 31.213202 11.213205 11.100025
      vertex 11.213205 31.213202 11.100025
      vertex 31.213202 11.213205 2.000025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 52.426407 84.676407 11.100025
      vertex 52.426407 84.676407 0.000025
      vertex 52.426407 86.426407 0.000025
    endloop
  endfacet
  facet normal 1.000000 0.000000 0.000000
    outer loop
      vertex 52.426407 86.426407 11.100025
      vertex 52.426407 84.676407 11.100025
      vertex 52.426407 86.426407 0.000025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 32.426407 66.426407 11.100025
      vertex 32.426407 66.426407 0.000025
      vertex 34.176407 66.426407 0.000025
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 34.176407 66.426407 11.100025
      vertex 32.426407 66.426407 11.100025
      vertex 34.176407 66.426407 0.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 31.213202 107.639610 11.100025
      vertex 31.213202 107.639610 2.000025
      vertex 11.213205 87.639610 2.000025
    endloop
  endfacet
  facet normal -0.707107 0.707107 0.000000
    outer loop
      vertex 11.213205 87.639610 11.100025
      vertex 31.213202 107.639610 11.100025
      vertex 11.213205 87.639610 2.000025
    endloop
  endfacet
  facet normal 0.707107 0.707106 0.000000
    outer loop
      vertex 157.639603 87.639610 11.100025
      vertex 157.639603 87.639610 2.000025
      vertex 137.639618 107.639610 2.000025
    endloop
  endfacet
  facet normal 0.707107 0.707106 0.000000
    outer loop
      vertex 137.639618 107.639610 11.100025
      vertex 157.639603 87.639610 11.100025
      vertex 137.639618 107.639610 2.000025
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 134.676392 66.426407 11.100025
      vertex 134.676392 66.426407 0.000025
      vertex 136.426407 66.426407 0.000025
    endloop
  endfacet
  facet normal -0.000000 -1.000000 -0.000000
    outer loop
      vertex 136.426407 66.426407 11.100025
      vertex 134.676392 66.426407 11.100025
      vertex 136.426407 66.426407 0.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 -0.000000
    outer loop
      vertex 116.426407 86.426407 11.100025
      vertex 116.426407 86.426407 0.000025
      vertex 116.426407 84.676407 0.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 116.426407 84.676407 11.100025
      vertex 116.426407 86.426407 11.100025
      vertex 116.426407 84.676407 0.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 -0.000000
    outer loop
      vertex 116.426407 34.176407 11.100025
      vertex 116.426407 34.176407 0.000025
      vertex 116.426407 32.426407 0.000025
    endloop
  endfacet
  facet normal -1.000000 0.000000 0.000000
    outer loop
      vertex 116.426407 32.426407 11.100025
      vertex 116.426407 34.176407 11.100025
      vertex 116.426407 32.426407 0.000025
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 136.426407 52.426407 11.100025
      vertex 136.426407 52.426407 0.000025
      vertex 134.676392 52.426407 0.000025
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 134.676392 52.426407 11.100025
      vertex 136.426407 52.426407 11.100025
      vertex 134.676392 52.426407 0.000025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 137.639618 11.213205 11.100025
      vertex 137.639618 11.213205 2.000025
      vertex 157.639603 31.213202 2.000025
    endloop
  endfacet
  facet normal 0.707107 -0.707107 0.000000
    outer loop
      vertex 157.639603 31.213202 11.100025
      vertex 137.639618 11.213205 11.100025
      vertex 157.639603 31.213202 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.432602 103.680923 2.000025
      vertex 152.291336 104.080734 2.000025
      vertex 137.639618 107.639610 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.639404 103.310745 2.000025
      vertex 152.432602 103.680923 2.000025
      vertex 137.639618 107.639610 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 107.639610 2.000025
      vertex 152.291336 104.080734 2.000025
      vertex 152.219681 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.210678 104.710678 2.000025
      vertex 137.639618 107.639610 2.000025
      vertex 152.219681 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.219681 104.922691 2.000025
      vertex 137.639618 107.639610 2.000025
      vertex 152.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.639603 87.639610 2.000025
      vertex 155.237381 102.266785 2.000025
      vertex 154.816772 102.212929 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.393143 102.230927 2.000025
      vertex 157.639603 87.639610 2.000025
      vertex 154.816772 102.212929 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.978622 102.320259 2.000025
      vertex 157.639603 87.639610 2.000025
      vertex 154.393143 102.230927 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 146.493011 116.220238 2.000025
      vertex 144.710678 114.710670 2.000025
      vertex 152.905792 106.440529 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.224091 106.720673 2.000025
      vertex 146.493011 116.220238 2.000025
      vertex 152.905792 106.440529 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 148.499496 117.415848 2.000025
      vertex 146.493011 116.220238 2.000025
      vertex 153.224091 106.720673 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.585159 106.942993 2.000025
      vertex 148.499496 117.415848 2.000025
      vertex 153.224091 106.720673 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 150.675415 118.264885 2.000025
      vertex 148.499496 117.415848 2.000025
      vertex 153.585159 106.942993 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.978622 107.101097 2.000025
      vertex 150.675415 118.264885 2.000025
      vertex 153.585159 106.942993 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.961411 118.744209 2.000025
      vertex 150.675415 118.264885 2.000025
      vertex 153.978622 107.101097 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.393143 107.190430 2.000025
      vertex 152.961411 118.744209 2.000025
      vertex 153.978622 107.101097 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 155.295105 118.840729 2.000025
      vertex 152.961411 118.744209 2.000025
      vertex 154.393143 107.190430 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 154.816772 107.208420 2.000025
      vertex 155.295105 118.840729 2.000025
      vertex 154.393143 107.190430 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.612854 118.551819 2.000025
      vertex 155.295105 118.840729 2.000025
      vertex 154.816772 107.208420 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.237381 107.154564 2.000025
      vertex 157.612854 118.551819 2.000025
      vertex 154.816772 107.208420 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 159.851456 117.885368 2.000025
      vertex 157.612854 118.551819 2.000025
      vertex 155.237381 107.154564 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.642807 107.030396 2.000025
      vertex 159.851456 117.885368 2.000025
      vertex 155.237381 107.154564 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 161.949829 116.859535 2.000025
      vertex 159.851456 117.885368 2.000025
      vertex 155.642807 107.030396 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.021439 106.839500 2.000025
      vertex 161.949829 116.859535 2.000025
      vertex 155.642807 107.030396 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 163.850723 115.502312 2.000025
      vertex 161.949829 116.859535 2.000025
      vertex 156.021439 106.839500 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.362350 106.587357 2.000025
      vertex 163.850723 115.502312 2.000025
      vertex 156.021439 106.839500 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 165.502304 113.850731 2.000025
      vertex 163.850723 115.502312 2.000025
      vertex 156.362350 106.587357 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.655762 106.281227 2.000025
      vertex 165.502304 113.850731 2.000025
      vertex 156.362350 106.587357 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 166.859543 111.949821 2.000025
      vertex 165.502304 113.850731 2.000025
      vertex 156.655762 106.281227 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.893219 105.929909 2.000025
      vertex 166.859543 111.949821 2.000025
      vertex 156.655762 106.281227 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 167.885361 109.851456 2.000025
      vertex 166.859543 111.949821 2.000025
      vertex 156.893219 105.929909 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.067871 105.543526 2.000025
      vertex 167.885361 109.851456 2.000025
      vertex 156.893219 105.929909 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.551834 107.612862 2.000025
      vertex 167.885361 109.851456 2.000025
      vertex 157.067871 105.543526 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.174713 105.133179 2.000025
      vertex 168.551834 107.612862 2.000025
      vertex 157.067871 105.543526 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.840729 105.295097 2.000025
      vertex 168.551834 107.612862 2.000025
      vertex 157.174713 105.133179 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.210678 104.710678 2.000025
      vertex 168.840729 105.295097 2.000025
      vertex 157.174713 105.133179 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 168.744202 102.961395 2.000025
      vertex 168.840729 105.295097 2.000025
      vertex 157.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.174713 104.288177 2.000025
      vertex 168.744202 102.961395 2.000025
      vertex 157.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 168.264893 100.675415 2.000025
      vertex 168.744202 102.961395 2.000025
      vertex 157.174713 104.288177 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.067871 103.877831 2.000025
      vertex 168.264893 100.675415 2.000025
      vertex 157.174713 104.288177 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 167.415848 98.499496 2.000025
      vertex 168.264893 100.675415 2.000025
      vertex 157.067871 103.877831 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.893219 103.491440 2.000025
      vertex 167.415848 98.499496 2.000025
      vertex 157.067871 103.877831 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 166.220230 96.493004 2.000025
      vertex 167.415848 98.499496 2.000025
      vertex 156.893219 103.491440 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.655762 103.140129 2.000025
      vertex 166.220230 96.493004 2.000025
      vertex 156.893219 103.491440 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 164.710678 94.710678 2.000025
      vertex 166.220230 96.493004 2.000025
      vertex 156.655762 103.140129 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 107.639610 2.000025
      vertex 152.219681 104.922691 2.000025
      vertex 152.291336 105.340622 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.432602 105.740425 2.000025
      vertex 137.639618 107.639610 2.000025
      vertex 152.291336 105.340622 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 144.710678 114.710670 2.000025
      vertex 137.639618 107.639610 2.000025
      vertex 152.432602 105.740425 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.639404 106.110619 2.000025
      vertex 144.710678 114.710670 2.000025
      vertex 152.432602 105.740425 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.905792 106.440529 2.000025
      vertex 144.710678 114.710670 2.000025
      vertex 152.639404 106.110619 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.639603 87.639610 2.000025
      vertex 153.978622 102.320259 2.000025
      vertex 153.585159 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.224091 102.700684 2.000025
      vertex 157.639603 87.639610 2.000025
      vertex 153.585159 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 107.639610 2.000025
      vertex 157.639603 87.639610 2.000025
      vertex 153.224091 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.905792 102.980827 2.000025
      vertex 137.639618 107.639610 2.000025
      vertex 153.224091 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.639404 103.310745 2.000025
      vertex 137.639618 107.639610 2.000025
      vertex 152.905792 102.980827 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 164.710678 94.710678 2.000025
      vertex 156.655762 103.140129 2.000025
      vertex 156.362350 102.833992 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.021439 102.581856 2.000025
      vertex 164.710678 94.710678 2.000025
      vertex 156.362350 102.833992 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.639603 87.639610 2.000025
      vertex 164.710678 94.710678 2.000025
      vertex 156.021439 102.581856 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.642807 102.390953 2.000025
      vertex 157.639603 87.639610 2.000025
      vertex 156.021439 102.581856 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.237381 102.266785 2.000025
      vertex 157.639603 87.639610 2.000025
      vertex 155.642807 102.390953 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.219681 104.498665 0.000025
      vertex 116.426407 86.426407 0.000025
      vertex 152.210678 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 86.426407 0.000025
      vertex 152.219681 104.498665 0.000025
      vertex 152.291336 104.080734 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.432602 103.680923 0.000025
      vertex 116.426407 86.426407 0.000025
      vertex 152.291336 104.080734 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 84.676407 0.000025
      vertex 116.426407 86.426407 0.000025
      vertex 152.432602 103.680923 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.639404 103.310745 0.000025
      vertex 116.426407 84.676407 0.000025
      vertex 152.432602 103.680923 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 84.676407 0.000025
      vertex 116.426407 84.676407 0.000025
      vertex 152.639404 103.310745 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 114.710670 0.000025
      vertex 152.639404 106.110619 0.000025
      vertex 152.432602 105.740425 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.291336 105.340622 0.000025
      vertex 144.710678 114.710670 0.000025
      vertex 152.432602 105.740425 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 86.426407 0.000025
      vertex 144.710678 114.710670 0.000025
      vertex 152.291336 105.340622 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.219681 104.922691 0.000025
      vertex 116.426407 86.426407 0.000025
      vertex 152.291336 105.340622 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.210678 104.710678 0.000025
      vertex 116.426407 86.426407 0.000025
      vertex 152.219681 104.922691 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 84.676407 0.000025
      vertex 152.639404 103.310745 0.000025
      vertex 152.905792 102.980827 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.224091 102.700684 0.000025
      vertex 134.676392 84.676407 0.000025
      vertex 152.905792 102.980827 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 66.426407 0.000025
      vertex 134.676392 84.676407 0.000025
      vertex 153.224091 102.700684 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.585159 102.478363 0.000025
      vertex 134.676392 66.426407 0.000025
      vertex 153.224091 102.700684 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 136.426407 66.426407 0.000025
      vertex 134.676392 66.426407 0.000025
      vertex 153.585159 102.478363 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.978622 102.320259 0.000025
      vertex 136.426407 66.426407 0.000025
      vertex 153.585159 102.478363 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 136.426407 66.426407 0.000025
      vertex 153.978622 102.320259 0.000025
      vertex 154.393143 102.230927 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 154.816772 102.212929 0.000025
      vertex 136.426407 66.426407 0.000025
      vertex 154.393143 102.230927 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 164.710678 94.710678 0.000025
      vertex 136.426407 66.426407 0.000025
      vertex 154.816772 102.212929 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.237381 102.266785 0.000025
      vertex 164.710678 94.710678 0.000025
      vertex 154.816772 102.212929 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.642807 102.390953 0.000025
      vertex 164.710678 94.710678 0.000025
      vertex 155.237381 102.266785 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 164.710678 94.710678 0.000025
      vertex 155.642807 102.390953 0.000025
      vertex 156.021439 102.581856 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.362350 102.833992 0.000025
      vertex 164.710678 94.710678 0.000025
      vertex 156.021439 102.581856 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 166.220230 96.493004 0.000025
      vertex 164.710678 94.710678 0.000025
      vertex 156.362350 102.833992 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.655762 103.140129 0.000025
      vertex 166.220230 96.493004 0.000025
      vertex 156.362350 102.833992 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 167.415848 98.499496 0.000025
      vertex 166.220230 96.493004 0.000025
      vertex 156.655762 103.140129 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.893219 103.491440 0.000025
      vertex 167.415848 98.499496 0.000025
      vertex 156.655762 103.140129 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.264893 100.675415 0.000025
      vertex 167.415848 98.499496 0.000025
      vertex 156.893219 103.491440 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.067871 103.877831 0.000025
      vertex 168.264893 100.675415 0.000025
      vertex 156.893219 103.491440 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.744202 102.961395 0.000025
      vertex 168.264893 100.675415 0.000025
      vertex 157.067871 103.877831 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.174713 104.288177 0.000025
      vertex 168.744202 102.961395 0.000025
      vertex 157.067871 103.877831 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 168.840729 105.295097 0.000025
      vertex 168.744202 102.961395 0.000025
      vertex 157.174713 104.288177 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.210678 104.710678 0.000025
      vertex 168.840729 105.295097 0.000025
      vertex 157.174713 104.288177 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 168.551834 107.612862 0.000025
      vertex 168.840729 105.295097 0.000025
      vertex 157.210678 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.174713 105.133179 0.000025
      vertex 168.551834 107.612862 0.000025
      vertex 157.210678 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 167.885361 109.851456 0.000025
      vertex 168.551834 107.612862 0.000025
      vertex 157.174713 105.133179 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.067871 105.543526 0.000025
      vertex 167.885361 109.851456 0.000025
      vertex 157.174713 105.133179 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 166.859543 111.949821 0.000025
      vertex 167.885361 109.851456 0.000025
      vertex 157.067871 105.543526 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.893219 105.929909 0.000025
      vertex 166.859543 111.949821 0.000025
      vertex 157.067871 105.543526 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 165.502304 113.850731 0.000025
      vertex 166.859543 111.949821 0.000025
      vertex 156.893219 105.929909 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.655762 106.281227 0.000025
      vertex 165.502304 113.850731 0.000025
      vertex 156.893219 105.929909 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 163.850723 115.502312 0.000025
      vertex 165.502304 113.850731 0.000025
      vertex 156.655762 106.281227 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.362350 106.587357 0.000025
      vertex 163.850723 115.502312 0.000025
      vertex 156.655762 106.281227 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 161.949829 116.859535 0.000025
      vertex 163.850723 115.502312 0.000025
      vertex 156.362350 106.587357 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.021439 106.839500 0.000025
      vertex 161.949829 116.859535 0.000025
      vertex 156.362350 106.587357 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 159.851456 117.885368 0.000025
      vertex 161.949829 116.859535 0.000025
      vertex 156.021439 106.839500 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.642807 107.030396 0.000025
      vertex 159.851456 117.885368 0.000025
      vertex 156.021439 106.839500 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.612854 118.551819 0.000025
      vertex 159.851456 117.885368 0.000025
      vertex 155.642807 107.030396 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.237381 107.154564 0.000025
      vertex 157.612854 118.551819 0.000025
      vertex 155.642807 107.030396 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.295105 118.840729 0.000025
      vertex 157.612854 118.551819 0.000025
      vertex 155.237381 107.154564 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 154.816772 107.208420 0.000025
      vertex 155.295105 118.840729 0.000025
      vertex 155.237381 107.154564 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.961411 118.744209 0.000025
      vertex 155.295105 118.840729 0.000025
      vertex 154.816772 107.208420 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 154.393143 107.190430 0.000025
      vertex 152.961411 118.744209 0.000025
      vertex 154.816772 107.208420 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 150.675415 118.264885 0.000025
      vertex 152.961411 118.744209 0.000025
      vertex 154.393143 107.190430 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.978622 107.101097 0.000025
      vertex 150.675415 118.264885 0.000025
      vertex 154.393143 107.190430 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 148.499496 117.415848 0.000025
      vertex 150.675415 118.264885 0.000025
      vertex 153.978622 107.101097 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.585159 106.942993 0.000025
      vertex 148.499496 117.415848 0.000025
      vertex 153.978622 107.101097 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 146.493011 116.220238 0.000025
      vertex 148.499496 117.415848 0.000025
      vertex 153.585159 106.942993 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.224091 106.720673 0.000025
      vertex 146.493011 116.220238 0.000025
      vertex 153.585159 106.942993 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 114.710670 0.000025
      vertex 146.493011 116.220238 0.000025
      vertex 153.224091 106.720673 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.905792 106.440529 0.000025
      vertex 144.710678 114.710670 0.000025
      vertex 153.224091 106.720673 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.639404 106.110619 0.000025
      vertex 144.710678 114.710670 0.000025
      vertex 152.905792 106.440529 0.000025
    endloop
  endfacet
  facet normal -0.646301 0.763082 0.000000
    outer loop
      vertex 146.493011 116.220238 2.000025
      vertex 144.710678 114.710670 0.000025
      vertex 144.710678 114.710670 2.000025
    endloop
  endfacet
  facet normal -0.646301 0.763082 0.000000
    outer loop
      vertex 146.493011 116.220238 0.000025
      vertex 144.710678 114.710670 0.000025
      vertex 146.493011 116.220238 2.000025
    endloop
  endfacet
  facet normal -0.511887 0.859053 0.000000
    outer loop
      vertex 148.499496 117.415848 2.000025
      vertex 146.493011 116.220238 0.000025
      vertex 146.493011 116.220238 2.000025
    endloop
  endfacet
  facet normal -0.511887 0.859053 0.000000
    outer loop
      vertex 148.499496 117.415848 0.000025
      vertex 146.493011 116.220238 0.000025
      vertex 148.499496 117.415848 2.000025
    endloop
  endfacet
  facet normal -0.363505 0.931592 0.000000
    outer loop
      vertex 150.675415 118.264885 2.000025
      vertex 148.499496 117.415848 0.000025
      vertex 148.499496 117.415848 2.000025
    endloop
  endfacet
  facet normal -0.363505 0.931592 0.000000
    outer loop
      vertex 150.675415 118.264885 0.000025
      vertex 148.499496 117.415848 0.000025
      vertex 150.675415 118.264885 2.000025
    endloop
  endfacet
  facet normal -0.205216 0.978717 0.000000
    outer loop
      vertex 152.961411 118.744209 2.000025
      vertex 150.675415 118.264885 0.000025
      vertex 150.675415 118.264885 2.000025
    endloop
  endfacet
  facet normal -0.205216 0.978717 0.000000
    outer loop
      vertex 152.961411 118.744209 0.000025
      vertex 150.675415 118.264885 0.000025
      vertex 152.961411 118.744209 2.000025
    endloop
  endfacet
  facet normal -0.041324 0.999146 0.000000
    outer loop
      vertex 155.295105 118.840729 2.000025
      vertex 152.961411 118.744209 0.000025
      vertex 152.961411 118.744209 2.000025
    endloop
  endfacet
  facet normal -0.041324 0.999146 0.000000
    outer loop
      vertex 155.295105 118.840729 0.000025
      vertex 152.961411 118.744209 0.000025
      vertex 155.295105 118.840729 2.000025
    endloop
  endfacet
  facet normal 0.123694 0.992320 0.000000
    outer loop
      vertex 157.612854 118.551819 2.000025
      vertex 155.295105 118.840729 0.000025
      vertex 155.295105 118.840729 2.000025
    endloop
  endfacet
  facet normal 0.123694 0.992320 -0.000000
    outer loop
      vertex 157.612854 118.551819 0.000025
      vertex 155.295105 118.840729 0.000025
      vertex 157.612854 118.551819 2.000025
    endloop
  endfacet
  facet normal 0.285332 0.958429 0.000000
    outer loop
      vertex 159.851456 117.885368 2.000025
      vertex 157.612854 118.551819 0.000025
      vertex 157.612854 118.551819 2.000025
    endloop
  endfacet
  facet normal 0.285332 0.958429 -0.000000
    outer loop
      vertex 159.851456 117.885368 0.000025
      vertex 157.612854 118.551819 0.000025
      vertex 159.851456 117.885368 2.000025
    endloop
  endfacet
  facet normal 0.439197 0.898391 0.000000
    outer loop
      vertex 161.949829 116.859535 2.000025
      vertex 159.851456 117.885368 0.000025
      vertex 159.851456 117.885368 2.000025
    endloop
  endfacet
  facet normal 0.439197 0.898391 -0.000000
    outer loop
      vertex 161.949829 116.859535 0.000025
      vertex 159.851456 117.885368 0.000025
      vertex 161.949829 116.859535 2.000025
    endloop
  endfacet
  facet normal 0.581080 0.813846 0.000000
    outer loop
      vertex 163.850723 115.502312 2.000025
      vertex 161.949829 116.859535 0.000025
      vertex 161.949829 116.859535 2.000025
    endloop
  endfacet
  facet normal 0.581080 0.813846 -0.000000
    outer loop
      vertex 163.850723 115.502312 0.000025
      vertex 161.949829 116.859535 0.000025
      vertex 163.850723 115.502312 2.000025
    endloop
  endfacet
  facet normal 0.707107 0.707107 0.000000
    outer loop
      vertex 165.502304 113.850731 2.000025
      vertex 163.850723 115.502312 0.000025
      vertex 163.850723 115.502312 2.000025
    endloop
  endfacet
  facet normal 0.707107 0.707107 -0.000000
    outer loop
      vertex 165.502304 113.850731 0.000025
      vertex 163.850723 115.502312 0.000025
      vertex 165.502304 113.850731 2.000025
    endloop
  endfacet
  facet normal 0.813846 0.581081 0.000000
    outer loop
      vertex 166.859543 111.949821 2.000025
      vertex 165.502304 113.850731 0.000025
      vertex 165.502304 113.850731 2.000025
    endloop
  endfacet
  facet normal 0.813846 0.581081 -0.000000
    outer loop
      vertex 166.859543 111.949821 0.000025
      vertex 165.502304 113.850731 0.000025
      vertex 166.859543 111.949821 2.000025
    endloop
  endfacet
  facet normal 0.898393 0.439193 0.000000
    outer loop
      vertex 167.885361 109.851456 2.000025
      vertex 166.859543 111.949821 0.000025
      vertex 166.859543 111.949821 2.000025
    endloop
  endfacet
  facet normal 0.898393 0.439193 -0.000000
    outer loop
      vertex 167.885361 109.851456 0.000025
      vertex 166.859543 111.949821 0.000025
      vertex 167.885361 109.851456 2.000025
    endloop
  endfacet
  facet normal 0.958426 0.285342 0.000000
    outer loop
      vertex 168.551834 107.612862 2.000025
      vertex 167.885361 109.851456 0.000025
      vertex 167.885361 109.851456 2.000025
    endloop
  endfacet
  facet normal 0.958426 0.285342 -0.000000
    outer loop
      vertex 168.551834 107.612862 0.000025
      vertex 167.885361 109.851456 0.000025
      vertex 168.551834 107.612862 2.000025
    endloop
  endfacet
  facet normal 0.992321 0.123687 0.000000
    outer loop
      vertex 168.840729 105.295097 2.000025
      vertex 168.551834 107.612862 0.000025
      vertex 168.551834 107.612862 2.000025
    endloop
  endfacet
  facet normal 0.992321 0.123687 -0.000000
    outer loop
      vertex 168.840729 105.295097 0.000025
      vertex 168.551834 107.612862 0.000025
      vertex 168.840729 105.295097 2.000025
    endloop
  endfacet
  facet normal 0.999146 -0.041327 0.000000
    outer loop
      vertex 168.744202 102.961395 2.000025
      vertex 168.840729 105.295097 0.000025
      vertex 168.840729 105.295097 2.000025
    endloop
  endfacet
  facet normal 0.999146 -0.041327 0.000000
    outer loop
      vertex 168.744202 102.961395 0.000025
      vertex 168.840729 105.295097 0.000025
      vertex 168.744202 102.961395 2.000025
    endloop
  endfacet
  facet normal 0.978718 -0.205211 0.000000
    outer loop
      vertex 168.264893 100.675415 2.000025
      vertex 168.744202 102.961395 0.000025
      vertex 168.744202 102.961395 2.000025
    endloop
  endfacet
  facet normal 0.978718 -0.205211 0.000000
    outer loop
      vertex 168.264893 100.675415 0.000025
      vertex 168.744202 102.961395 0.000025
      vertex 168.264893 100.675415 2.000025
    endloop
  endfacet
  facet normal 0.931591 -0.363508 0.000000
    outer loop
      vertex 167.415848 98.499496 2.000025
      vertex 168.264893 100.675415 0.000025
      vertex 168.264893 100.675415 2.000025
    endloop
  endfacet
  facet normal 0.931591 -0.363508 0.000000
    outer loop
      vertex 167.415848 98.499496 0.000025
      vertex 168.264893 100.675415 0.000025
      vertex 167.415848 98.499496 2.000025
    endloop
  endfacet
  facet normal 0.859053 -0.511887 0.000000
    outer loop
      vertex 166.220230 96.493004 2.000025
      vertex 167.415848 98.499496 0.000025
      vertex 167.415848 98.499496 2.000025
    endloop
  endfacet
  facet normal 0.859053 -0.511887 0.000000
    outer loop
      vertex 166.220230 96.493004 0.000025
      vertex 167.415848 98.499496 0.000025
      vertex 166.220230 96.493004 2.000025
    endloop
  endfacet
  facet normal 0.763084 -0.646299 0.000000
    outer loop
      vertex 164.710678 94.710678 2.000025
      vertex 166.220230 96.493004 0.000025
      vertex 166.220230 96.493004 2.000025
    endloop
  endfacet
  facet normal 0.763084 -0.646299 0.000000
    outer loop
      vertex 164.710678 94.710678 0.000025
      vertex 166.220230 96.493004 0.000025
      vertex 164.710678 94.710678 2.000025
    endloop
  endfacet
  facet normal -0.996396 -0.084817 0.000000
    outer loop
      vertex 157.174713 105.133179 0.000025
      vertex 157.210678 104.710678 0.000025
      vertex 157.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal -0.996396 -0.084817 -0.000000
    outer loop
      vertex 157.174713 105.133179 2.000025
      vertex 157.174713 105.133179 0.000025
      vertex 157.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal -0.967735 -0.251969 0.000000
    outer loop
      vertex 157.067871 105.543526 0.000025
      vertex 157.174713 105.133179 0.000025
      vertex 157.174713 105.133179 2.000025
    endloop
  endfacet
  facet normal -0.967735 -0.251969 -0.000000
    outer loop
      vertex 157.067871 105.543526 2.000025
      vertex 157.067871 105.543526 0.000025
      vertex 157.174713 105.133179 2.000025
    endloop
  endfacet
  facet normal -0.911232 -0.411893 0.000000
    outer loop
      vertex 156.893219 105.929909 0.000025
      vertex 157.067871 105.543526 0.000025
      vertex 157.067871 105.543526 2.000025
    endloop
  endfacet
  facet normal -0.911232 -0.411893 -0.000000
    outer loop
      vertex 156.893219 105.929909 2.000025
      vertex 156.893219 105.929909 0.000025
      vertex 157.067871 105.543526 2.000025
    endloop
  endfacet
  facet normal -0.828501 -0.559987 0.000000
    outer loop
      vertex 156.655762 106.281227 0.000025
      vertex 156.893219 105.929909 0.000025
      vertex 156.893219 105.929909 2.000025
    endloop
  endfacet
  facet normal -0.828501 -0.559987 -0.000000
    outer loop
      vertex 156.655762 106.281227 2.000025
      vertex 156.655762 106.281227 0.000025
      vertex 156.893219 105.929909 2.000025
    endloop
  endfacet
  facet normal -0.721944 -0.691951 0.000000
    outer loop
      vertex 156.362350 106.587357 0.000025
      vertex 156.655762 106.281227 0.000025
      vertex 156.655762 106.281227 2.000025
    endloop
  endfacet
  facet normal -0.721944 -0.691951 -0.000000
    outer loop
      vertex 156.362350 106.587357 2.000025
      vertex 156.362350 106.587357 0.000025
      vertex 156.655762 106.281227 2.000025
    endloop
  endfacet
  facet normal -0.594643 -0.803990 0.000000
    outer loop
      vertex 156.021439 106.839500 0.000025
      vertex 156.362350 106.587357 0.000025
      vertex 156.362350 106.587357 2.000025
    endloop
  endfacet
  facet normal -0.594643 -0.803990 -0.000000
    outer loop
      vertex 156.021439 106.839500 2.000025
      vertex 156.021439 106.839500 0.000025
      vertex 156.362350 106.587357 2.000025
    endloop
  endfacet
  facet normal -0.450191 -0.892932 0.000000
    outer loop
      vertex 155.642807 107.030396 0.000025
      vertex 156.021439 106.839500 0.000025
      vertex 156.021439 106.839500 2.000025
    endloop
  endfacet
  facet normal -0.450191 -0.892932 -0.000000
    outer loop
      vertex 155.642807 107.030396 2.000025
      vertex 155.642807 107.030396 0.000025
      vertex 156.021439 106.839500 2.000025
    endloop
  endfacet
  facet normal -0.292840 -0.956161 0.000000
    outer loop
      vertex 155.237381 107.154564 0.000025
      vertex 155.642807 107.030396 0.000025
      vertex 155.642807 107.030396 2.000025
    endloop
  endfacet
  facet normal -0.292840 -0.956161 -0.000000
    outer loop
      vertex 155.237381 107.154564 2.000025
      vertex 155.237381 107.154564 0.000025
      vertex 155.642807 107.030396 2.000025
    endloop
  endfacet
  facet normal -0.127006 -0.991902 0.000000
    outer loop
      vertex 154.816772 107.208420 0.000025
      vertex 155.237381 107.154564 0.000025
      vertex 155.237381 107.154564 2.000025
    endloop
  endfacet
  facet normal -0.127006 -0.991902 -0.000000
    outer loop
      vertex 154.816772 107.208420 2.000025
      vertex 154.816772 107.208420 0.000025
      vertex 155.237381 107.154564 2.000025
    endloop
  endfacet
  facet normal 0.042428 -0.999099 0.000000
    outer loop
      vertex 154.393143 107.190430 0.000025
      vertex 154.816772 107.208420 0.000025
      vertex 154.816772 107.208420 2.000025
    endloop
  endfacet
  facet normal 0.042428 -0.999099 0.000000
    outer loop
      vertex 154.393143 107.190430 2.000025
      vertex 154.393143 107.190430 0.000025
      vertex 154.816772 107.208420 2.000025
    endloop
  endfacet
  facet normal 0.210672 -0.977557 0.000000
    outer loop
      vertex 153.978622 107.101097 0.000025
      vertex 154.393143 107.190430 0.000025
      vertex 154.393143 107.190430 2.000025
    endloop
  endfacet
  facet normal 0.210672 -0.977557 0.000000
    outer loop
      vertex 153.978622 107.101097 2.000025
      vertex 153.978622 107.101097 0.000025
      vertex 154.393143 107.190430 2.000025
    endloop
  endfacet
  facet normal 0.372851 -0.927891 0.000000
    outer loop
      vertex 153.585159 106.942993 0.000025
      vertex 153.978622 107.101097 0.000025
      vertex 153.978622 107.101097 2.000025
    endloop
  endfacet
  facet normal 0.372851 -0.927891 0.000000
    outer loop
      vertex 153.585159 106.942993 2.000025
      vertex 153.585159 106.942993 0.000025
      vertex 153.978622 107.101097 2.000025
    endloop
  endfacet
  facet normal 0.524310 -0.851527 0.000000
    outer loop
      vertex 153.224091 106.720673 0.000025
      vertex 153.585159 106.942993 0.000025
      vertex 153.585159 106.942993 2.000025
    endloop
  endfacet
  facet normal 0.524310 -0.851527 0.000000
    outer loop
      vertex 153.224091 106.720673 2.000025
      vertex 153.224091 106.720673 0.000025
      vertex 153.585159 106.942993 2.000025
    endloop
  endfacet
  facet normal 0.660683 -0.750665 0.000000
    outer loop
      vertex 152.905792 106.440529 0.000025
      vertex 153.224091 106.720673 0.000025
      vertex 153.224091 106.720673 2.000025
    endloop
  endfacet
  facet normal 0.660683 -0.750665 0.000000
    outer loop
      vertex 152.905792 106.440529 2.000025
      vertex 152.905792 106.440529 0.000025
      vertex 153.224091 106.720673 2.000025
    endloop
  endfacet
  facet normal 0.778031 -0.628226 0.000000
    outer loop
      vertex 152.639404 106.110619 0.000025
      vertex 152.905792 106.440529 0.000025
      vertex 152.905792 106.440529 2.000025
    endloop
  endfacet
  facet normal 0.778031 -0.628226 0.000000
    outer loop
      vertex 152.639404 106.110619 2.000025
      vertex 152.639404 106.110619 0.000025
      vertex 152.905792 106.440529 2.000025
    endloop
  endfacet
  facet normal 0.873014 -0.487695 0.000000
    outer loop
      vertex 152.432602 105.740425 0.000025
      vertex 152.639404 106.110619 0.000025
      vertex 152.639404 106.110619 2.000025
    endloop
  endfacet
  facet normal 0.873014 -0.487695 0.000000
    outer loop
      vertex 152.432602 105.740425 2.000025
      vertex 152.432602 105.740425 0.000025
      vertex 152.639404 106.110619 2.000025
    endloop
  endfacet
  facet normal 0.942873 -0.333153 0.000000
    outer loop
      vertex 152.291336 105.340622 0.000025
      vertex 152.432602 105.740425 0.000025
      vertex 152.432602 105.740425 2.000025
    endloop
  endfacet
  facet normal 0.942873 -0.333153 0.000000
    outer loop
      vertex 152.291336 105.340622 2.000025
      vertex 152.291336 105.340622 0.000025
      vertex 152.432602 105.740425 2.000025
    endloop
  endfacet
  facet normal 0.985618 -0.168987 0.000000
    outer loop
      vertex 152.219681 104.922691 0.000025
      vertex 152.291336 105.340622 0.000025
      vertex 152.291336 105.340622 2.000025
    endloop
  endfacet
  facet normal 0.985618 -0.168987 0.000000
    outer loop
      vertex 152.219681 104.922691 2.000025
      vertex 152.219681 104.922691 0.000025
      vertex 152.291336 105.340622 2.000025
    endloop
  endfacet
  facet normal 0.999100 -0.042425 0.000000
    outer loop
      vertex 152.210678 104.710678 0.000025
      vertex 152.219681 104.922691 0.000025
      vertex 152.219681 104.922691 2.000025
    endloop
  endfacet
  facet normal 0.999100 -0.042425 0.000000
    outer loop
      vertex 152.210678 104.710678 2.000025
      vertex 152.210678 104.710678 0.000025
      vertex 152.219681 104.922691 2.000025
    endloop
  endfacet
  facet normal 0.999100 0.042425 0.000000
    outer loop
      vertex 152.219681 104.498665 0.000025
      vertex 152.210678 104.710678 0.000025
      vertex 152.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.999100 0.042425 0.000000
    outer loop
      vertex 152.219681 104.498665 2.000025
      vertex 152.219681 104.498665 0.000025
      vertex 152.210678 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.985618 0.168987 0.000000
    outer loop
      vertex 152.291336 104.080734 0.000025
      vertex 152.219681 104.498665 0.000025
      vertex 152.219681 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.985618 0.168987 0.000000
    outer loop
      vertex 152.291336 104.080734 2.000025
      vertex 152.291336 104.080734 0.000025
      vertex 152.219681 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.942875 0.333148 0.000000
    outer loop
      vertex 152.432602 103.680923 0.000025
      vertex 152.291336 104.080734 0.000025
      vertex 152.291336 104.080734 2.000025
    endloop
  endfacet
  facet normal 0.942875 0.333148 0.000000
    outer loop
      vertex 152.432602 103.680923 2.000025
      vertex 152.432602 103.680923 0.000025
      vertex 152.291336 104.080734 2.000025
    endloop
  endfacet
  facet normal 0.873006 0.487710 0.000000
    outer loop
      vertex 152.639404 103.310745 0.000025
      vertex 152.432602 103.680923 0.000025
      vertex 152.432602 103.680923 2.000025
    endloop
  endfacet
  facet normal 0.873006 0.487710 0.000000
    outer loop
      vertex 152.639404 103.310745 2.000025
      vertex 152.639404 103.310745 0.000025
      vertex 152.432602 103.680923 2.000025
    endloop
  endfacet
  facet normal 0.778038 0.628217 0.000000
    outer loop
      vertex 152.905792 102.980827 0.000025
      vertex 152.639404 103.310745 0.000025
      vertex 152.639404 103.310745 2.000025
    endloop
  endfacet
  facet normal 0.778038 0.628217 0.000000
    outer loop
      vertex 152.905792 102.980827 2.000025
      vertex 152.905792 102.980827 0.000025
      vertex 152.639404 103.310745 2.000025
    endloop
  endfacet
  facet normal 0.660683 0.750665 0.000000
    outer loop
      vertex 153.224091 102.700684 0.000025
      vertex 152.905792 102.980827 0.000025
      vertex 152.905792 102.980827 2.000025
    endloop
  endfacet
  facet normal 0.660683 0.750665 0.000000
    outer loop
      vertex 153.224091 102.700684 2.000025
      vertex 153.224091 102.700684 0.000025
      vertex 152.905792 102.980827 2.000025
    endloop
  endfacet
  facet normal 0.524310 0.851527 0.000000
    outer loop
      vertex 153.585159 102.478363 0.000025
      vertex 153.224091 102.700684 0.000025
      vertex 153.224091 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.524310 0.851527 0.000000
    outer loop
      vertex 153.585159 102.478363 2.000025
      vertex 153.585159 102.478363 0.000025
      vertex 153.224091 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.372851 0.927891 0.000000
    outer loop
      vertex 153.978622 102.320259 0.000025
      vertex 153.585159 102.478363 0.000025
      vertex 153.585159 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.372851 0.927891 0.000000
    outer loop
      vertex 153.978622 102.320259 2.000025
      vertex 153.978622 102.320259 0.000025
      vertex 153.585159 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.210672 0.977557 0.000000
    outer loop
      vertex 154.393143 102.230927 0.000025
      vertex 153.978622 102.320259 0.000025
      vertex 153.978622 102.320259 2.000025
    endloop
  endfacet
  facet normal 0.210672 0.977557 0.000000
    outer loop
      vertex 154.393143 102.230927 2.000025
      vertex 154.393143 102.230927 0.000025
      vertex 153.978622 102.320259 2.000025
    endloop
  endfacet
  facet normal 0.042446 0.999099 0.000000
    outer loop
      vertex 154.816772 102.212929 0.000025
      vertex 154.393143 102.230927 0.000025
      vertex 154.393143 102.230927 2.000025
    endloop
  endfacet
  facet normal 0.042446 0.999099 0.000000
    outer loop
      vertex 154.816772 102.212929 2.000025
      vertex 154.816772 102.212929 0.000025
      vertex 154.393143 102.230927 2.000025
    endloop
  endfacet
  facet normal -0.127006 0.991902 0.000000
    outer loop
      vertex 155.237381 102.266785 0.000025
      vertex 154.816772 102.212929 0.000025
      vertex 154.816772 102.212929 2.000025
    endloop
  endfacet
  facet normal -0.127006 0.991902 0.000000
    outer loop
      vertex 155.237381 102.266785 2.000025
      vertex 155.237381 102.266785 0.000025
      vertex 154.816772 102.212929 2.000025
    endloop
  endfacet
  facet normal -0.292840 0.956161 0.000000
    outer loop
      vertex 155.642807 102.390953 0.000025
      vertex 155.237381 102.266785 0.000025
      vertex 155.237381 102.266785 2.000025
    endloop
  endfacet
  facet normal -0.292840 0.956161 0.000000
    outer loop
      vertex 155.642807 102.390953 2.000025
      vertex 155.642807 102.390953 0.000025
      vertex 155.237381 102.266785 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 156.021439 102.581856 0.000025
      vertex 155.642807 102.390953 0.000025
      vertex 155.642807 102.390953 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 156.021439 102.581856 2.000025
      vertex 156.021439 102.581856 0.000025
      vertex 155.642807 102.390953 2.000025
    endloop
  endfacet
  facet normal -0.594632 0.803998 0.000000
    outer loop
      vertex 156.362350 102.833992 0.000025
      vertex 156.021439 102.581856 0.000025
      vertex 156.021439 102.581856 2.000025
    endloop
  endfacet
  facet normal -0.594632 0.803998 0.000000
    outer loop
      vertex 156.362350 102.833992 2.000025
      vertex 156.362350 102.833992 0.000025
      vertex 156.021439 102.581856 2.000025
    endloop
  endfacet
  facet normal -0.721953 0.691942 0.000000
    outer loop
      vertex 156.655762 103.140129 0.000025
      vertex 156.362350 102.833992 0.000025
      vertex 156.362350 102.833992 2.000025
    endloop
  endfacet
  facet normal -0.721953 0.691942 0.000000
    outer loop
      vertex 156.655762 103.140129 2.000025
      vertex 156.655762 103.140129 0.000025
      vertex 156.362350 102.833992 2.000025
    endloop
  endfacet
  facet normal -0.828496 0.559995 0.000000
    outer loop
      vertex 156.893219 103.491440 0.000025
      vertex 156.655762 103.140129 0.000025
      vertex 156.655762 103.140129 2.000025
    endloop
  endfacet
  facet normal -0.828496 0.559995 0.000000
    outer loop
      vertex 156.893219 103.491440 2.000025
      vertex 156.893219 103.491440 0.000025
      vertex 156.655762 103.140129 2.000025
    endloop
  endfacet
  facet normal -0.911235 0.411887 0.000000
    outer loop
      vertex 157.067871 103.877831 0.000025
      vertex 156.893219 103.491440 0.000025
      vertex 156.893219 103.491440 2.000025
    endloop
  endfacet
  facet normal -0.911235 0.411887 0.000000
    outer loop
      vertex 157.067871 103.877831 2.000025
      vertex 157.067871 103.877831 0.000025
      vertex 156.893219 103.491440 2.000025
    endloop
  endfacet
  facet normal -0.967735 0.251969 0.000000
    outer loop
      vertex 157.174713 104.288177 0.000025
      vertex 157.067871 103.877831 0.000025
      vertex 157.067871 103.877831 2.000025
    endloop
  endfacet
  facet normal -0.967735 0.251969 0.000000
    outer loop
      vertex 157.174713 104.288177 2.000025
      vertex 157.174713 104.288177 0.000025
      vertex 157.067871 103.877831 2.000025
    endloop
  endfacet
  facet normal -0.996396 0.084817 0.000000
    outer loop
      vertex 157.210678 104.710678 0.000025
      vertex 157.174713 104.288177 0.000025
      vertex 157.174713 104.288177 2.000025
    endloop
  endfacet
  facet normal -0.996396 0.084817 0.000000
    outer loop
      vertex 157.210678 104.710678 2.000025
      vertex 157.210678 104.710678 0.000025
      vertex 157.174713 104.288177 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 31.213202 107.639610 2.000025
      vertex 16.606174 105.133179 2.000025
      vertex 16.642138 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.606174 104.288177 2.000025
      vertex 31.213202 107.639610 2.000025
      vertex 16.642138 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.499325 103.877831 2.000025
      vertex 31.213202 107.639610 2.000025
      vertex 16.606174 104.288177 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.452907 106.839500 2.000025
      vertex 15.793822 106.587357 2.000025
      vertex 24.142132 114.710670 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 22.359804 116.220238 2.000025
      vertex 15.452907 106.839500 2.000025
      vertex 24.142132 114.710670 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.074275 107.030396 2.000025
      vertex 15.452907 106.839500 2.000025
      vertex 22.359804 116.220238 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 20.353310 117.415848 2.000025
      vertex 15.074275 107.030396 2.000025
      vertex 22.359804 116.220238 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.668830 107.154564 2.000025
      vertex 15.074275 107.030396 2.000025
      vertex 20.353310 117.415848 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 18.177397 118.264885 2.000025
      vertex 14.668830 107.154564 2.000025
      vertex 20.353310 117.415848 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.248237 107.208420 2.000025
      vertex 14.668830 107.154564 2.000025
      vertex 18.177397 118.264885 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 24.142132 114.710670 2.000025
      vertex 15.793822 106.587357 2.000025
      vertex 16.087227 106.281227 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.324669 105.929909 2.000025
      vertex 24.142132 114.710670 2.000025
      vertex 16.087227 106.281227 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 31.213202 107.639610 2.000025
      vertex 24.142132 114.710670 2.000025
      vertex 16.324669 105.929909 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.499325 105.543526 2.000025
      vertex 31.213202 107.639610 2.000025
      vertex 16.324669 105.929909 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 16.606174 105.133179 2.000025
      vertex 31.213202 107.639610 2.000025
      vertex 16.499325 105.543526 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 87.639610 2.000025
      vertex 15.452907 102.581856 2.000025
      vertex 15.074275 102.390953 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 87.639610 2.000025
      vertex 15.074275 102.390953 2.000025
      vertex 14.668830 102.266785 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 14.248237 102.212929 2.000025
      vertex 11.213205 87.639610 2.000025
      vertex 14.668830 102.266785 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.824590 102.230927 2.000025
      vertex 11.213205 87.639610 2.000025
      vertex 14.248237 102.212929 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 87.639610 2.000025
      vertex 13.824590 102.230927 2.000025
      vertex 13.410076 102.320259 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.016626 102.478363 2.000025
      vertex 11.213205 87.639610 2.000025
      vertex 13.410076 102.320259 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 4.142136 94.710678 2.000025
      vertex 11.213205 87.639610 2.000025
      vertex 13.016626 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.248237 107.208420 2.000025
      vertex 18.177397 118.264885 2.000025
      vertex 15.891411 118.744209 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.557710 118.840729 2.000025
      vertex 14.248237 107.208420 2.000025
      vertex 15.891411 118.744209 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 13.824590 107.190430 2.000025
      vertex 14.248237 107.208420 2.000025
      vertex 13.557710 118.840729 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 11.239953 118.551819 2.000025
      vertex 13.824590 107.190430 2.000025
      vertex 13.557710 118.840729 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 13.410076 107.101097 2.000025
      vertex 13.824590 107.190430 2.000025
      vertex 11.239953 118.551819 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 9.001359 117.885368 2.000025
      vertex 13.410076 107.101097 2.000025
      vertex 11.239953 118.551819 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 13.016626 106.942993 2.000025
      vertex 13.410076 107.101097 2.000025
      vertex 9.001359 117.885368 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 6.902985 116.859535 2.000025
      vertex 13.016626 106.942993 2.000025
      vertex 9.001359 117.885368 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 12.655549 106.720673 2.000025
      vertex 13.016626 106.942993 2.000025
      vertex 6.902985 116.859535 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 5.002081 115.502312 2.000025
      vertex 12.655549 106.720673 2.000025
      vertex 6.902985 116.859535 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 12.337245 106.440529 2.000025
      vertex 12.655549 106.720673 2.000025
      vertex 5.002081 115.502312 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 3.350496 113.850731 2.000025
      vertex 12.337245 106.440529 2.000025
      vertex 5.002081 115.502312 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 12.070857 106.110619 2.000025
      vertex 12.337245 106.440529 2.000025
      vertex 3.350496 113.850731 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 1.993276 111.949821 2.000025
      vertex 12.070857 106.110619 2.000025
      vertex 3.350496 113.850731 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 11.864066 105.740425 2.000025
      vertex 12.070857 106.110619 2.000025
      vertex 1.993276 111.949821 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.967450 109.851456 2.000025
      vertex 11.864066 105.740425 2.000025
      vertex 1.993276 111.949821 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 11.722803 105.340622 2.000025
      vertex 11.864066 105.740425 2.000025
      vertex 0.967450 109.851456 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.300989 107.612862 2.000025
      vertex 11.722803 105.340622 2.000025
      vertex 0.967450 109.851456 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 11.651143 104.922691 2.000025
      vertex 11.722803 105.340622 2.000025
      vertex 0.300989 107.612862 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.012077 105.295097 2.000025
      vertex 11.651143 104.922691 2.000025
      vertex 0.300989 107.612862 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 31.213202 107.639610 2.000025
      vertex 16.499325 103.877831 2.000025
      vertex 16.324669 103.491440 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.087227 103.140129 2.000025
      vertex 31.213202 107.639610 2.000025
      vertex 16.324669 103.491440 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 87.639610 2.000025
      vertex 31.213202 107.639610 2.000025
      vertex 16.087227 103.140129 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.793822 102.833992 2.000025
      vertex 11.213205 87.639610 2.000025
      vertex 16.087227 103.140129 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 15.452907 102.581856 2.000025
      vertex 11.213205 87.639610 2.000025
      vertex 15.793822 102.833992 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 4.142136 94.710678 2.000025
      vertex 13.016626 102.478363 2.000025
      vertex 12.655549 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.337245 102.980827 2.000025
      vertex 4.142136 94.710678 2.000025
      vertex 12.655549 102.700684 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 2.632573 96.493004 2.000025
      vertex 4.142136 94.710678 2.000025
      vertex 12.337245 102.980827 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.070857 103.310745 2.000025
      vertex 2.632573 96.493004 2.000025
      vertex 12.337245 102.980827 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 1.436971 98.499496 2.000025
      vertex 2.632573 96.493004 2.000025
      vertex 12.070857 103.310745 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.864066 103.680923 2.000025
      vertex 1.436971 98.499496 2.000025
      vertex 12.070857 103.310745 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.587925 100.675415 2.000025
      vertex 1.436971 98.499496 2.000025
      vertex 11.864066 103.680923 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.722803 104.080734 2.000025
      vertex 0.587925 100.675415 2.000025
      vertex 11.864066 103.680923 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.108600 102.961395 2.000025
      vertex 0.587925 100.675415 2.000025
      vertex 11.722803 104.080734 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.651143 104.498665 2.000025
      vertex 0.108600 102.961395 2.000025
      vertex 11.722803 104.080734 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.012077 105.295097 2.000025
      vertex 0.108600 102.961395 2.000025
      vertex 11.651143 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.642136 104.710678 2.000025
      vertex 0.012077 105.295097 2.000025
      vertex 11.651143 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.651143 104.922691 2.000025
      vertex 0.012077 105.295097 2.000025
      vertex 11.642136 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 12.655549 102.700684 0.000025
      vertex 32.426407 66.426407 0.000025
      vertex 4.142136 94.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.012077 105.295097 0.000025
      vertex 11.651143 104.922691 0.000025
      vertex 11.642136 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.108600 102.961395 0.000025
      vertex 0.012077 105.295097 0.000025
      vertex 11.642136 104.710678 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.651143 104.498665 0.000025
      vertex 0.108600 102.961395 0.000025
      vertex 11.642136 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.587925 100.675415 0.000025
      vertex 0.108600 102.961395 0.000025
      vertex 11.651143 104.498665 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.722803 104.080734 0.000025
      vertex 0.587925 100.675415 0.000025
      vertex 11.651143 104.498665 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.436971 98.499496 0.000025
      vertex 0.587925 100.675415 0.000025
      vertex 11.722803 104.080734 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.864066 103.680923 0.000025
      vertex 1.436971 98.499496 0.000025
      vertex 11.722803 104.080734 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 2.632573 96.493004 0.000025
      vertex 1.436971 98.499496 0.000025
      vertex 11.864066 103.680923 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.070857 103.310745 0.000025
      vertex 2.632573 96.493004 0.000025
      vertex 11.864066 103.680923 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 4.142136 94.710678 0.000025
      vertex 2.632573 96.493004 0.000025
      vertex 12.070857 103.310745 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.337245 102.980827 0.000025
      vertex 4.142136 94.710678 0.000025
      vertex 12.070857 103.310745 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.655549 102.700684 0.000025
      vertex 4.142136 94.710678 0.000025
      vertex 12.337245 102.980827 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 32.426407 66.426407 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 34.176407 66.426407 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 14.248237 107.208420 0.000025
      vertex 13.824590 107.190430 0.000025
      vertex 13.557710 118.840729 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 15.891411 118.744209 0.000025
      vertex 14.248237 107.208420 0.000025
      vertex 13.557710 118.840729 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.668830 107.154564 0.000025
      vertex 14.248237 107.208420 0.000025
      vertex 15.891411 118.744209 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 18.177397 118.264885 0.000025
      vertex 14.668830 107.154564 0.000025
      vertex 15.891411 118.744209 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.074275 107.030396 0.000025
      vertex 14.668830 107.154564 0.000025
      vertex 18.177397 118.264885 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 20.353310 117.415848 0.000025
      vertex 15.074275 107.030396 0.000025
      vertex 18.177397 118.264885 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.452907 106.839500 0.000025
      vertex 15.074275 107.030396 0.000025
      vertex 20.353310 117.415848 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 22.359804 116.220238 0.000025
      vertex 15.452907 106.839500 0.000025
      vertex 20.353310 117.415848 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.793822 106.587357 0.000025
      vertex 15.452907 106.839500 0.000025
      vertex 22.359804 116.220238 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 24.142132 114.710670 0.000025
      vertex 15.793822 106.587357 0.000025
      vertex 22.359804 116.220238 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.087227 106.281227 0.000025
      vertex 15.793822 106.587357 0.000025
      vertex 24.142132 114.710670 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.324669 105.929909 0.000025
      vertex 16.087227 106.281227 0.000025
      vertex 24.142132 114.710670 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 84.676407 0.000025
      vertex 13.410076 102.320259 0.000025
      vertex 13.824590 102.230927 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 52.426407 86.426407 0.000025
      vertex 16.606174 104.288177 0.000025
      vertex 16.642138 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.606174 105.133179 0.000025
      vertex 52.426407 86.426407 0.000025
      vertex 16.642138 104.710678 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 24.142132 114.710670 0.000025
      vertex 52.426407 86.426407 0.000025
      vertex 16.606174 105.133179 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.499325 105.543526 0.000025
      vertex 24.142132 114.710670 0.000025
      vertex 16.606174 105.133179 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.324669 105.929909 0.000025
      vertex 24.142132 114.710670 0.000025
      vertex 16.499325 105.543526 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 84.676407 0.000025
      vertex 32.426407 66.426407 0.000025
      vertex 12.655549 102.700684 0.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 13.016626 102.478363 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 12.655549 102.700684 0.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 13.410076 102.320259 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 13.016626 102.478363 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 84.676407 0.000025
      vertex 13.824590 102.230927 0.000025
      vertex 14.248237 102.212929 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 14.668830 102.266785 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 14.248237 102.212929 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.074275 102.390953 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 14.668830 102.266785 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 52.426407 84.676407 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 16.087227 103.140129 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.324669 103.491440 0.000025
      vertex 52.426407 84.676407 0.000025
      vertex 16.087227 103.140129 0.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 52.426407 86.426407 0.000025
      vertex 52.426407 84.676407 0.000025
      vertex 16.324669 103.491440 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.499325 103.877831 0.000025
      vertex 52.426407 86.426407 0.000025
      vertex 16.324669 103.491440 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.606174 104.288177 0.000025
      vertex 52.426407 86.426407 0.000025
      vertex 16.499325 103.877831 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.722803 105.340622 0.000025
      vertex 11.651143 104.922691 0.000025
      vertex 0.012077 105.295097 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 0.300989 107.612862 0.000025
      vertex 11.722803 105.340622 0.000025
      vertex 0.012077 105.295097 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.864066 105.740425 0.000025
      vertex 11.722803 105.340622 0.000025
      vertex 0.300989 107.612862 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 0.967450 109.851456 0.000025
      vertex 11.864066 105.740425 0.000025
      vertex 0.300989 107.612862 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.070857 106.110619 0.000025
      vertex 11.864066 105.740425 0.000025
      vertex 0.967450 109.851456 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 1.993276 111.949821 0.000025
      vertex 12.070857 106.110619 0.000025
      vertex 0.967450 109.851456 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.337245 106.440529 0.000025
      vertex 12.070857 106.110619 0.000025
      vertex 1.993276 111.949821 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 3.350496 113.850731 0.000025
      vertex 12.337245 106.440529 0.000025
      vertex 1.993276 111.949821 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 12.655549 106.720673 0.000025
      vertex 12.337245 106.440529 0.000025
      vertex 3.350496 113.850731 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 5.002081 115.502312 0.000025
      vertex 12.655549 106.720673 0.000025
      vertex 3.350496 113.850731 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.016626 106.942993 0.000025
      vertex 12.655549 106.720673 0.000025
      vertex 5.002081 115.502312 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 6.902985 116.859535 0.000025
      vertex 13.016626 106.942993 0.000025
      vertex 5.002081 115.502312 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.410076 107.101097 0.000025
      vertex 13.016626 106.942993 0.000025
      vertex 6.902985 116.859535 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 9.001359 117.885368 0.000025
      vertex 13.410076 107.101097 0.000025
      vertex 6.902985 116.859535 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 13.824590 107.190430 0.000025
      vertex 13.410076 107.101097 0.000025
      vertex 9.001359 117.885368 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 11.239953 118.551819 0.000025
      vertex 13.824590 107.190430 0.000025
      vertex 9.001359 117.885368 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 13.557710 118.840729 0.000025
      vertex 13.824590 107.190430 0.000025
      vertex 11.239953 118.551819 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 84.676407 0.000025
      vertex 15.074275 102.390953 0.000025
      vertex 15.452907 102.581856 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 15.793822 102.833992 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 15.452907 102.581856 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.087227 103.140129 0.000025
      vertex 34.176407 84.676407 0.000025
      vertex 15.793822 102.833992 0.000025
    endloop
  endfacet
  facet normal -0.763082 -0.646302 0.000000
    outer loop
      vertex 2.632573 96.493004 2.000025
      vertex 4.142136 94.710678 0.000025
      vertex 4.142136 94.710678 2.000025
    endloop
  endfacet
  facet normal -0.763082 -0.646302 0.000000
    outer loop
      vertex 2.632573 96.493004 0.000025
      vertex 4.142136 94.710678 0.000025
      vertex 2.632573 96.493004 2.000025
    endloop
  endfacet
  facet normal -0.859055 -0.511882 0.000000
    outer loop
      vertex 1.436971 98.499496 2.000025
      vertex 2.632573 96.493004 0.000025
      vertex 2.632573 96.493004 2.000025
    endloop
  endfacet
  facet normal -0.859055 -0.511882 0.000000
    outer loop
      vertex 1.436971 98.499496 0.000025
      vertex 2.632573 96.493004 0.000025
      vertex 1.436971 98.499496 2.000025
    endloop
  endfacet
  facet normal -0.931591 -0.363508 0.000000
    outer loop
      vertex 0.587925 100.675415 2.000025
      vertex 1.436971 98.499496 0.000025
      vertex 1.436971 98.499496 2.000025
    endloop
  endfacet
  facet normal -0.931591 -0.363508 0.000000
    outer loop
      vertex 0.587925 100.675415 0.000025
      vertex 1.436971 98.499496 0.000025
      vertex 0.587925 100.675415 2.000025
    endloop
  endfacet
  facet normal -0.978716 -0.205218 0.000000
    outer loop
      vertex 0.108600 102.961395 2.000025
      vertex 0.587925 100.675415 0.000025
      vertex 0.587925 100.675415 2.000025
    endloop
  endfacet
  facet normal -0.978716 -0.205218 0.000000
    outer loop
      vertex 0.108600 102.961395 0.000025
      vertex 0.587925 100.675415 0.000025
      vertex 0.108600 102.961395 2.000025
    endloop
  endfacet
  facet normal -0.999146 -0.041325 0.000000
    outer loop
      vertex 0.012077 105.295097 2.000025
      vertex 0.108600 102.961395 0.000025
      vertex 0.108600 102.961395 2.000025
    endloop
  endfacet
  facet normal -0.999146 -0.041325 0.000000
    outer loop
      vertex 0.012077 105.295097 0.000025
      vertex 0.108600 102.961395 0.000025
      vertex 0.012077 105.295097 2.000025
    endloop
  endfacet
  facet normal -0.992321 0.123694 0.000000
    outer loop
      vertex 0.300989 107.612862 2.000025
      vertex 0.012077 105.295097 0.000025
      vertex 0.012077 105.295097 2.000025
    endloop
  endfacet
  facet normal -0.992321 0.123694 0.000000
    outer loop
      vertex 0.300989 107.612862 0.000025
      vertex 0.012077 105.295097 0.000025
      vertex 0.300989 107.612862 2.000025
    endloop
  endfacet
  facet normal -0.958427 0.285338 0.000000
    outer loop
      vertex 0.967450 109.851456 2.000025
      vertex 0.300989 107.612862 0.000025
      vertex 0.300989 107.612862 2.000025
    endloop
  endfacet
  facet normal -0.958427 0.285338 0.000000
    outer loop
      vertex 0.967450 109.851456 0.000025
      vertex 0.300989 107.612862 0.000025
      vertex 0.967450 109.851456 2.000025
    endloop
  endfacet
  facet normal -0.898391 0.439196 0.000000
    outer loop
      vertex 1.993276 111.949821 2.000025
      vertex 0.967450 109.851456 0.000025
      vertex 0.967450 109.851456 2.000025
    endloop
  endfacet
  facet normal -0.898391 0.439196 0.000000
    outer loop
      vertex 1.993276 111.949821 0.000025
      vertex 0.967450 109.851456 0.000025
      vertex 1.993276 111.949821 2.000025
    endloop
  endfacet
  facet normal -0.813849 0.581076 0.000000
    outer loop
      vertex 3.350496 113.850731 2.000025
      vertex 1.993276 111.949821 0.000025
      vertex 1.993276 111.949821 2.000025
    endloop
  endfacet
  facet normal -0.813849 0.581076 0.000000
    outer loop
      vertex 3.350496 113.850731 0.000025
      vertex 1.993276 111.949821 0.000025
      vertex 3.350496 113.850731 2.000025
    endloop
  endfacet
  facet normal -0.707106 0.707108 0.000000
    outer loop
      vertex 5.002081 115.502312 2.000025
      vertex 3.350496 113.850731 0.000025
      vertex 3.350496 113.850731 2.000025
    endloop
  endfacet
  facet normal -0.707106 0.707108 0.000000
    outer loop
      vertex 5.002081 115.502312 0.000025
      vertex 3.350496 113.850731 0.000025
      vertex 5.002081 115.502312 2.000025
    endloop
  endfacet
  facet normal -0.581078 0.813848 0.000000
    outer loop
      vertex 6.902985 116.859535 2.000025
      vertex 5.002081 115.502312 0.000025
      vertex 5.002081 115.502312 2.000025
    endloop
  endfacet
  facet normal -0.581078 0.813848 0.000000
    outer loop
      vertex 6.902985 116.859535 0.000025
      vertex 5.002081 115.502312 0.000025
      vertex 6.902985 116.859535 2.000025
    endloop
  endfacet
  facet normal -0.439197 0.898391 0.000000
    outer loop
      vertex 9.001359 117.885368 2.000025
      vertex 6.902985 116.859535 0.000025
      vertex 6.902985 116.859535 2.000025
    endloop
  endfacet
  facet normal -0.439197 0.898391 0.000000
    outer loop
      vertex 9.001359 117.885368 0.000025
      vertex 6.902985 116.859535 0.000025
      vertex 9.001359 117.885368 2.000025
    endloop
  endfacet
  facet normal -0.285333 0.958428 0.000000
    outer loop
      vertex 11.239953 118.551819 2.000025
      vertex 9.001359 117.885368 0.000025
      vertex 9.001359 117.885368 2.000025
    endloop
  endfacet
  facet normal -0.285333 0.958428 0.000000
    outer loop
      vertex 11.239953 118.551819 0.000025
      vertex 9.001359 117.885368 0.000025
      vertex 11.239953 118.551819 2.000025
    endloop
  endfacet
  facet normal -0.123693 0.992320 0.000000
    outer loop
      vertex 13.557710 118.840729 2.000025
      vertex 11.239953 118.551819 0.000025
      vertex 11.239953 118.551819 2.000025
    endloop
  endfacet
  facet normal -0.123693 0.992320 0.000000
    outer loop
      vertex 13.557710 118.840729 0.000025
      vertex 11.239953 118.551819 0.000025
      vertex 13.557710 118.840729 2.000025
    endloop
  endfacet
  facet normal 0.041324 0.999146 0.000000
    outer loop
      vertex 15.891411 118.744209 2.000025
      vertex 13.557710 118.840729 0.000025
      vertex 13.557710 118.840729 2.000025
    endloop
  endfacet
  facet normal 0.041324 0.999146 -0.000000
    outer loop
      vertex 15.891411 118.744209 0.000025
      vertex 13.557710 118.840729 0.000025
      vertex 15.891411 118.744209 2.000025
    endloop
  endfacet
  facet normal 0.205217 0.978717 0.000000
    outer loop
      vertex 18.177397 118.264885 2.000025
      vertex 15.891411 118.744209 0.000025
      vertex 15.891411 118.744209 2.000025
    endloop
  endfacet
  facet normal 0.205217 0.978717 -0.000000
    outer loop
      vertex 18.177397 118.264885 0.000025
      vertex 15.891411 118.744209 0.000025
      vertex 18.177397 118.264885 2.000025
    endloop
  endfacet
  facet normal 0.363505 0.931592 0.000000
    outer loop
      vertex 20.353310 117.415848 2.000025
      vertex 18.177397 118.264885 0.000025
      vertex 18.177397 118.264885 2.000025
    endloop
  endfacet
  facet normal 0.363505 0.931592 -0.000000
    outer loop
      vertex 20.353310 117.415848 0.000025
      vertex 18.177397 118.264885 0.000025
      vertex 20.353310 117.415848 2.000025
    endloop
  endfacet
  facet normal 0.511885 0.859054 0.000000
    outer loop
      vertex 22.359804 116.220238 2.000025
      vertex 20.353310 117.415848 0.000025
      vertex 20.353310 117.415848 2.000025
    endloop
  endfacet
  facet normal 0.511885 0.859054 -0.000000
    outer loop
      vertex 22.359804 116.220238 0.000025
      vertex 20.353310 117.415848 0.000025
      vertex 22.359804 116.220238 2.000025
    endloop
  endfacet
  facet normal 0.646302 0.763081 0.000000
    outer loop
      vertex 24.142132 114.710670 2.000025
      vertex 22.359804 116.220238 0.000025
      vertex 22.359804 116.220238 2.000025
    endloop
  endfacet
  facet normal 0.646302 0.763081 -0.000000
    outer loop
      vertex 24.142132 114.710670 0.000025
      vertex 22.359804 116.220238 0.000025
      vertex 24.142132 114.710670 2.000025
    endloop
  endfacet
  facet normal -0.996397 -0.084813 0.000000
    outer loop
      vertex 16.606174 105.133179 0.000025
      vertex 16.642138 104.710678 0.000025
      vertex 16.642138 104.710678 2.000025
    endloop
  endfacet
  facet normal -0.996397 -0.084813 -0.000000
    outer loop
      vertex 16.606174 105.133179 2.000025
      vertex 16.606174 105.133179 0.000025
      vertex 16.642138 104.710678 2.000025
    endloop
  endfacet
  facet normal -0.967731 -0.251986 0.000000
    outer loop
      vertex 16.499325 105.543526 0.000025
      vertex 16.606174 105.133179 0.000025
      vertex 16.606174 105.133179 2.000025
    endloop
  endfacet
  facet normal -0.967731 -0.251986 -0.000000
    outer loop
      vertex 16.499325 105.543526 2.000025
      vertex 16.499325 105.543526 0.000025
      vertex 16.606174 105.133179 2.000025
    endloop
  endfacet
  facet normal -0.911229 -0.411901 0.000000
    outer loop
      vertex 16.324669 105.929909 0.000025
      vertex 16.499325 105.543526 0.000025
      vertex 16.499325 105.543526 2.000025
    endloop
  endfacet
  facet normal -0.911229 -0.411901 -0.000000
    outer loop
      vertex 16.324669 105.929909 2.000025
      vertex 16.324669 105.929909 0.000025
      vertex 16.499325 105.543526 2.000025
    endloop
  endfacet
  facet normal -0.828518 -0.559962 0.000000
    outer loop
      vertex 16.087227 106.281227 0.000025
      vertex 16.324669 105.929909 0.000025
      vertex 16.324669 105.929909 2.000025
    endloop
  endfacet
  facet normal -0.828518 -0.559962 -0.000000
    outer loop
      vertex 16.087227 106.281227 2.000025
      vertex 16.087227 106.281227 0.000025
      vertex 16.324669 105.929909 2.000025
    endloop
  endfacet
  facet normal -0.721952 -0.691943 0.000000
    outer loop
      vertex 15.793822 106.587357 0.000025
      vertex 16.087227 106.281227 0.000025
      vertex 16.087227 106.281227 2.000025
    endloop
  endfacet
  facet normal -0.721952 -0.691943 -0.000000
    outer loop
      vertex 15.793822 106.587357 2.000025
      vertex 15.793822 106.587357 0.000025
      vertex 16.087227 106.281227 2.000025
    endloop
  endfacet
  facet normal -0.594639 -0.803993 0.000000
    outer loop
      vertex 15.452907 106.839500 0.000025
      vertex 15.793822 106.587357 0.000025
      vertex 15.793822 106.587357 2.000025
    endloop
  endfacet
  facet normal -0.594639 -0.803993 -0.000000
    outer loop
      vertex 15.452907 106.839500 2.000025
      vertex 15.452907 106.839500 0.000025
      vertex 15.793822 106.587357 2.000025
    endloop
  endfacet
  facet normal -0.450191 -0.892932 0.000000
    outer loop
      vertex 15.074275 107.030396 0.000025
      vertex 15.452907 106.839500 0.000025
      vertex 15.452907 106.839500 2.000025
    endloop
  endfacet
  facet normal -0.450191 -0.892932 -0.000000
    outer loop
      vertex 15.074275 107.030396 2.000025
      vertex 15.074275 107.030396 0.000025
      vertex 15.452907 106.839500 2.000025
    endloop
  endfacet
  facet normal -0.292828 -0.956165 0.000000
    outer loop
      vertex 14.668830 107.154564 0.000025
      vertex 15.074275 107.030396 0.000025
      vertex 15.074275 107.030396 2.000025
    endloop
  endfacet
  facet normal -0.292828 -0.956165 -0.000000
    outer loop
      vertex 14.668830 107.154564 2.000025
      vertex 14.668830 107.154564 0.000025
      vertex 15.074275 107.030396 2.000025
    endloop
  endfacet
  facet normal -0.127010 -0.991901 0.000000
    outer loop
      vertex 14.248237 107.208420 0.000025
      vertex 14.668830 107.154564 0.000025
      vertex 14.668830 107.154564 2.000025
    endloop
  endfacet
  facet normal -0.127010 -0.991901 -0.000000
    outer loop
      vertex 14.248237 107.208420 2.000025
      vertex 14.248237 107.208420 0.000025
      vertex 14.668830 107.154564 2.000025
    endloop
  endfacet
  facet normal 0.042427 -0.999100 0.000000
    outer loop
      vertex 13.824590 107.190430 0.000025
      vertex 14.248237 107.208420 0.000025
      vertex 14.248237 107.208420 2.000025
    endloop
  endfacet
  facet normal 0.042427 -0.999100 0.000000
    outer loop
      vertex 13.824590 107.190430 2.000025
      vertex 13.824590 107.190430 0.000025
      vertex 14.248237 107.208420 2.000025
    endloop
  endfacet
  facet normal 0.210675 -0.977556 0.000000
    outer loop
      vertex 13.410076 107.101097 0.000025
      vertex 13.824590 107.190430 0.000025
      vertex 13.824590 107.190430 2.000025
    endloop
  endfacet
  facet normal 0.210675 -0.977556 0.000000
    outer loop
      vertex 13.410076 107.101097 2.000025
      vertex 13.410076 107.101097 0.000025
      vertex 13.824590 107.190430 2.000025
    endloop
  endfacet
  facet normal 0.372862 -0.927887 0.000000
    outer loop
      vertex 13.016626 106.942993 0.000025
      vertex 13.410076 107.101097 0.000025
      vertex 13.410076 107.101097 2.000025
    endloop
  endfacet
  facet normal 0.372862 -0.927887 0.000000
    outer loop
      vertex 13.016626 106.942993 2.000025
      vertex 13.016626 106.942993 0.000025
      vertex 13.410076 107.101097 2.000025
    endloop
  endfacet
  facet normal 0.524301 -0.851533 0.000000
    outer loop
      vertex 12.655549 106.720673 0.000025
      vertex 13.016626 106.942993 0.000025
      vertex 13.016626 106.942993 2.000025
    endloop
  endfacet
  facet normal 0.524301 -0.851533 0.000000
    outer loop
      vertex 12.655549 106.720673 2.000025
      vertex 12.655549 106.720673 0.000025
      vertex 13.016626 106.942993 2.000025
    endloop
  endfacet
  facet normal 0.660676 -0.750671 0.000000
    outer loop
      vertex 12.337245 106.440529 0.000025
      vertex 12.655549 106.720673 0.000025
      vertex 12.655549 106.720673 2.000025
    endloop
  endfacet
  facet normal 0.660676 -0.750671 0.000000
    outer loop
      vertex 12.337245 106.440529 2.000025
      vertex 12.337245 106.440529 0.000025
      vertex 12.655549 106.720673 2.000025
    endloop
  endfacet
  facet normal 0.778031 -0.628226 0.000000
    outer loop
      vertex 12.070857 106.110619 0.000025
      vertex 12.337245 106.440529 0.000025
      vertex 12.337245 106.440529 2.000025
    endloop
  endfacet
  facet normal 0.778031 -0.628226 0.000000
    outer loop
      vertex 12.070857 106.110619 2.000025
      vertex 12.070857 106.110619 0.000025
      vertex 12.337245 106.440529 2.000025
    endloop
  endfacet
  facet normal 0.873026 -0.487674 0.000000
    outer loop
      vertex 11.864066 105.740425 0.000025
      vertex 12.070857 106.110619 0.000025
      vertex 12.070857 106.110619 2.000025
    endloop
  endfacet
  facet normal 0.873026 -0.487674 0.000000
    outer loop
      vertex 11.864066 105.740425 2.000025
      vertex 11.864066 105.740425 0.000025
      vertex 12.070857 106.110619 2.000025
    endloop
  endfacet
  facet normal 0.942875 -0.333147 0.000000
    outer loop
      vertex 11.722803 105.340622 0.000025
      vertex 11.864066 105.740425 0.000025
      vertex 11.864066 105.740425 2.000025
    endloop
  endfacet
  facet normal 0.942875 -0.333147 0.000000
    outer loop
      vertex 11.722803 105.340622 2.000025
      vertex 11.722803 105.340622 0.000025
      vertex 11.864066 105.740425 2.000025
    endloop
  endfacet
  facet normal 0.985616 -0.168998 0.000000
    outer loop
      vertex 11.651143 104.922691 0.000025
      vertex 11.722803 105.340622 0.000025
      vertex 11.722803 105.340622 2.000025
    endloop
  endfacet
  facet normal 0.985616 -0.168998 0.000000
    outer loop
      vertex 11.651143 104.922691 2.000025
      vertex 11.651143 104.922691 0.000025
      vertex 11.722803 105.340622 2.000025
    endloop
  endfacet
  facet normal 0.999099 -0.042447 0.000000
    outer loop
      vertex 11.642136 104.710678 0.000025
      vertex 11.651143 104.922691 0.000025
      vertex 11.651143 104.922691 2.000025
    endloop
  endfacet
  facet normal 0.999099 -0.042447 0.000000
    outer loop
      vertex 11.642136 104.710678 2.000025
      vertex 11.642136 104.710678 0.000025
      vertex 11.651143 104.922691 2.000025
    endloop
  endfacet
  facet normal 0.999099 0.042447 0.000000
    outer loop
      vertex 11.651143 104.498665 0.000025
      vertex 11.642136 104.710678 0.000025
      vertex 11.642136 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.999099 0.042447 0.000000
    outer loop
      vertex 11.651143 104.498665 2.000025
      vertex 11.651143 104.498665 0.000025
      vertex 11.642136 104.710678 2.000025
    endloop
  endfacet
  facet normal 0.985616 0.168998 0.000000
    outer loop
      vertex 11.722803 104.080734 0.000025
      vertex 11.651143 104.498665 0.000025
      vertex 11.651143 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.985616 0.168998 0.000000
    outer loop
      vertex 11.722803 104.080734 2.000025
      vertex 11.722803 104.080734 0.000025
      vertex 11.651143 104.498665 2.000025
    endloop
  endfacet
  facet normal 0.942877 0.333142 0.000000
    outer loop
      vertex 11.864066 103.680923 0.000025
      vertex 11.722803 104.080734 0.000025
      vertex 11.722803 104.080734 2.000025
    endloop
  endfacet
  facet normal 0.942877 0.333142 0.000000
    outer loop
      vertex 11.864066 103.680923 2.000025
      vertex 11.864066 103.680923 0.000025
      vertex 11.722803 104.080734 2.000025
    endloop
  endfacet
  facet normal 0.873017 0.487689 0.000000
    outer loop
      vertex 12.070857 103.310745 0.000025
      vertex 11.864066 103.680923 0.000025
      vertex 11.864066 103.680923 2.000025
    endloop
  endfacet
  facet normal 0.873017 0.487689 0.000000
    outer loop
      vertex 12.070857 103.310745 2.000025
      vertex 12.070857 103.310745 0.000025
      vertex 11.864066 103.680923 2.000025
    endloop
  endfacet
  facet normal 0.778038 0.628217 0.000000
    outer loop
      vertex 12.337245 102.980827 0.000025
      vertex 12.070857 103.310745 0.000025
      vertex 12.070857 103.310745 2.000025
    endloop
  endfacet
  facet normal 0.778038 0.628217 0.000000
    outer loop
      vertex 12.337245 102.980827 2.000025
      vertex 12.337245 102.980827 0.000025
      vertex 12.070857 103.310745 2.000025
    endloop
  endfacet
  facet normal 0.660676 0.750671 0.000000
    outer loop
      vertex 12.655549 102.700684 0.000025
      vertex 12.337245 102.980827 0.000025
      vertex 12.337245 102.980827 2.000025
    endloop
  endfacet
  facet normal 0.660676 0.750671 0.000000
    outer loop
      vertex 12.655549 102.700684 2.000025
      vertex 12.655549 102.700684 0.000025
      vertex 12.337245 102.980827 2.000025
    endloop
  endfacet
  facet normal 0.524301 0.851533 0.000000
    outer loop
      vertex 13.016626 102.478363 0.000025
      vertex 12.655549 102.700684 0.000025
      vertex 12.655549 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.524301 0.851533 0.000000
    outer loop
      vertex 13.016626 102.478363 2.000025
      vertex 13.016626 102.478363 0.000025
      vertex 12.655549 102.700684 2.000025
    endloop
  endfacet
  facet normal 0.372862 0.927887 0.000000
    outer loop
      vertex 13.410076 102.320259 0.000025
      vertex 13.016626 102.478363 0.000025
      vertex 13.016626 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.372862 0.927887 0.000000
    outer loop
      vertex 13.410076 102.320259 2.000025
      vertex 13.410076 102.320259 0.000025
      vertex 13.016626 102.478363 2.000025
    endloop
  endfacet
  facet normal 0.210675 0.977556 0.000000
    outer loop
      vertex 13.824590 102.230927 0.000025
      vertex 13.410076 102.320259 0.000025
      vertex 13.410076 102.320259 2.000025
    endloop
  endfacet
  facet normal 0.210675 0.977556 0.000000
    outer loop
      vertex 13.824590 102.230927 2.000025
      vertex 13.824590 102.230927 0.000025
      vertex 13.410076 102.320259 2.000025
    endloop
  endfacet
  facet normal 0.042445 0.999099 0.000000
    outer loop
      vertex 14.248237 102.212929 0.000025
      vertex 13.824590 102.230927 0.000025
      vertex 13.824590 102.230927 2.000025
    endloop
  endfacet
  facet normal 0.042445 0.999099 0.000000
    outer loop
      vertex 14.248237 102.212929 2.000025
      vertex 14.248237 102.212929 0.000025
      vertex 13.824590 102.230927 2.000025
    endloop
  endfacet
  facet normal -0.127010 0.991901 0.000000
    outer loop
      vertex 14.668830 102.266785 0.000025
      vertex 14.248237 102.212929 0.000025
      vertex 14.248237 102.212929 2.000025
    endloop
  endfacet
  facet normal -0.127010 0.991901 0.000000
    outer loop
      vertex 14.668830 102.266785 2.000025
      vertex 14.668830 102.266785 0.000025
      vertex 14.248237 102.212929 2.000025
    endloop
  endfacet
  facet normal -0.292828 0.956165 0.000000
    outer loop
      vertex 15.074275 102.390953 0.000025
      vertex 14.668830 102.266785 0.000025
      vertex 14.668830 102.266785 2.000025
    endloop
  endfacet
  facet normal -0.292828 0.956165 0.000000
    outer loop
      vertex 15.074275 102.390953 2.000025
      vertex 15.074275 102.390953 0.000025
      vertex 14.668830 102.266785 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 15.452907 102.581856 0.000025
      vertex 15.074275 102.390953 0.000025
      vertex 15.074275 102.390953 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 15.452907 102.581856 2.000025
      vertex 15.452907 102.581856 0.000025
      vertex 15.074275 102.390953 2.000025
    endloop
  endfacet
  facet normal -0.594628 0.804001 0.000000
    outer loop
      vertex 15.793822 102.833992 0.000025
      vertex 15.452907 102.581856 0.000025
      vertex 15.452907 102.581856 2.000025
    endloop
  endfacet
  facet normal -0.594628 0.804001 0.000000
    outer loop
      vertex 15.793822 102.833992 2.000025
      vertex 15.793822 102.833992 0.000025
      vertex 15.452907 102.581856 2.000025
    endloop
  endfacet
  facet normal -0.721961 0.691934 0.000000
    outer loop
      vertex 16.087227 103.140129 0.000025
      vertex 15.793822 102.833992 0.000025
      vertex 15.793822 102.833992 2.000025
    endloop
  endfacet
  facet normal -0.721961 0.691934 0.000000
    outer loop
      vertex 16.087227 103.140129 2.000025
      vertex 16.087227 103.140129 0.000025
      vertex 15.793822 102.833992 2.000025
    endloop
  endfacet
  facet normal -0.828512 0.559971 0.000000
    outer loop
      vertex 16.324669 103.491440 0.000025
      vertex 16.087227 103.140129 0.000025
      vertex 16.087227 103.140129 2.000025
    endloop
  endfacet
  facet normal -0.828512 0.559971 0.000000
    outer loop
      vertex 16.324669 103.491440 2.000025
      vertex 16.324669 103.491440 0.000025
      vertex 16.087227 103.140129 2.000025
    endloop
  endfacet
  facet normal -0.911232 0.411894 0.000000
    outer loop
      vertex 16.499325 103.877831 0.000025
      vertex 16.324669 103.491440 0.000025
      vertex 16.324669 103.491440 2.000025
    endloop
  endfacet
  facet normal -0.911232 0.411894 0.000000
    outer loop
      vertex 16.499325 103.877831 2.000025
      vertex 16.499325 103.877831 0.000025
      vertex 16.324669 103.491440 2.000025
    endloop
  endfacet
  facet normal -0.967731 0.251986 0.000000
    outer loop
      vertex 16.606174 104.288177 0.000025
      vertex 16.499325 103.877831 0.000025
      vertex 16.499325 103.877831 2.000025
    endloop
  endfacet
  facet normal -0.967731 0.251986 0.000000
    outer loop
      vertex 16.606174 104.288177 2.000025
      vertex 16.606174 104.288177 0.000025
      vertex 16.499325 103.877831 2.000025
    endloop
  endfacet
  facet normal -0.996397 0.084813 0.000000
    outer loop
      vertex 16.642138 104.710678 0.000025
      vertex 16.606174 104.288177 0.000025
      vertex 16.606174 104.288177 2.000025
    endloop
  endfacet
  facet normal -0.996397 0.084813 0.000000
    outer loop
      vertex 16.642138 104.710678 2.000025
      vertex 16.642138 104.710678 0.000025
      vertex 16.606174 104.288177 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.722803 13.512191 2.000025
      vertex 0.012077 13.557710 2.000025
      vertex 0.300989 11.239953 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 31.213202 2.000025
      vertex 14.668830 16.586025 2.000025
      vertex 15.074275 16.461857 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 31.213202 11.213205 2.000025
      vertex 16.642138 14.142134 2.000025
      vertex 16.606174 13.719633 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 16.499325 13.309285 2.000025
      vertex 31.213202 11.213205 2.000025
      vertex 16.606174 13.719633 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 24.142132 4.142136 2.000025
      vertex 31.213202 11.213205 2.000025
      vertex 16.499325 13.309285 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 16.324669 12.922898 2.000025
      vertex 24.142132 4.142136 2.000025
      vertex 16.499325 13.309285 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.248237 11.644385 2.000025
      vertex 13.824590 11.662386 2.000025
      vertex 13.557710 0.012077 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 15.891411 0.108600 2.000025
      vertex 14.248237 11.644385 2.000025
      vertex 13.557710 0.012077 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.668830 11.698246 2.000025
      vertex 14.248237 11.644385 2.000025
      vertex 15.891411 0.108600 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 18.177397 0.587925 2.000025
      vertex 14.668830 11.698246 2.000025
      vertex 15.891411 0.108600 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 15.074275 11.822410 2.000025
      vertex 14.668830 11.698246 2.000025
      vertex 18.177397 0.587925 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 20.353310 1.436971 2.000025
      vertex 15.074275 11.822410 2.000025
      vertex 18.177397 0.587925 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 15.452907 12.013312 2.000025
      vertex 15.074275 11.822410 2.000025
      vertex 20.353310 1.436971 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 22.359804 2.632573 2.000025
      vertex 15.452907 12.013312 2.000025
      vertex 20.353310 1.436971 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 15.793822 12.265455 2.000025
      vertex 15.452907 12.013312 2.000025
      vertex 22.359804 2.632573 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 24.142132 4.142136 2.000025
      vertex 15.793822 12.265455 2.000025
      vertex 22.359804 2.632573 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.087227 12.571585 2.000025
      vertex 15.793822 12.265455 2.000025
      vertex 24.142132 4.142136 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 16.324669 12.922898 2.000025
      vertex 16.087227 12.571585 2.000025
      vertex 24.142132 4.142136 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.864066 13.112381 2.000025
      vertex 11.722803 13.512191 2.000025
      vertex 0.300989 11.239953 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 0.967450 9.001359 2.000025
      vertex 11.864066 13.112381 2.000025
      vertex 0.300989 11.239953 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.070857 12.742199 2.000025
      vertex 11.864066 13.112381 2.000025
      vertex 0.967450 9.001359 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 1.993276 6.902985 2.000025
      vertex 12.070857 12.742199 2.000025
      vertex 0.967450 9.001359 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.337245 12.412288 2.000025
      vertex 12.070857 12.742199 2.000025
      vertex 1.993276 6.902985 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 3.350496 5.002081 2.000025
      vertex 12.337245 12.412288 2.000025
      vertex 1.993276 6.902985 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.655549 12.132142 2.000025
      vertex 12.337245 12.412288 2.000025
      vertex 3.350496 5.002081 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 5.002081 3.350496 2.000025
      vertex 12.655549 12.132142 2.000025
      vertex 3.350496 5.002081 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.016626 11.909821 2.000025
      vertex 12.655549 12.132142 2.000025
      vertex 5.002081 3.350496 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 6.902985 1.993276 2.000025
      vertex 13.016626 11.909821 2.000025
      vertex 5.002081 3.350496 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.410076 11.751719 2.000025
      vertex 13.016626 11.909821 2.000025
      vertex 6.902985 1.993276 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 9.001359 0.967450 2.000025
      vertex 13.410076 11.751719 2.000025
      vertex 6.902985 1.993276 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.824590 11.662386 2.000025
      vertex 13.410076 11.751719 2.000025
      vertex 9.001359 0.967450 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 11.239953 0.300989 2.000025
      vertex 13.824590 11.662386 2.000025
      vertex 9.001359 0.967450 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 13.557710 0.012077 2.000025
      vertex 13.824590 11.662386 2.000025
      vertex 11.239953 0.300989 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 31.213202 11.213205 2.000025
      vertex 16.324669 15.361372 2.000025
      vertex 16.499325 14.974985 2.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 16.606174 14.564637 2.000025
      vertex 31.213202 11.213205 2.000025
      vertex 16.499325 14.974985 2.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 16.642138 14.142134 2.000025
      vertex 31.213202 11.213205 2.000025
      vertex 16.606174 14.564637 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 31.213202 2.000025
      vertex 13.410076 16.532551 2.000025
      vertex 13.824590 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.248237 16.639881 2.000025
      vertex 11.213205 31.213202 2.000025
      vertex 13.824590 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 14.668830 16.586025 2.000025
      vertex 11.213205 31.213202 2.000025
      vertex 14.248237 16.639881 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 31.213202 2.000025
      vertex 15.074275 16.461857 2.000025
      vertex 15.452907 16.270958 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 15.793822 16.018816 2.000025
      vertex 11.213205 31.213202 2.000025
      vertex 15.452907 16.270958 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 31.213202 11.213205 2.000025
      vertex 11.213205 31.213202 2.000025
      vertex 15.793822 16.018816 2.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 16.087227 15.712686 2.000025
      vertex 31.213202 11.213205 2.000025
      vertex 15.793822 16.018816 2.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 16.324669 15.361372 2.000025
      vertex 31.213202 11.213205 2.000025
      vertex 16.087227 15.712686 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.213205 31.213202 2.000025
      vertex 4.142136 24.142136 2.000025
      vertex 12.655549 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.016626 16.374451 2.000025
      vertex 11.213205 31.213202 2.000025
      vertex 12.655549 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 13.410076 16.532551 2.000025
      vertex 11.213205 31.213202 2.000025
      vertex 13.016626 16.374451 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 0.012077 13.557710 2.000025
      vertex 11.722803 13.512191 2.000025
      vertex 11.651143 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.642136 14.142134 2.000025
      vertex 0.012077 13.557710 2.000025
      vertex 11.651143 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.108600 15.891414 2.000025
      vertex 0.012077 13.557710 2.000025
      vertex 11.642136 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.651143 14.354151 2.000025
      vertex 0.108600 15.891414 2.000025
      vertex 11.642136 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 0.587925 18.177397 2.000025
      vertex 0.108600 15.891414 2.000025
      vertex 11.651143 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.722803 14.772079 2.000025
      vertex 0.587925 18.177397 2.000025
      vertex 11.651143 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 1.436971 20.353313 2.000025
      vertex 0.587925 18.177397 2.000025
      vertex 11.722803 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 11.864066 15.171889 2.000025
      vertex 1.436971 20.353313 2.000025
      vertex 11.722803 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 2.632573 22.359804 2.000025
      vertex 1.436971 20.353313 2.000025
      vertex 11.864066 15.171889 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.070857 15.542071 2.000025
      vertex 2.632573 22.359804 2.000025
      vertex 11.864066 15.171889 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 4.142136 24.142136 2.000025
      vertex 2.632573 22.359804 2.000025
      vertex 12.070857 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.337245 15.871983 2.000025
      vertex 4.142136 24.142136 2.000025
      vertex 12.070857 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 12.655549 16.152128 2.000025
      vertex 4.142136 24.142136 2.000025
      vertex 12.337245 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.452907 12.013312 0.000025
      vertex 24.142132 4.142136 0.000025
      vertex 22.359804 2.632573 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 34.176407 0.000025
      vertex 16.087227 12.571585 0.000025
      vertex 16.324669 12.922898 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.499325 13.309285 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 16.324669 12.922898 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.606174 13.719633 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 16.499325 13.309285 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 34.176407 0.000025
      vertex 16.606174 13.719633 0.000025
      vertex 16.642138 14.142134 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.606174 14.564637 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 16.642138 14.142134 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.499325 14.974985 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 16.606174 14.564637 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 34.176407 52.426407 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 15.793822 16.018816 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.452907 16.270958 0.000025
      vertex 34.176407 52.426407 0.000025
      vertex 15.793822 16.018816 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 32.426407 52.426407 0.000025
      vertex 34.176407 52.426407 0.000025
      vertex 15.452907 16.270958 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.074275 16.461857 0.000025
      vertex 32.426407 52.426407 0.000025
      vertex 15.452907 16.270958 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.668830 16.586025 0.000025
      vertex 32.426407 52.426407 0.000025
      vertex 15.074275 16.461857 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.074275 11.822410 0.000025
      vertex 15.452907 12.013312 0.000025
      vertex 22.359804 2.632573 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 20.353310 1.436971 0.000025
      vertex 15.074275 11.822410 0.000025
      vertex 22.359804 2.632573 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.668830 11.698246 0.000025
      vertex 15.074275 11.822410 0.000025
      vertex 20.353310 1.436971 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 18.177397 0.587925 0.000025
      vertex 14.668830 11.698246 0.000025
      vertex 20.353310 1.436971 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.248237 11.644385 0.000025
      vertex 14.668830 11.698246 0.000025
      vertex 18.177397 0.587925 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 24.142132 4.142136 0.000025
      vertex 15.452907 12.013312 0.000025
      vertex 15.793822 12.265455 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 16.087227 12.571585 0.000025
      vertex 24.142132 4.142136 0.000025
      vertex 15.793822 12.265455 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 52.426407 32.426407 0.000025
      vertex 24.142132 4.142136 0.000025
      vertex 16.087227 12.571585 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 34.176407 34.176407 0.000025
      vertex 52.426407 32.426407 0.000025
      vertex 16.087227 12.571585 0.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 52.426407 34.176407 0.000025
      vertex 52.426407 32.426407 0.000025
      vertex 34.176407 34.176407 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 34.176407 34.176407 0.000025
      vertex 16.499325 14.974985 0.000025
      vertex 16.324669 15.361372 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 16.087227 15.712686 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 16.324669 15.361372 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 15.793822 16.018816 0.000025
      vertex 34.176407 34.176407 0.000025
      vertex 16.087227 15.712686 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 32.426407 52.426407 0.000025
      vertex 14.668830 16.586025 0.000025
      vertex 14.248237 16.639881 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.824590 16.621883 0.000025
      vertex 32.426407 52.426407 0.000025
      vertex 14.248237 16.639881 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 4.142136 24.142136 0.000025
      vertex 32.426407 52.426407 0.000025
      vertex 13.824590 16.621883 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.410076 16.532551 0.000025
      vertex 4.142136 24.142136 0.000025
      vertex 13.824590 16.621883 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.016626 16.374451 0.000025
      vertex 4.142136 24.142136 0.000025
      vertex 13.410076 16.532551 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 14.248237 11.644385 0.000025
      vertex 18.177397 0.587925 0.000025
      vertex 15.891411 0.108600 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 13.557710 0.012077 0.000025
      vertex 14.248237 11.644385 0.000025
      vertex 15.891411 0.108600 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 13.824590 11.662386 0.000025
      vertex 14.248237 11.644385 0.000025
      vertex 13.557710 0.012077 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.239953 0.300989 0.000025
      vertex 13.824590 11.662386 0.000025
      vertex 13.557710 0.012077 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 13.410076 11.751719 0.000025
      vertex 13.824590 11.662386 0.000025
      vertex 11.239953 0.300989 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 9.001359 0.967450 0.000025
      vertex 13.410076 11.751719 0.000025
      vertex 11.239953 0.300989 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 13.016626 11.909821 0.000025
      vertex 13.410076 11.751719 0.000025
      vertex 9.001359 0.967450 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 6.902985 1.993276 0.000025
      vertex 13.016626 11.909821 0.000025
      vertex 9.001359 0.967450 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 12.655549 12.132142 0.000025
      vertex 13.016626 11.909821 0.000025
      vertex 6.902985 1.993276 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 5.002081 3.350496 0.000025
      vertex 12.655549 12.132142 0.000025
      vertex 6.902985 1.993276 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 12.337245 12.412288 0.000025
      vertex 12.655549 12.132142 0.000025
      vertex 5.002081 3.350496 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 3.350496 5.002081 0.000025
      vertex 12.337245 12.412288 0.000025
      vertex 5.002081 3.350496 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 12.070857 12.742199 0.000025
      vertex 12.337245 12.412288 0.000025
      vertex 3.350496 5.002081 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.993276 6.902985 0.000025
      vertex 12.070857 12.742199 0.000025
      vertex 3.350496 5.002081 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 11.864066 13.112381 0.000025
      vertex 12.070857 12.742199 0.000025
      vertex 1.993276 6.902985 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.967450 9.001359 0.000025
      vertex 11.864066 13.112381 0.000025
      vertex 1.993276 6.902985 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 11.722803 13.512191 0.000025
      vertex 11.864066 13.112381 0.000025
      vertex 0.967450 9.001359 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.300989 11.239953 0.000025
      vertex 11.722803 13.512191 0.000025
      vertex 0.967450 9.001359 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 11.651143 13.930120 0.000025
      vertex 11.722803 13.512191 0.000025
      vertex 0.300989 11.239953 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.012077 13.557710 0.000025
      vertex 11.651143 13.930120 0.000025
      vertex 0.300989 11.239953 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 4.142136 24.142136 0.000025
      vertex 13.016626 16.374451 0.000025
      vertex 12.655549 16.152128 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.337245 15.871983 0.000025
      vertex 4.142136 24.142136 0.000025
      vertex 12.655549 16.152128 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 2.632573 22.359804 0.000025
      vertex 4.142136 24.142136 0.000025
      vertex 12.337245 15.871983 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 12.070857 15.542071 0.000025
      vertex 2.632573 22.359804 0.000025
      vertex 12.337245 15.871983 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 1.436971 20.353313 0.000025
      vertex 2.632573 22.359804 0.000025
      vertex 12.070857 15.542071 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.864066 15.171889 0.000025
      vertex 1.436971 20.353313 0.000025
      vertex 12.070857 15.542071 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.587925 18.177397 0.000025
      vertex 1.436971 20.353313 0.000025
      vertex 11.864066 15.171889 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.722803 14.772079 0.000025
      vertex 0.587925 18.177397 0.000025
      vertex 11.864066 15.171889 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.108600 15.891414 0.000025
      vertex 0.587925 18.177397 0.000025
      vertex 11.722803 14.772079 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 11.651143 14.354151 0.000025
      vertex 0.108600 15.891414 0.000025
      vertex 11.722803 14.772079 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 0.012077 13.557710 0.000025
      vertex 0.108600 15.891414 0.000025
      vertex 11.651143 14.354151 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.642136 14.142134 0.000025
      vertex 0.012077 13.557710 0.000025
      vertex 11.651143 14.354151 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 11.651143 13.930120 0.000025
      vertex 0.012077 13.557710 0.000025
      vertex 11.642136 14.142134 0.000025
    endloop
  endfacet
  facet normal 0.646301 -0.763082 0.000000
    outer loop
      vertex 22.359804 2.632573 2.000025
      vertex 24.142132 4.142136 0.000025
      vertex 24.142132 4.142136 2.000025
    endloop
  endfacet
  facet normal 0.646301 -0.763082 0.000000
    outer loop
      vertex 22.359804 2.632573 0.000025
      vertex 24.142132 4.142136 0.000025
      vertex 22.359804 2.632573 2.000025
    endloop
  endfacet
  facet normal 0.511882 -0.859056 0.000000
    outer loop
      vertex 20.353310 1.436971 2.000025
      vertex 22.359804 2.632573 0.000025
      vertex 22.359804 2.632573 2.000025
    endloop
  endfacet
  facet normal 0.511882 -0.859056 0.000000
    outer loop
      vertex 20.353310 1.436971 0.000025
      vertex 22.359804 2.632573 0.000025
      vertex 20.353310 1.436971 2.000025
    endloop
  endfacet
  facet normal 0.363509 -0.931591 0.000000
    outer loop
      vertex 18.177397 0.587925 2.000025
      vertex 20.353310 1.436971 0.000025
      vertex 20.353310 1.436971 2.000025
    endloop
  endfacet
  facet normal 0.363509 -0.931591 0.000000
    outer loop
      vertex 18.177397 0.587925 0.000025
      vertex 20.353310 1.436971 0.000025
      vertex 18.177397 0.587925 2.000025
    endloop
  endfacet
  facet normal 0.205217 -0.978716 0.000000
    outer loop
      vertex 15.891411 0.108600 2.000025
      vertex 18.177397 0.587925 0.000025
      vertex 18.177397 0.587925 2.000025
    endloop
  endfacet
  facet normal 0.205217 -0.978716 0.000000
    outer loop
      vertex 15.891411 0.108600 0.000025
      vertex 18.177397 0.587925 0.000025
      vertex 15.891411 0.108600 2.000025
    endloop
  endfacet
  facet normal 0.041325 -0.999146 0.000000
    outer loop
      vertex 13.557710 0.012077 2.000025
      vertex 15.891411 0.108600 0.000025
      vertex 15.891411 0.108600 2.000025
    endloop
  endfacet
  facet normal 0.041325 -0.999146 0.000000
    outer loop
      vertex 13.557710 0.012077 0.000025
      vertex 15.891411 0.108600 0.000025
      vertex 13.557710 0.012077 2.000025
    endloop
  endfacet
  facet normal -0.123694 -0.992320 0.000000
    outer loop
      vertex 11.239953 0.300989 2.000025
      vertex 13.557710 0.012077 0.000025
      vertex 13.557710 0.012077 2.000025
    endloop
  endfacet
  facet normal -0.123694 -0.992320 0.000000
    outer loop
      vertex 11.239953 0.300989 0.000025
      vertex 13.557710 0.012077 0.000025
      vertex 11.239953 0.300989 2.000025
    endloop
  endfacet
  facet normal -0.285338 -0.958427 0.000000
    outer loop
      vertex 9.001359 0.967450 2.000025
      vertex 11.239953 0.300989 0.000025
      vertex 11.239953 0.300989 2.000025
    endloop
  endfacet
  facet normal -0.285338 -0.958427 0.000000
    outer loop
      vertex 9.001359 0.967450 0.000025
      vertex 11.239953 0.300989 0.000025
      vertex 9.001359 0.967450 2.000025
    endloop
  endfacet
  facet normal -0.439194 -0.898392 0.000000
    outer loop
      vertex 6.902985 1.993276 2.000025
      vertex 9.001359 0.967450 0.000025
      vertex 9.001359 0.967450 2.000025
    endloop
  endfacet
  facet normal -0.439194 -0.898392 0.000000
    outer loop
      vertex 6.902985 1.993276 0.000025
      vertex 9.001359 0.967450 0.000025
      vertex 6.902985 1.993276 2.000025
    endloop
  endfacet
  facet normal -0.581077 -0.813848 0.000000
    outer loop
      vertex 5.002081 3.350496 2.000025
      vertex 6.902985 1.993276 0.000025
      vertex 6.902985 1.993276 2.000025
    endloop
  endfacet
  facet normal -0.581077 -0.813848 0.000000
    outer loop
      vertex 5.002081 3.350496 0.000025
      vertex 6.902985 1.993276 0.000025
      vertex 5.002081 3.350496 2.000025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 3.350496 5.002081 2.000025
      vertex 5.002081 3.350496 0.000025
      vertex 5.002081 3.350496 2.000025
    endloop
  endfacet
  facet normal -0.707107 -0.707107 0.000000
    outer loop
      vertex 3.350496 5.002081 0.000025
      vertex 5.002081 3.350496 0.000025
      vertex 3.350496 5.002081 2.000025
    endloop
  endfacet
  facet normal -0.813848 -0.581077 0.000000
    outer loop
      vertex 1.993276 6.902985 2.000025
      vertex 3.350496 5.002081 0.000025
      vertex 3.350496 5.002081 2.000025
    endloop
  endfacet
  facet normal -0.813848 -0.581077 0.000000
    outer loop
      vertex 1.993276 6.902985 0.000025
      vertex 3.350496 5.002081 0.000025
      vertex 1.993276 6.902985 2.000025
    endloop
  endfacet
  facet normal -0.898392 -0.439194 0.000000
    outer loop
      vertex 0.967450 9.001359 2.000025
      vertex 1.993276 6.902985 0.000025
      vertex 1.993276 6.902985 2.000025
    endloop
  endfacet
  facet normal -0.898392 -0.439194 0.000000
    outer loop
      vertex 0.967450 9.001359 0.000025
      vertex 1.993276 6.902985 0.000025
      vertex 0.967450 9.001359 2.000025
    endloop
  endfacet
  facet normal -0.958427 -0.285338 0.000000
    outer loop
      vertex 0.300989 11.239953 2.000025
      vertex 0.967450 9.001359 0.000025
      vertex 0.967450 9.001359 2.000025
    endloop
  endfacet
  facet normal -0.958427 -0.285338 0.000000
    outer loop
      vertex 0.300989 11.239953 0.000025
      vertex 0.967450 9.001359 0.000025
      vertex 0.300989 11.239953 2.000025
    endloop
  endfacet
  facet normal -0.992320 -0.123694 0.000000
    outer loop
      vertex 0.012077 13.557710 2.000025
      vertex 0.300989 11.239953 0.000025
      vertex 0.300989 11.239953 2.000025
    endloop
  endfacet
  facet normal -0.992320 -0.123694 0.000000
    outer loop
      vertex 0.012077 13.557710 0.000025
      vertex 0.300989 11.239953 0.000025
      vertex 0.012077 13.557710 2.000025
    endloop
  endfacet
  facet normal -0.999146 0.041325 0.000000
    outer loop
      vertex 0.108600 15.891414 2.000025
      vertex 0.012077 13.557710 0.000025
      vertex 0.012077 13.557710 2.000025
    endloop
  endfacet
  facet normal -0.999146 0.041325 0.000000
    outer loop
      vertex 0.108600 15.891414 0.000025
      vertex 0.012077 13.557710 0.000025
      vertex 0.108600 15.891414 2.000025
    endloop
  endfacet
  facet normal -0.978716 0.205218 0.000000
    outer loop
      vertex 0.587925 18.177397 2.000025
      vertex 0.108600 15.891414 0.000025
      vertex 0.108600 15.891414 2.000025
    endloop
  endfacet
  facet normal -0.978716 0.205218 0.000000
    outer loop
      vertex 0.587925 18.177397 0.000025
      vertex 0.108600 15.891414 0.000025
      vertex 0.587925 18.177397 2.000025
    endloop
  endfacet
  facet normal -0.931591 0.363508 0.000000
    outer loop
      vertex 1.436971 20.353313 2.000025
      vertex 0.587925 18.177397 0.000025
      vertex 0.587925 18.177397 2.000025
    endloop
  endfacet
  facet normal -0.931591 0.363508 0.000000
    outer loop
      vertex 1.436971 20.353313 0.000025
      vertex 0.587925 18.177397 0.000025
      vertex 1.436971 20.353313 2.000025
    endloop
  endfacet
  facet normal -0.859055 0.511883 0.000000
    outer loop
      vertex 2.632573 22.359804 2.000025
      vertex 1.436971 20.353313 0.000025
      vertex 1.436971 20.353313 2.000025
    endloop
  endfacet
  facet normal -0.859055 0.511883 0.000000
    outer loop
      vertex 2.632573 22.359804 0.000025
      vertex 1.436971 20.353313 0.000025
      vertex 2.632573 22.359804 2.000025
    endloop
  endfacet
  facet normal -0.763083 0.646300 0.000000
    outer loop
      vertex 4.142136 24.142136 2.000025
      vertex 2.632573 22.359804 0.000025
      vertex 2.632573 22.359804 2.000025
    endloop
  endfacet
  facet normal -0.763083 0.646300 0.000000
    outer loop
      vertex 4.142136 24.142136 0.000025
      vertex 2.632573 22.359804 0.000025
      vertex 4.142136 24.142136 2.000025
    endloop
  endfacet
  facet normal -0.996397 -0.084812 0.000000
    outer loop
      vertex 16.606174 14.564637 0.000025
      vertex 16.642138 14.142134 0.000025
      vertex 16.642138 14.142134 2.000025
    endloop
  endfacet
  facet normal -0.996397 -0.084812 -0.000000
    outer loop
      vertex 16.606174 14.564637 2.000025
      vertex 16.606174 14.564637 0.000025
      vertex 16.642138 14.142134 2.000025
    endloop
  endfacet
  facet normal -0.967731 -0.251986 0.000000
    outer loop
      vertex 16.499325 14.974985 0.000025
      vertex 16.606174 14.564637 0.000025
      vertex 16.606174 14.564637 2.000025
    endloop
  endfacet
  facet normal -0.967731 -0.251986 -0.000000
    outer loop
      vertex 16.499325 14.974985 2.000025
      vertex 16.499325 14.974985 0.000025
      vertex 16.606174 14.564637 2.000025
    endloop
  endfacet
  facet normal -0.911230 -0.411897 0.000000
    outer loop
      vertex 16.324669 15.361372 0.000025
      vertex 16.499325 14.974985 0.000025
      vertex 16.499325 14.974985 2.000025
    endloop
  endfacet
  facet normal -0.911230 -0.411897 -0.000000
    outer loop
      vertex 16.324669 15.361372 2.000025
      vertex 16.324669 15.361372 0.000025
      vertex 16.499325 14.974985 2.000025
    endloop
  endfacet
  facet normal -0.828515 -0.559967 0.000000
    outer loop
      vertex 16.087227 15.712686 0.000025
      vertex 16.324669 15.361372 0.000025
      vertex 16.324669 15.361372 2.000025
    endloop
  endfacet
  facet normal -0.828515 -0.559967 -0.000000
    outer loop
      vertex 16.087227 15.712686 2.000025
      vertex 16.087227 15.712686 0.000025
      vertex 16.324669 15.361372 2.000025
    endloop
  endfacet
  facet normal -0.721953 -0.691942 0.000000
    outer loop
      vertex 15.793822 16.018816 0.000025
      vertex 16.087227 15.712686 0.000025
      vertex 16.087227 15.712686 2.000025
    endloop
  endfacet
  facet normal -0.721953 -0.691942 -0.000000
    outer loop
      vertex 15.793822 16.018816 2.000025
      vertex 15.793822 16.018816 0.000025
      vertex 16.087227 15.712686 2.000025
    endloop
  endfacet
  facet normal -0.594636 -0.803995 0.000000
    outer loop
      vertex 15.452907 16.270958 0.000025
      vertex 15.793822 16.018816 0.000025
      vertex 15.793822 16.018816 2.000025
    endloop
  endfacet
  facet normal -0.594636 -0.803995 -0.000000
    outer loop
      vertex 15.452907 16.270958 2.000025
      vertex 15.452907 16.270958 0.000025
      vertex 15.793822 16.018816 2.000025
    endloop
  endfacet
  facet normal -0.450198 -0.892929 0.000000
    outer loop
      vertex 15.074275 16.461857 0.000025
      vertex 15.452907 16.270958 0.000025
      vertex 15.452907 16.270958 2.000025
    endloop
  endfacet
  facet normal -0.450198 -0.892929 -0.000000
    outer loop
      vertex 15.074275 16.461857 2.000025
      vertex 15.074275 16.461857 0.000025
      vertex 15.452907 16.270958 2.000025
    endloop
  endfacet
  facet normal -0.292828 -0.956165 0.000000
    outer loop
      vertex 14.668830 16.586025 0.000025
      vertex 15.074275 16.461857 0.000025
      vertex 15.074275 16.461857 2.000025
    endloop
  endfacet
  facet normal -0.292828 -0.956165 -0.000000
    outer loop
      vertex 14.668830 16.586025 2.000025
      vertex 14.668830 16.586025 0.000025
      vertex 15.074275 16.461857 2.000025
    endloop
  endfacet
  facet normal -0.127010 -0.991901 0.000000
    outer loop
      vertex 14.248237 16.639881 0.000025
      vertex 14.668830 16.586025 0.000025
      vertex 14.668830 16.586025 2.000025
    endloop
  endfacet
  facet normal -0.127010 -0.991901 -0.000000
    outer loop
      vertex 14.248237 16.639881 2.000025
      vertex 14.248237 16.639881 0.000025
      vertex 14.668830 16.586025 2.000025
    endloop
  endfacet
  facet normal 0.042445 -0.999099 0.000000
    outer loop
      vertex 13.824590 16.621883 0.000025
      vertex 14.248237 16.639881 0.000025
      vertex 14.248237 16.639881 2.000025
    endloop
  endfacet
  facet normal 0.042445 -0.999099 0.000000
    outer loop
      vertex 13.824590 16.621883 2.000025
      vertex 13.824590 16.621883 0.000025
      vertex 14.248237 16.639881 2.000025
    endloop
  endfacet
  facet normal 0.210675 -0.977556 0.000000
    outer loop
      vertex 13.410076 16.532551 0.000025
      vertex 13.824590 16.621883 0.000025
      vertex 13.824590 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.210675 -0.977556 0.000000
    outer loop
      vertex 13.410076 16.532551 2.000025
      vertex 13.410076 16.532551 0.000025
      vertex 13.824590 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.372854 -0.927890 0.000000
    outer loop
      vertex 13.016626 16.374451 0.000025
      vertex 13.410076 16.532551 0.000025
      vertex 13.410076 16.532551 2.000025
    endloop
  endfacet
  facet normal 0.372854 -0.927890 0.000000
    outer loop
      vertex 13.016626 16.374451 2.000025
      vertex 13.016626 16.374451 0.000025
      vertex 13.410076 16.532551 2.000025
    endloop
  endfacet
  facet normal 0.524304 -0.851531 0.000000
    outer loop
      vertex 12.655549 16.152128 0.000025
      vertex 13.016626 16.374451 0.000025
      vertex 13.016626 16.374451 2.000025
    endloop
  endfacet
  facet normal 0.524304 -0.851531 0.000000
    outer loop
      vertex 12.655549 16.152128 2.000025
      vertex 12.655549 16.152128 0.000025
      vertex 13.016626 16.374451 2.000025
    endloop
  endfacet
  facet normal 0.660678 -0.750669 0.000000
    outer loop
      vertex 12.337245 15.871983 0.000025
      vertex 12.655549 16.152128 0.000025
      vertex 12.655549 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.660678 -0.750669 0.000000
    outer loop
      vertex 12.337245 15.871983 2.000025
      vertex 12.337245 15.871983 0.000025
      vertex 12.655549 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.778032 -0.628225 0.000000
    outer loop
      vertex 12.070857 15.542071 0.000025
      vertex 12.337245 15.871983 0.000025
      vertex 12.337245 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.778032 -0.628225 0.000000
    outer loop
      vertex 12.070857 15.542071 2.000025
      vertex 12.070857 15.542071 0.000025
      vertex 12.337245 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.873019 -0.487686 0.000000
    outer loop
      vertex 11.864066 15.171889 0.000025
      vertex 12.070857 15.542071 0.000025
      vertex 12.070857 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.873019 -0.487686 0.000000
    outer loop
      vertex 11.864066 15.171889 2.000025
      vertex 11.864066 15.171889 0.000025
      vertex 12.070857 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.942877 -0.333142 0.000000
    outer loop
      vertex 11.722803 14.772079 0.000025
      vertex 11.864066 15.171889 0.000025
      vertex 11.864066 15.171889 2.000025
    endloop
  endfacet
  facet normal 0.942877 -0.333142 0.000000
    outer loop
      vertex 11.722803 14.772079 2.000025
      vertex 11.722803 14.772079 0.000025
      vertex 11.864066 15.171889 2.000025
    endloop
  endfacet
  facet normal 0.985616 -0.168998 0.000000
    outer loop
      vertex 11.651143 14.354151 0.000025
      vertex 11.722803 14.772079 0.000025
      vertex 11.722803 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.985616 -0.168998 0.000000
    outer loop
      vertex 11.651143 14.354151 2.000025
      vertex 11.651143 14.354151 0.000025
      vertex 11.722803 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.999099 -0.042446 0.000000
    outer loop
      vertex 11.642136 14.142134 0.000025
      vertex 11.651143 14.354151 0.000025
      vertex 11.651143 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.999099 -0.042446 0.000000
    outer loop
      vertex 11.642136 14.142134 2.000025
      vertex 11.642136 14.142134 0.000025
      vertex 11.651143 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.999099 0.042447 0.000000
    outer loop
      vertex 11.651143 13.930120 0.000025
      vertex 11.642136 14.142134 0.000025
      vertex 11.642136 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.999099 0.042447 0.000000
    outer loop
      vertex 11.651143 13.930120 2.000025
      vertex 11.651143 13.930120 0.000025
      vertex 11.642136 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.985616 0.168998 0.000000
    outer loop
      vertex 11.722803 13.512191 0.000025
      vertex 11.651143 13.930120 0.000025
      vertex 11.651143 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.985616 0.168998 0.000000
    outer loop
      vertex 11.722803 13.512191 2.000025
      vertex 11.722803 13.512191 0.000025
      vertex 11.651143 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.942877 0.333142 0.000000
    outer loop
      vertex 11.864066 13.112381 0.000025
      vertex 11.722803 13.512191 0.000025
      vertex 11.722803 13.512191 2.000025
    endloop
  endfacet
  facet normal 0.942877 0.333142 0.000000
    outer loop
      vertex 11.864066 13.112381 2.000025
      vertex 11.864066 13.112381 0.000025
      vertex 11.722803 13.512191 2.000025
    endloop
  endfacet
  facet normal 0.873019 0.487686 0.000000
    outer loop
      vertex 12.070857 12.742199 0.000025
      vertex 11.864066 13.112381 0.000025
      vertex 11.864066 13.112381 2.000025
    endloop
  endfacet
  facet normal 0.873019 0.487686 0.000000
    outer loop
      vertex 12.070857 12.742199 2.000025
      vertex 12.070857 12.742199 0.000025
      vertex 11.864066 13.112381 2.000025
    endloop
  endfacet
  facet normal 0.778032 0.628225 0.000000
    outer loop
      vertex 12.337245 12.412288 0.000025
      vertex 12.070857 12.742199 0.000025
      vertex 12.070857 12.742199 2.000025
    endloop
  endfacet
  facet normal 0.778032 0.628225 0.000000
    outer loop
      vertex 12.337245 12.412288 2.000025
      vertex 12.337245 12.412288 0.000025
      vertex 12.070857 12.742199 2.000025
    endloop
  endfacet
  facet normal 0.660678 0.750669 0.000000
    outer loop
      vertex 12.655549 12.132142 0.000025
      vertex 12.337245 12.412288 0.000025
      vertex 12.337245 12.412288 2.000025
    endloop
  endfacet
  facet normal 0.660678 0.750669 0.000000
    outer loop
      vertex 12.655549 12.132142 2.000025
      vertex 12.655549 12.132142 0.000025
      vertex 12.337245 12.412288 2.000025
    endloop
  endfacet
  facet normal 0.524303 0.851532 0.000000
    outer loop
      vertex 13.016626 11.909821 0.000025
      vertex 12.655549 12.132142 0.000025
      vertex 12.655549 12.132142 2.000025
    endloop
  endfacet
  facet normal 0.524303 0.851532 0.000000
    outer loop
      vertex 13.016626 11.909821 2.000025
      vertex 13.016626 11.909821 0.000025
      vertex 12.655549 12.132142 2.000025
    endloop
  endfacet
  facet normal 0.372858 0.927888 0.000000
    outer loop
      vertex 13.410076 11.751719 0.000025
      vertex 13.016626 11.909821 0.000025
      vertex 13.016626 11.909821 2.000025
    endloop
  endfacet
  facet normal 0.372858 0.927888 0.000000
    outer loop
      vertex 13.410076 11.751719 2.000025
      vertex 13.410076 11.751719 0.000025
      vertex 13.016626 11.909821 2.000025
    endloop
  endfacet
  facet normal 0.210675 0.977556 0.000000
    outer loop
      vertex 13.824590 11.662386 0.000025
      vertex 13.410076 11.751719 0.000025
      vertex 13.410076 11.751719 2.000025
    endloop
  endfacet
  facet normal 0.210675 0.977556 0.000000
    outer loop
      vertex 13.824590 11.662386 2.000025
      vertex 13.824590 11.662386 0.000025
      vertex 13.410076 11.751719 2.000025
    endloop
  endfacet
  facet normal 0.042451 0.999099 0.000000
    outer loop
      vertex 14.248237 11.644385 0.000025
      vertex 13.824590 11.662386 0.000025
      vertex 13.824590 11.662386 2.000025
    endloop
  endfacet
  facet normal 0.042451 0.999099 0.000000
    outer loop
      vertex 14.248237 11.644385 2.000025
      vertex 14.248237 11.644385 0.000025
      vertex 13.824590 11.662386 2.000025
    endloop
  endfacet
  facet normal -0.127022 0.991900 0.000000
    outer loop
      vertex 14.668830 11.698246 0.000025
      vertex 14.248237 11.644385 0.000025
      vertex 14.248237 11.644385 2.000025
    endloop
  endfacet
  facet normal -0.127022 0.991900 0.000000
    outer loop
      vertex 14.668830 11.698246 2.000025
      vertex 14.668830 11.698246 0.000025
      vertex 14.248237 11.644385 2.000025
    endloop
  endfacet
  facet normal -0.292817 0.956168 0.000000
    outer loop
      vertex 15.074275 11.822410 0.000025
      vertex 14.668830 11.698246 0.000025
      vertex 14.668830 11.698246 2.000025
    endloop
  endfacet
  facet normal -0.292817 0.956168 0.000000
    outer loop
      vertex 15.074275 11.822410 2.000025
      vertex 15.074275 11.822410 0.000025
      vertex 14.668830 11.698246 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 15.452907 12.013312 0.000025
      vertex 15.074275 11.822410 0.000025
      vertex 15.074275 11.822410 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 15.452907 12.013312 2.000025
      vertex 15.452907 12.013312 0.000025
      vertex 15.074275 11.822410 2.000025
    endloop
  endfacet
  facet normal -0.594638 0.803994 0.000000
    outer loop
      vertex 15.793822 12.265455 0.000025
      vertex 15.452907 12.013312 0.000025
      vertex 15.452907 12.013312 2.000025
    endloop
  endfacet
  facet normal -0.594638 0.803994 0.000000
    outer loop
      vertex 15.793822 12.265455 2.000025
      vertex 15.793822 12.265455 0.000025
      vertex 15.452907 12.013312 2.000025
    endloop
  endfacet
  facet normal -0.721952 0.691943 0.000000
    outer loop
      vertex 16.087227 12.571585 0.000025
      vertex 15.793822 12.265455 0.000025
      vertex 15.793822 12.265455 2.000025
    endloop
  endfacet
  facet normal -0.721952 0.691943 0.000000
    outer loop
      vertex 16.087227 12.571585 2.000025
      vertex 16.087227 12.571585 0.000025
      vertex 15.793822 12.265455 2.000025
    endloop
  endfacet
  facet normal -0.828515 0.559967 0.000000
    outer loop
      vertex 16.324669 12.922898 0.000025
      vertex 16.087227 12.571585 0.000025
      vertex 16.087227 12.571585 2.000025
    endloop
  endfacet
  facet normal -0.828515 0.559967 0.000000
    outer loop
      vertex 16.324669 12.922898 2.000025
      vertex 16.324669 12.922898 0.000025
      vertex 16.087227 12.571585 2.000025
    endloop
  endfacet
  facet normal -0.911230 0.411897 0.000000
    outer loop
      vertex 16.499325 13.309285 0.000025
      vertex 16.324669 12.922898 0.000025
      vertex 16.324669 12.922898 2.000025
    endloop
  endfacet
  facet normal -0.911230 0.411897 0.000000
    outer loop
      vertex 16.499325 13.309285 2.000025
      vertex 16.499325 13.309285 0.000025
      vertex 16.324669 12.922898 2.000025
    endloop
  endfacet
  facet normal -0.967731 0.251986 0.000000
    outer loop
      vertex 16.606174 13.719633 0.000025
      vertex 16.499325 13.309285 0.000025
      vertex 16.499325 13.309285 2.000025
    endloop
  endfacet
  facet normal -0.967731 0.251986 0.000000
    outer loop
      vertex 16.606174 13.719633 2.000025
      vertex 16.606174 13.719633 0.000025
      vertex 16.499325 13.309285 2.000025
    endloop
  endfacet
  facet normal -0.996397 0.084813 0.000000
    outer loop
      vertex 16.642138 14.142134 0.000025
      vertex 16.606174 13.719633 0.000025
      vertex 16.606174 13.719633 2.000025
    endloop
  endfacet
  facet normal -0.996397 0.084813 0.000000
    outer loop
      vertex 16.642138 14.142134 2.000025
      vertex 16.642138 14.142134 0.000025
      vertex 16.606174 13.719633 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.639603 31.213202 2.000025
      vertex 153.585159 16.374451 2.000025
      vertex 153.978622 16.532551 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 154.393143 16.621883 2.000025
      vertex 157.639603 31.213202 2.000025
      vertex 153.978622 16.532551 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 154.816772 16.639881 2.000025
      vertex 157.639603 31.213202 2.000025
      vertex 154.393143 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.639603 31.213202 2.000025
      vertex 154.816772 16.639881 2.000025
      vertex 155.237381 16.586025 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.642807 16.461857 2.000025
      vertex 157.639603 31.213202 2.000025
      vertex 155.237381 16.586025 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 164.710678 24.142136 2.000025
      vertex 157.639603 31.213202 2.000025
      vertex 155.642807 16.461857 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 11.213205 2.000025
      vertex 152.291336 13.512191 2.000025
      vertex 152.219681 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.210678 14.142134 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.219681 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 11.213205 2.000025
      vertex 152.210678 14.142134 2.000025
      vertex 152.219681 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.291336 14.772079 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.219681 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.432602 15.171889 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.291336 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 11.213205 2.000025
      vertex 152.432602 15.171889 2.000025
      vertex 152.639404 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.905792 15.871983 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.639404 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 157.639603 31.213202 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.905792 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 153.224091 16.152128 2.000025
      vertex 157.639603 31.213202 2.000025
      vertex 152.905792 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 153.585159 16.374451 2.000025
      vertex 157.639603 31.213202 2.000025
      vertex 153.224091 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 164.710678 24.142136 2.000025
      vertex 155.642807 16.461857 2.000025
      vertex 156.021439 16.270958 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.362350 16.018816 2.000025
      vertex 164.710678 24.142136 2.000025
      vertex 156.021439 16.270958 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 166.220230 22.359804 2.000025
      vertex 164.710678 24.142136 2.000025
      vertex 156.362350 16.018816 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.655762 15.712686 2.000025
      vertex 166.220230 22.359804 2.000025
      vertex 156.362350 16.018816 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 167.415848 20.353313 2.000025
      vertex 166.220230 22.359804 2.000025
      vertex 156.655762 15.712686 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 156.893219 15.361372 2.000025
      vertex 167.415848 20.353313 2.000025
      vertex 156.655762 15.712686 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.264893 18.177397 2.000025
      vertex 167.415848 20.353313 2.000025
      vertex 156.893219 15.361372 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.067871 14.974985 2.000025
      vertex 168.264893 18.177397 2.000025
      vertex 156.893219 15.361372 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.744202 15.891414 2.000025
      vertex 168.264893 18.177397 2.000025
      vertex 157.067871 14.974985 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.174713 14.564637 2.000025
      vertex 168.744202 15.891414 2.000025
      vertex 157.067871 14.974985 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 168.840729 13.557710 2.000025
      vertex 168.744202 15.891414 2.000025
      vertex 157.174713 14.564637 2.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 1.000000
    outer loop
      vertex 157.210678 14.142134 2.000025
      vertex 168.840729 13.557710 2.000025
      vertex 157.174713 14.564637 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 168.551834 11.239953 2.000025
      vertex 168.840729 13.557710 2.000025
      vertex 157.210678 14.142134 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.174713 13.719633 2.000025
      vertex 168.551834 11.239953 2.000025
      vertex 157.210678 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 167.885361 9.001359 2.000025
      vertex 168.551834 11.239953 2.000025
      vertex 157.174713 13.719633 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 157.067871 13.309285 2.000025
      vertex 167.885361 9.001359 2.000025
      vertex 157.174713 13.719633 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 166.859543 6.902985 2.000025
      vertex 167.885361 9.001359 2.000025
      vertex 157.067871 13.309285 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.893219 12.922898 2.000025
      vertex 166.859543 6.902985 2.000025
      vertex 157.067871 13.309285 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 165.502304 5.002081 2.000025
      vertex 166.859543 6.902985 2.000025
      vertex 156.893219 12.922898 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.655762 12.571585 2.000025
      vertex 165.502304 5.002081 2.000025
      vertex 156.893219 12.922898 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 163.850723 3.350496 2.000025
      vertex 165.502304 5.002081 2.000025
      vertex 156.655762 12.571585 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.362350 12.265455 2.000025
      vertex 163.850723 3.350496 2.000025
      vertex 156.655762 12.571585 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 161.949829 1.993276 2.000025
      vertex 163.850723 3.350496 2.000025
      vertex 156.362350 12.265455 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 156.021439 12.013312 2.000025
      vertex 161.949829 1.993276 2.000025
      vertex 156.362350 12.265455 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 159.851456 0.967450 2.000025
      vertex 161.949829 1.993276 2.000025
      vertex 156.021439 12.013312 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.642807 11.822410 2.000025
      vertex 159.851456 0.967450 2.000025
      vertex 156.021439 12.013312 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 157.612854 0.300989 2.000025
      vertex 159.851456 0.967450 2.000025
      vertex 155.642807 11.822410 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 155.237381 11.698246 2.000025
      vertex 157.612854 0.300989 2.000025
      vertex 155.642807 11.822410 2.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 1.000000
    outer loop
      vertex 155.295105 0.012077 2.000025
      vertex 157.612854 0.300989 2.000025
      vertex 155.237381 11.698246 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 154.816772 11.644385 2.000025
      vertex 155.295105 0.012077 2.000025
      vertex 155.237381 11.698246 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 152.961411 0.108600 2.000025
      vertex 155.295105 0.012077 2.000025
      vertex 154.816772 11.644385 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 154.393143 11.662386 2.000025
      vertex 152.961411 0.108600 2.000025
      vertex 154.816772 11.644385 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 150.675415 0.587925 2.000025
      vertex 152.961411 0.108600 2.000025
      vertex 154.393143 11.662386 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.978622 11.751719 2.000025
      vertex 150.675415 0.587925 2.000025
      vertex 154.393143 11.662386 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 148.499496 1.436971 2.000025
      vertex 150.675415 0.587925 2.000025
      vertex 153.978622 11.751719 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.585159 11.909821 2.000025
      vertex 148.499496 1.436971 2.000025
      vertex 153.978622 11.751719 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 146.493011 2.632573 2.000025
      vertex 148.499496 1.436971 2.000025
      vertex 153.585159 11.909821 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 153.224091 12.132142 2.000025
      vertex 146.493011 2.632573 2.000025
      vertex 153.585159 11.909821 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 144.710678 4.142136 2.000025
      vertex 146.493011 2.632573 2.000025
      vertex 153.224091 12.132142 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 144.710678 4.142136 2.000025
      vertex 153.224091 12.132142 2.000025
      vertex 152.905792 12.412288 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.639404 12.742199 2.000025
      vertex 144.710678 4.142136 2.000025
      vertex 152.905792 12.412288 2.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 1.000000
    outer loop
      vertex 137.639618 11.213205 2.000025
      vertex 144.710678 4.142136 2.000025
      vertex 152.639404 12.742199 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.432602 13.112381 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.639404 12.742199 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 1.000000
    outer loop
      vertex 152.291336 13.512191 2.000025
      vertex 137.639618 11.213205 2.000025
      vertex 152.432602 13.112381 2.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 32.426407 0.000025
      vertex 152.291336 14.772079 0.000025
      vertex 152.219681 14.354151 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.210678 14.142134 0.000025
      vertex 116.426407 32.426407 0.000025
      vertex 152.219681 14.354151 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 4.142136 0.000025
      vertex 116.426407 32.426407 0.000025
      vertex 152.210678 14.142134 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 34.176407 0.000025
      vertex 134.676392 34.176407 0.000025
      vertex 152.905792 15.871983 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.639404 15.542071 0.000025
      vertex 116.426407 34.176407 0.000025
      vertex 152.905792 15.871983 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 116.426407 32.426407 0.000025
      vertex 116.426407 34.176407 0.000025
      vertex 152.639404 15.542071 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.432602 15.171889 0.000025
      vertex 116.426407 32.426407 0.000025
      vertex 152.639404 15.542071 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.291336 14.772079 0.000025
      vertex 116.426407 32.426407 0.000025
      vertex 152.432602 15.171889 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.237381 16.586025 0.000025
      vertex 154.816772 16.639881 0.000025
      vertex 136.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 164.710678 24.142136 0.000025
      vertex 155.237381 16.586025 0.000025
      vertex 136.426407 52.426407 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.642807 16.461857 0.000025
      vertex 155.237381 16.586025 0.000025
      vertex 164.710678 24.142136 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.021439 16.270958 0.000025
      vertex 155.642807 16.461857 0.000025
      vertex 164.710678 24.142136 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 136.426407 52.426407 0.000025
      vertex 154.816772 16.639881 0.000025
      vertex 154.393143 16.621883 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.978622 16.532551 0.000025
      vertex 136.426407 52.426407 0.000025
      vertex 154.393143 16.621883 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 52.426407 0.000025
      vertex 136.426407 52.426407 0.000025
      vertex 153.978622 16.532551 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.585159 16.374451 0.000025
      vertex 134.676392 52.426407 0.000025
      vertex 153.978622 16.532551 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 134.676392 34.176407 0.000025
      vertex 134.676392 52.426407 0.000025
      vertex 153.585159 16.374451 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 153.224091 16.152128 0.000025
      vertex 134.676392 34.176407 0.000025
      vertex 153.585159 16.374451 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.905792 15.871983 0.000025
      vertex 134.676392 34.176407 0.000025
      vertex 153.224091 16.152128 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 4.142136 0.000025
      vertex 152.210678 14.142134 0.000025
      vertex 152.219681 13.930120 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.291336 13.512191 0.000025
      vertex 144.710678 4.142136 0.000025
      vertex 152.219681 13.930120 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.432602 13.112381 0.000025
      vertex 144.710678 4.142136 0.000025
      vertex 152.291336 13.512191 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 144.710678 4.142136 0.000025
      vertex 152.432602 13.112381 0.000025
      vertex 152.639404 12.742199 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 152.905792 12.412288 0.000025
      vertex 144.710678 4.142136 0.000025
      vertex 152.639404 12.742199 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 146.493011 2.632573 0.000025
      vertex 144.710678 4.142136 0.000025
      vertex 152.905792 12.412288 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.224091 12.132142 0.000025
      vertex 146.493011 2.632573 0.000025
      vertex 152.905792 12.412288 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 148.499496 1.436971 0.000025
      vertex 146.493011 2.632573 0.000025
      vertex 153.224091 12.132142 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.585159 11.909821 0.000025
      vertex 148.499496 1.436971 0.000025
      vertex 153.224091 12.132142 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 150.675415 0.587925 0.000025
      vertex 148.499496 1.436971 0.000025
      vertex 153.585159 11.909821 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 153.978622 11.751719 0.000025
      vertex 150.675415 0.587925 0.000025
      vertex 153.585159 11.909821 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 152.961411 0.108600 0.000025
      vertex 150.675415 0.587925 0.000025
      vertex 153.978622 11.751719 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 154.393143 11.662386 0.000025
      vertex 152.961411 0.108600 0.000025
      vertex 153.978622 11.751719 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 155.295105 0.012077 0.000025
      vertex 152.961411 0.108600 0.000025
      vertex 154.393143 11.662386 0.000025
    endloop
  endfacet
  facet normal -0.000000 -0.000000 -1.000000
    outer loop
      vertex 154.816772 11.644385 0.000025
      vertex 155.295105 0.012077 0.000025
      vertex 154.393143 11.662386 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 157.612854 0.300989 0.000025
      vertex 155.295105 0.012077 0.000025
      vertex 154.816772 11.644385 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.237381 11.698246 0.000025
      vertex 157.612854 0.300989 0.000025
      vertex 154.816772 11.644385 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 159.851456 0.967450 0.000025
      vertex 157.612854 0.300989 0.000025
      vertex 155.237381 11.698246 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 155.642807 11.822410 0.000025
      vertex 159.851456 0.967450 0.000025
      vertex 155.237381 11.698246 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 161.949829 1.993276 0.000025
      vertex 159.851456 0.967450 0.000025
      vertex 155.642807 11.822410 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.021439 12.013312 0.000025
      vertex 161.949829 1.993276 0.000025
      vertex 155.642807 11.822410 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 163.850723 3.350496 0.000025
      vertex 161.949829 1.993276 0.000025
      vertex 156.021439 12.013312 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.362350 12.265455 0.000025
      vertex 163.850723 3.350496 0.000025
      vertex 156.021439 12.013312 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 165.502304 5.002081 0.000025
      vertex 163.850723 3.350496 0.000025
      vertex 156.362350 12.265455 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.655762 12.571585 0.000025
      vertex 165.502304 5.002081 0.000025
      vertex 156.362350 12.265455 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 166.859543 6.902985 0.000025
      vertex 165.502304 5.002081 0.000025
      vertex 156.655762 12.571585 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 156.893219 12.922898 0.000025
      vertex 166.859543 6.902985 0.000025
      vertex 156.655762 12.571585 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 167.885361 9.001359 0.000025
      vertex 166.859543 6.902985 0.000025
      vertex 156.893219 12.922898 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.067871 13.309285 0.000025
      vertex 167.885361 9.001359 0.000025
      vertex 156.893219 12.922898 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.551834 11.239953 0.000025
      vertex 167.885361 9.001359 0.000025
      vertex 157.067871 13.309285 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.174713 13.719633 0.000025
      vertex 168.551834 11.239953 0.000025
      vertex 157.067871 13.309285 0.000025
    endloop
  endfacet
  facet normal -0.000000 0.000000 -1.000000
    outer loop
      vertex 168.840729 13.557710 0.000025
      vertex 168.551834 11.239953 0.000025
      vertex 157.174713 13.719633 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 157.210678 14.142134 0.000025
      vertex 168.840729 13.557710 0.000025
      vertex 157.174713 13.719633 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 168.744202 15.891414 0.000025
      vertex 168.840729 13.557710 0.000025
      vertex 157.210678 14.142134 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.174713 14.564637 0.000025
      vertex 168.744202 15.891414 0.000025
      vertex 157.210678 14.142134 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 168.264893 18.177397 0.000025
      vertex 168.744202 15.891414 0.000025
      vertex 157.174713 14.564637 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 157.067871 14.974985 0.000025
      vertex 168.264893 18.177397 0.000025
      vertex 157.174713 14.564637 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 167.415848 20.353313 0.000025
      vertex 168.264893 18.177397 0.000025
      vertex 157.067871 14.974985 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.893219 15.361372 0.000025
      vertex 167.415848 20.353313 0.000025
      vertex 157.067871 14.974985 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 166.220230 22.359804 0.000025
      vertex 167.415848 20.353313 0.000025
      vertex 156.893219 15.361372 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.655762 15.712686 0.000025
      vertex 166.220230 22.359804 0.000025
      vertex 156.893219 15.361372 0.000025
    endloop
  endfacet
  facet normal 0.000000 -0.000000 -1.000000
    outer loop
      vertex 164.710678 24.142136 0.000025
      vertex 166.220230 22.359804 0.000025
      vertex 156.655762 15.712686 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.362350 16.018816 0.000025
      vertex 164.710678 24.142136 0.000025
      vertex 156.655762 15.712686 0.000025
    endloop
  endfacet
  facet normal 0.000000 0.000000 -1.000000
    outer loop
      vertex 156.021439 16.270958 0.000025
      vertex 164.710678 24.142136 0.000025
      vertex 156.362350 16.018816 0.000025
    endloop
  endfacet
  facet normal 0.763085 0.646298 0.000000
    outer loop
      vertex 166.220230 22.359804 2.000025
      vertex 164.710678 24.142136 0.000025
      vertex 164.710678 24.142136 2.000025
    endloop
  endfacet
  facet normal 0.763085 0.646298 -0.000000
    outer loop
      vertex 166.220230 22.359804 0.000025
      vertex 164.710678 24.142136 0.000025
      vertex 166.220230 22.359804 2.000025
    endloop
  endfacet
  facet normal 0.859052 0.511888 0.000000
    outer loop
      vertex 167.415848 20.353313 2.000025
      vertex 166.220230 22.359804 0.000025
      vertex 166.220230 22.359804 2.000025
    endloop
  endfacet
  facet normal 0.859052 0.511888 -0.000000
    outer loop
      vertex 167.415848 20.353313 0.000025
      vertex 166.220230 22.359804 0.000025
      vertex 167.415848 20.353313 2.000025
    endloop
  endfacet
  facet normal 0.931591 0.363508 0.000000
    outer loop
      vertex 168.264893 18.177397 2.000025
      vertex 167.415848 20.353313 0.000025
      vertex 167.415848 20.353313 2.000025
    endloop
  endfacet
  facet normal 0.931591 0.363508 -0.000000
    outer loop
      vertex 168.264893 18.177397 0.000025
      vertex 167.415848 20.353313 0.000025
      vertex 168.264893 18.177397 2.000025
    endloop
  endfacet
  facet normal 0.978718 0.205211 0.000000
    outer loop
      vertex 168.744202 15.891414 2.000025
      vertex 168.264893 18.177397 0.000025
      vertex 168.264893 18.177397 2.000025
    endloop
  endfacet
  facet normal 0.978718 0.205211 -0.000000
    outer loop
      vertex 168.744202 15.891414 0.000025
      vertex 168.264893 18.177397 0.000025
      vertex 168.744202 15.891414 2.000025
    endloop
  endfacet
  facet normal 0.999146 0.041327 0.000000
    outer loop
      vertex 168.840729 13.557710 2.000025
      vertex 168.744202 15.891414 0.000025
      vertex 168.744202 15.891414 2.000025
    endloop
  endfacet
  facet normal 0.999146 0.041327 -0.000000
    outer loop
      vertex 168.840729 13.557710 0.000025
      vertex 168.744202 15.891414 0.000025
      vertex 168.840729 13.557710 2.000025
    endloop
  endfacet
  facet normal 0.992321 -0.123687 0.000000
    outer loop
      vertex 168.551834 11.239953 2.000025
      vertex 168.840729 13.557710 0.000025
      vertex 168.840729 13.557710 2.000025
    endloop
  endfacet
  facet normal 0.992321 -0.123687 0.000000
    outer loop
      vertex 168.551834 11.239953 0.000025
      vertex 168.840729 13.557710 0.000025
      vertex 168.551834 11.239953 2.000025
    endloop
  endfacet
  facet normal 0.958426 -0.285342 0.000000
    outer loop
      vertex 167.885361 9.001359 2.000025
      vertex 168.551834 11.239953 0.000025
      vertex 168.551834 11.239953 2.000025
    endloop
  endfacet
  facet normal 0.958426 -0.285342 0.000000
    outer loop
      vertex 167.885361 9.001359 0.000025
      vertex 168.551834 11.239953 0.000025
      vertex 167.885361 9.001359 2.000025
    endloop
  endfacet
  facet normal 0.898393 -0.439192 0.000000
    outer loop
      vertex 166.859543 6.902985 2.000025
      vertex 167.885361 9.001359 0.000025
      vertex 167.885361 9.001359 2.000025
    endloop
  endfacet
  facet normal 0.898393 -0.439192 0.000000
    outer loop
      vertex 166.859543 6.902985 0.000025
      vertex 167.885361 9.001359 0.000025
      vertex 166.859543 6.902985 2.000025
    endloop
  endfacet
  facet normal 0.813845 -0.581082 0.000000
    outer loop
      vertex 165.502304 5.002081 2.000025
      vertex 166.859543 6.902985 0.000025
      vertex 166.859543 6.902985 2.000025
    endloop
  endfacet
  facet normal 0.813845 -0.581082 0.000000
    outer loop
      vertex 165.502304 5.002081 0.000025
      vertex 166.859543 6.902985 0.000025
      vertex 165.502304 5.002081 2.000025
    endloop
  endfacet
  facet normal 0.707108 -0.707106 0.000000
    outer loop
      vertex 163.850723 3.350496 2.000025
      vertex 165.502304 5.002081 0.000025
      vertex 165.502304 5.002081 2.000025
    endloop
  endfacet
  facet normal 0.707108 -0.707106 0.000000
    outer loop
      vertex 163.850723 3.350496 0.000025
      vertex 165.502304 5.002081 0.000025
      vertex 163.850723 3.350496 2.000025
    endloop
  endfacet
  facet normal 0.581079 -0.813847 0.000000
    outer loop
      vertex 161.949829 1.993276 2.000025
      vertex 163.850723 3.350496 0.000025
      vertex 163.850723 3.350496 2.000025
    endloop
  endfacet
  facet normal 0.581079 -0.813847 0.000000
    outer loop
      vertex 161.949829 1.993276 0.000025
      vertex 163.850723 3.350496 0.000025
      vertex 161.949829 1.993276 2.000025
    endloop
  endfacet
  facet normal 0.439194 -0.898392 0.000000
    outer loop
      vertex 159.851456 0.967450 2.000025
      vertex 161.949829 1.993276 0.000025
      vertex 161.949829 1.993276 2.000025
    endloop
  endfacet
  facet normal 0.439194 -0.898392 0.000000
    outer loop
      vertex 159.851456 0.967450 0.000025
      vertex 161.949829 1.993276 0.000025
      vertex 159.851456 0.967450 2.000025
    endloop
  endfacet
  facet normal 0.285337 -0.958427 0.000000
    outer loop
      vertex 157.612854 0.300989 2.000025
      vertex 159.851456 0.967450 0.000025
      vertex 159.851456 0.967450 2.000025
    endloop
  endfacet
  facet normal 0.285337 -0.958427 0.000000
    outer loop
      vertex 157.612854 0.300989 0.000025
      vertex 159.851456 0.967450 0.000025
      vertex 157.612854 0.300989 2.000025
    endloop
  endfacet
  facet normal 0.123694 -0.992320 0.000000
    outer loop
      vertex 155.295105 0.012077 2.000025
      vertex 157.612854 0.300989 0.000025
      vertex 157.612854 0.300989 2.000025
    endloop
  endfacet
  facet normal 0.123694 -0.992320 0.000000
    outer loop
      vertex 155.295105 0.012077 0.000025
      vertex 157.612854 0.300989 0.000025
      vertex 155.295105 0.012077 2.000025
    endloop
  endfacet
  facet normal -0.041325 -0.999146 0.000000
    outer loop
      vertex 152.961411 0.108600 2.000025
      vertex 155.295105 0.012077 0.000025
      vertex 155.295105 0.012077 2.000025
    endloop
  endfacet
  facet normal -0.041325 -0.999146 0.000000
    outer loop
      vertex 152.961411 0.108600 0.000025
      vertex 155.295105 0.012077 0.000025
      vertex 152.961411 0.108600 2.000025
    endloop
  endfacet
  facet normal -0.205216 -0.978717 0.000000
    outer loop
      vertex 150.675415 0.587925 2.000025
      vertex 152.961411 0.108600 0.000025
      vertex 152.961411 0.108600 2.000025
    endloop
  endfacet
  facet normal -0.205216 -0.978717 0.000000
    outer loop
      vertex 150.675415 0.587925 0.000025
      vertex 152.961411 0.108600 0.000025
      vertex 150.675415 0.587925 2.000025
    endloop
  endfacet
  facet normal -0.363508 -0.931591 0.000000
    outer loop
      vertex 148.499496 1.436971 2.000025
      vertex 150.675415 0.587925 0.000025
      vertex 150.675415 0.587925 2.000025
    endloop
  endfacet
  facet normal -0.363508 -0.931591 0.000000
    outer loop
      vertex 148.499496 1.436971 0.000025
      vertex 150.675415 0.587925 0.000025
      vertex 148.499496 1.436971 2.000025
    endloop
  endfacet
  facet normal -0.511884 -0.859055 0.000000
    outer loop
      vertex 146.493011 2.632573 2.000025
      vertex 148.499496 1.436971 0.000025
      vertex 148.499496 1.436971 2.000025
    endloop
  endfacet
  facet normal -0.511884 -0.859055 0.000000
    outer loop
      vertex 146.493011 2.632573 0.000025
      vertex 148.499496 1.436971 0.000025
      vertex 146.493011 2.632573 2.000025
    endloop
  endfacet
  facet normal -0.646300 -0.763083 0.000000
    outer loop
      vertex 144.710678 4.142136 2.000025
      vertex 146.493011 2.632573 0.000025
      vertex 146.493011 2.632573 2.000025
    endloop
  endfacet
  facet normal -0.646300 -0.763083 0.000000
    outer loop
      vertex 144.710678 4.142136 0.000025
      vertex 146.493011 2.632573 0.000025
      vertex 144.710678 4.142136 2.000025
    endloop
  endfacet
  facet normal -0.996397 -0.084817 0.000000
    outer loop
      vertex 157.174713 14.564637 0.000025
      vertex 157.210678 14.142134 0.000025
      vertex 157.210678 14.142134 2.000025
    endloop
  endfacet
  facet normal -0.996397 -0.084817 -0.000000
    outer loop
      vertex 157.174713 14.564637 2.000025
      vertex 157.174713 14.564637 0.000025
      vertex 157.210678 14.142134 2.000025
    endloop
  endfacet
  facet normal -0.967735 -0.251969 0.000000
    outer loop
      vertex 157.067871 14.974985 0.000025
      vertex 157.174713 14.564637 0.000025
      vertex 157.174713 14.564637 2.000025
    endloop
  endfacet
  facet normal -0.967735 -0.251969 -0.000000
    outer loop
      vertex 157.067871 14.974985 2.000025
      vertex 157.067871 14.974985 0.000025
      vertex 157.174713 14.564637 2.000025
    endloop
  endfacet
  facet normal -0.911234 -0.411890 0.000000
    outer loop
      vertex 156.893219 15.361372 0.000025
      vertex 157.067871 14.974985 0.000025
      vertex 157.067871 14.974985 2.000025
    endloop
  endfacet
  facet normal -0.911234 -0.411890 -0.000000
    outer loop
      vertex 156.893219 15.361372 2.000025
      vertex 156.893219 15.361372 0.000025
      vertex 157.067871 14.974985 2.000025
    endloop
  endfacet
  facet normal -0.828498 -0.559992 0.000000
    outer loop
      vertex 156.655762 15.712686 0.000025
      vertex 156.893219 15.361372 0.000025
      vertex 156.893219 15.361372 2.000025
    endloop
  endfacet
  facet normal -0.828498 -0.559992 -0.000000
    outer loop
      vertex 156.655762 15.712686 2.000025
      vertex 156.655762 15.712686 0.000025
      vertex 156.893219 15.361372 2.000025
    endloop
  endfacet
  facet normal -0.721946 -0.691950 0.000000
    outer loop
      vertex 156.362350 16.018816 0.000025
      vertex 156.655762 15.712686 0.000025
      vertex 156.655762 15.712686 2.000025
    endloop
  endfacet
  facet normal -0.721946 -0.691950 -0.000000
    outer loop
      vertex 156.362350 16.018816 2.000025
      vertex 156.362350 16.018816 0.000025
      vertex 156.655762 15.712686 2.000025
    endloop
  endfacet
  facet normal -0.594641 -0.803992 0.000000
    outer loop
      vertex 156.021439 16.270958 0.000025
      vertex 156.362350 16.018816 0.000025
      vertex 156.362350 16.018816 2.000025
    endloop
  endfacet
  facet normal -0.594641 -0.803992 -0.000000
    outer loop
      vertex 156.021439 16.270958 2.000025
      vertex 156.021439 16.270958 0.000025
      vertex 156.362350 16.018816 2.000025
    endloop
  endfacet
  facet normal -0.450198 -0.892929 0.000000
    outer loop
      vertex 155.642807 16.461857 0.000025
      vertex 156.021439 16.270958 0.000025
      vertex 156.021439 16.270958 2.000025
    endloop
  endfacet
  facet normal -0.450198 -0.892929 -0.000000
    outer loop
      vertex 155.642807 16.461857 2.000025
      vertex 155.642807 16.461857 0.000025
      vertex 156.021439 16.270958 2.000025
    endloop
  endfacet
  facet normal -0.292840 -0.956161 0.000000
    outer loop
      vertex 155.237381 16.586025 0.000025
      vertex 155.642807 16.461857 0.000025
      vertex 155.642807 16.461857 2.000025
    endloop
  endfacet
  facet normal -0.292840 -0.956161 -0.000000
    outer loop
      vertex 155.237381 16.586025 2.000025
      vertex 155.237381 16.586025 0.000025
      vertex 155.642807 16.461857 2.000025
    endloop
  endfacet
  facet normal -0.127006 -0.991902 0.000000
    outer loop
      vertex 154.816772 16.639881 0.000025
      vertex 155.237381 16.586025 0.000025
      vertex 155.237381 16.586025 2.000025
    endloop
  endfacet
  facet normal -0.127006 -0.991902 -0.000000
    outer loop
      vertex 154.816772 16.639881 2.000025
      vertex 154.816772 16.639881 0.000025
      vertex 155.237381 16.586025 2.000025
    endloop
  endfacet
  facet normal 0.042446 -0.999099 0.000000
    outer loop
      vertex 154.393143 16.621883 0.000025
      vertex 154.816772 16.639881 0.000025
      vertex 154.816772 16.639881 2.000025
    endloop
  endfacet
  facet normal 0.042446 -0.999099 0.000000
    outer loop
      vertex 154.393143 16.621883 2.000025
      vertex 154.393143 16.621883 0.000025
      vertex 154.816772 16.639881 2.000025
    endloop
  endfacet
  facet normal 0.210672 -0.977557 0.000000
    outer loop
      vertex 153.978622 16.532551 0.000025
      vertex 154.393143 16.621883 0.000025
      vertex 154.393143 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.210672 -0.977557 0.000000
    outer loop
      vertex 153.978622 16.532551 2.000025
      vertex 153.978622 16.532551 0.000025
      vertex 154.393143 16.621883 2.000025
    endloop
  endfacet
  facet normal 0.372844 -0.927894 0.000000
    outer loop
      vertex 153.585159 16.374451 0.000025
      vertex 153.978622 16.532551 0.000025
      vertex 153.978622 16.532551 2.000025
    endloop
  endfacet
  facet normal 0.372844 -0.927894 0.000000
    outer loop
      vertex 153.585159 16.374451 2.000025
      vertex 153.585159 16.374451 0.000025
      vertex 153.978622 16.532551 2.000025
    endloop
  endfacet
  facet normal 0.524314 -0.851525 0.000000
    outer loop
      vertex 153.224091 16.152128 0.000025
      vertex 153.585159 16.374451 0.000025
      vertex 153.585159 16.374451 2.000025
    endloop
  endfacet
  facet normal 0.524314 -0.851525 0.000000
    outer loop
      vertex 153.224091 16.152128 2.000025
      vertex 153.224091 16.152128 0.000025
      vertex 153.585159 16.374451 2.000025
    endloop
  endfacet
  facet normal 0.660685 -0.750663 0.000000
    outer loop
      vertex 152.905792 15.871983 0.000025
      vertex 153.224091 16.152128 0.000025
      vertex 153.224091 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.660685 -0.750663 0.000000
    outer loop
      vertex 152.905792 15.871983 2.000025
      vertex 152.905792 15.871983 0.000025
      vertex 153.224091 16.152128 2.000025
    endloop
  endfacet
  facet normal 0.778032 -0.628225 0.000000
    outer loop
      vertex 152.639404 15.542071 0.000025
      vertex 152.905792 15.871983 0.000025
      vertex 152.905792 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.778032 -0.628225 0.000000
    outer loop
      vertex 152.639404 15.542071 2.000025
      vertex 152.639404 15.542071 0.000025
      vertex 152.905792 15.871983 2.000025
    endloop
  endfacet
  facet normal 0.873008 -0.487706 0.000000
    outer loop
      vertex 152.432602 15.171889 0.000025
      vertex 152.639404 15.542071 0.000025
      vertex 152.639404 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.873008 -0.487706 0.000000
    outer loop
      vertex 152.432602 15.171889 2.000025
      vertex 152.432602 15.171889 0.000025
      vertex 152.639404 15.542071 2.000025
    endloop
  endfacet
  facet normal 0.942874 -0.333148 0.000000
    outer loop
      vertex 152.291336 14.772079 0.000025
      vertex 152.432602 15.171889 0.000025
      vertex 152.432602 15.171889 2.000025
    endloop
  endfacet
  facet normal 0.942874 -0.333148 0.000000
    outer loop
      vertex 152.291336 14.772079 2.000025
      vertex 152.291336 14.772079 0.000025
      vertex 152.432602 15.171889 2.000025
    endloop
  endfacet
  facet normal 0.985618 -0.168988 0.000000
    outer loop
      vertex 152.219681 14.354151 0.000025
      vertex 152.291336 14.772079 0.000025
      vertex 152.291336 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.985618 -0.168988 0.000000
    outer loop
      vertex 152.219681 14.354151 2.000025
      vertex 152.219681 14.354151 0.000025
      vertex 152.291336 14.772079 2.000025
    endloop
  endfacet
  facet normal 0.999100 -0.042424 0.000000
    outer loop
      vertex 152.210678 14.142134 0.000025
      vertex 152.219681 14.354151 0.000025
      vertex 152.219681 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.999100 -0.042424 0.000000
    outer loop
      vertex 152.210678 14.142134 2.000025
      vertex 152.210678 14.142134 0.000025
      vertex 152.219681 14.354151 2.000025
    endloop
  endfacet
  facet normal 0.999100 0.042424 0.000000
    outer loop
      vertex 152.219681 13.930120 0.000025
      vertex 152.210678 14.142134 0.000025
      vertex 152.210678 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.999100 0.042424 0.000000
    outer loop
      vertex 152.219681 13.930120 2.000025
      vertex 152.219681 13.930120 0.000025
      vertex 152.210678 14.142134 2.000025
    endloop
  endfacet
  facet normal 0.985618 0.168988 0.000000
    outer loop
      vertex 152.291336 13.512191 0.000025
      vertex 152.219681 13.930120 0.000025
      vertex 152.219681 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.985618 0.168988 0.000000
    outer loop
      vertex 152.291336 13.512191 2.000025
      vertex 152.291336 13.512191 0.000025
      vertex 152.219681 13.930120 2.000025
    endloop
  endfacet
  facet normal 0.942874 0.333148 0.000000
    outer loop
      vertex 152.432602 13.112381 0.000025
      vertex 152.291336 13.512191 0.000025
      vertex 152.291336 13.512191 2.000025
    endloop
  endfacet
  facet normal 0.942874 0.333148 0.000000
    outer loop
      vertex 152.432602 13.112381 2.000025
      vertex 152.432602 13.112381 0.000025
      vertex 152.291336 13.512191 2.000025
    endloop
  endfacet
  facet normal 0.873008 0.487706 0.000000
    outer loop
      vertex 152.639404 12.742199 0.000025
      vertex 152.432602 13.112381 0.000025
      vertex 152.432602 13.112381 2.000025
    endloop
  endfacet
  facet normal 0.873008 0.487706 0.000000
    outer loop
      vertex 152.639404 12.742199 2.000025
      vertex 152.639404 12.742199 0.000025
      vertex 152.432602 13.112381 2.000025
    endloop
  endfacet
  facet normal 0.778032 0.628225 0.000000
    outer loop
      vertex 152.905792 12.412288 0.000025
      vertex 152.639404 12.742199 0.000025
      vertex 152.639404 12.742199 2.000025
    endloop
  endfacet
  facet normal 0.778032 0.628225 0.000000
    outer loop
      vertex 152.905792 12.412288 2.000025
      vertex 152.905792 12.412288 0.000025
      vertex 152.639404 12.742199 2.000025
    endloop
  endfacet
  facet normal 0.660685 0.750663 0.000000
    outer loop
      vertex 153.224091 12.132142 0.000025
      vertex 152.905792 12.412288 0.000025
      vertex 152.905792 12.412288 2.000025
    endloop
  endfacet
  facet normal 0.660685 0.750663 0.000000
    outer loop
      vertex 153.224091 12.132142 2.000025
      vertex 153.224091 12.132142 0.000025
      vertex 152.905792 12.412288 2.000025
    endloop
  endfacet
  facet normal 0.524312 0.851526 0.000000
    outer loop
      vertex 153.585159 11.909821 0.000025
      vertex 153.224091 12.132142 0.000025
      vertex 153.224091 12.132142 2.000025
    endloop
  endfacet
  facet normal 0.524312 0.851526 0.000000
    outer loop
      vertex 153.585159 11.909821 2.000025
      vertex 153.585159 11.909821 0.000025
      vertex 153.224091 12.132142 2.000025
    endloop
  endfacet
  facet normal 0.372847 0.927893 0.000000
    outer loop
      vertex 153.978622 11.751719 0.000025
      vertex 153.585159 11.909821 0.000025
      vertex 153.585159 11.909821 2.000025
    endloop
  endfacet
  facet normal 0.372847 0.927893 0.000000
    outer loop
      vertex 153.978622 11.751719 2.000025
      vertex 153.978622 11.751719 0.000025
      vertex 153.585159 11.909821 2.000025
    endloop
  endfacet
  facet normal 0.210672 0.977557 0.000000
    outer loop
      vertex 154.393143 11.662386 0.000025
      vertex 153.978622 11.751719 0.000025
      vertex 153.978622 11.751719 2.000025
    endloop
  endfacet
  facet normal 0.210672 0.977557 0.000000
    outer loop
      vertex 154.393143 11.662386 2.000025
      vertex 154.393143 11.662386 0.000025
      vertex 153.978622 11.751719 2.000025
    endloop
  endfacet
  facet normal 0.042453 0.999098 0.000000
    outer loop
      vertex 154.816772 11.644385 0.000025
      vertex 154.393143 11.662386 0.000025
      vertex 154.393143 11.662386 2.000025
    endloop
  endfacet
  facet normal 0.042453 0.999098 0.000000
    outer loop
      vertex 154.816772 11.644385 2.000025
      vertex 154.816772 11.644385 0.000025
      vertex 154.393143 11.662386 2.000025
    endloop
  endfacet
  facet normal -0.127017 0.991901 0.000000
    outer loop
      vertex 155.237381 11.698246 0.000025
      vertex 154.816772 11.644385 0.000025
      vertex 154.816772 11.644385 2.000025
    endloop
  endfacet
  facet normal -0.127017 0.991901 0.000000
    outer loop
      vertex 155.237381 11.698246 2.000025
      vertex 155.237381 11.698246 0.000025
      vertex 154.816772 11.644385 2.000025
    endloop
  endfacet
  facet normal -0.292830 0.956165 0.000000
    outer loop
      vertex 155.642807 11.822410 0.000025
      vertex 155.237381 11.698246 0.000025
      vertex 155.237381 11.698246 2.000025
    endloop
  endfacet
  facet normal -0.292830 0.956165 0.000000
    outer loop
      vertex 155.642807 11.822410 2.000025
      vertex 155.642807 11.822410 0.000025
      vertex 155.237381 11.698246 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 156.021439 12.013312 0.000025
      vertex 155.642807 11.822410 0.000025
      vertex 155.642807 11.822410 2.000025
    endloop
  endfacet
  facet normal -0.450205 0.892925 0.000000
    outer loop
      vertex 156.021439 12.013312 2.000025
      vertex 156.021439 12.013312 0.000025
      vertex 155.642807 11.822410 2.000025
    endloop
  endfacet
  facet normal -0.594642 0.803991 0.000000
    outer loop
      vertex 156.362350 12.265455 0.000025
      vertex 156.021439 12.013312 0.000025
      vertex 156.021439 12.013312 2.000025
    endloop
  endfacet
  facet normal -0.594642 0.803991 0.000000
    outer loop
      vertex 156.362350 12.265455 2.000025
      vertex 156.362350 12.265455 0.000025
      vertex 156.021439 12.013312 2.000025
    endloop
  endfacet
  facet normal -0.721944 0.691951 0.000000
    outer loop
      vertex 156.655762 12.571585 0.000025
      vertex 156.362350 12.265455 0.000025
      vertex 156.362350 12.265455 2.000025
    endloop
  endfacet
  facet normal -0.721944 0.691951 0.000000
    outer loop
      vertex 156.655762 12.571585 2.000025
      vertex 156.655762 12.571585 0.000025
      vertex 156.362350 12.265455 2.000025
    endloop
  endfacet
  facet normal -0.828498 0.559992 0.000000
    outer loop
      vertex 156.893219 12.922898 0.000025
      vertex 156.655762 12.571585 0.000025
      vertex 156.655762 12.571585 2.000025
    endloop
  endfacet
  facet normal -0.828498 0.559992 0.000000
    outer loop
      vertex 156.893219 12.922898 2.000025
      vertex 156.893219 12.922898 0.000025
      vertex 156.655762 12.571585 2.000025
    endloop
  endfacet
  facet normal -0.911234 0.411890 0.000000
    outer loop
      vertex 157.067871 13.309285 0.000025
      vertex 156.893219 12.922898 0.000025
      vertex 156.893219 12.922898 2.000025
    endloop
  endfacet
  facet normal -0.911234 0.411890 0.000000
    outer loop
      vertex 157.067871 13.309285 2.000025
      vertex 157.067871 13.309285 0.000025
      vertex 156.893219 12.922898 2.000025
    endloop
  endfacet
  facet normal -0.967735 0.251969 0.000000
    outer loop
      vertex 157.174713 13.719633 0.000025
      vertex 157.067871 13.309285 0.000025
      vertex 157.067871 13.309285 2.000025
    endloop
  endfacet
  facet normal -0.967735 0.251969 0.000000
    outer loop
      vertex 157.174713 13.719633 2.000025
      vertex 157.174713 13.719633 0.000025
      vertex 157.067871 13.309285 2.000025
    endloop
  endfacet
  facet normal -0.996396 0.084817 0.000000
    outer loop
      vertex 157.210678 14.142134 0.000025
      vertex 157.174713 13.719633 0.000025
      vertex 157.174713 13.719633 2.000025
    endloop
  endfacet
  facet normal -0.996396 0.084817 0.000000
    outer loop
      vertex 157.210678 14.142134 2.000025
      vertex 157.210678 14.142134 0.000025
      vertex 157.174713 13.719633 2.000025
    endloop
  endfacet
  facet normal -0.999099 0.000000 -0.042437
    outer loop
      vertex 67.328674 86.426407 14.925471
      vertex 67.323631 88.426407 15.044200
      vertex 67.328674 88.426407 14.925471
    endloop
  endfacet
  facet normal -0.985616 0.000000 -0.169002
    outer loop
      vertex 67.368805 88.426407 14.691431
      vertex 67.328674 86.426407 14.925471
      vertex 67.328674 88.426407 14.925471
    endloop
  endfacet
  facet normal -0.985616 0.000000 -0.169002
    outer loop
      vertex 67.368805 86.426407 14.691431
      vertex 67.328674 86.426407 14.925471
      vertex 67.368805 88.426407 14.691431
    endloop
  endfacet
  facet normal -0.942874 0.000000 -0.333150
    outer loop
      vertex 67.447914 88.426407 14.467538
      vertex 67.368805 86.426407 14.691431
      vertex 67.368805 88.426407 14.691431
    endloop
  endfacet
  facet normal -0.942874 0.000000 -0.333150
    outer loop
      vertex 67.447914 86.426407 14.467538
      vertex 67.368805 86.426407 14.691431
      vertex 67.447914 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.873014 0.000000 -0.487695
    outer loop
      vertex 67.563721 88.426407 14.260235
      vertex 67.447914 86.426407 14.467538
      vertex 67.447914 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.873014 0.000000 -0.487695
    outer loop
      vertex 67.563721 86.426407 14.260235
      vertex 67.447914 86.426407 14.467538
      vertex 67.563721 88.426407 14.260235
    endloop
  endfacet
  facet normal -0.778029 0.000000 -0.628229
    outer loop
      vertex 67.712898 88.426407 14.075486
      vertex 67.563721 86.426407 14.260235
      vertex 67.563721 88.426407 14.260235
    endloop
  endfacet
  facet normal -0.778029 0.000000 -0.628229
    outer loop
      vertex 67.712898 86.426407 14.075486
      vertex 67.563721 86.426407 14.260235
      vertex 67.712898 88.426407 14.075486
    endloop
  endfacet
  facet normal -0.660674 0.000000 -0.750673
    outer loop
      vertex 67.891151 88.426407 13.918604
      vertex 67.712898 86.426407 14.075486
      vertex 67.712898 88.426407 14.075486
    endloop
  endfacet
  facet normal -0.660674 0.000000 -0.750673
    outer loop
      vertex 67.891151 86.426407 13.918604
      vertex 67.712898 86.426407 14.075486
      vertex 67.891151 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.524321 0.000000 -0.851521
    outer loop
      vertex 68.093346 88.426407 13.794104
      vertex 67.891151 86.426407 13.918604
      vertex 67.891151 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.524321 0.000000 -0.851521
    outer loop
      vertex 68.093346 86.426407 13.794104
      vertex 67.891151 86.426407 13.918604
      vertex 68.093346 88.426407 13.794104
    endloop
  endfacet
  facet normal -0.372851 0.000000 -0.927891
    outer loop
      vertex 68.313683 88.426407 13.705566
      vertex 68.093346 86.426407 13.794104
      vertex 68.093346 88.426407 13.794104
    endloop
  endfacet
  facet normal -0.372851 0.000000 -0.927891
    outer loop
      vertex 68.313683 86.426407 13.705566
      vertex 68.093346 86.426407 13.794104
      vertex 68.313683 88.426407 13.705566
    endloop
  endfacet
  facet normal -0.210680 0.000000 -0.977555
    outer loop
      vertex 68.545807 88.426407 13.655540
      vertex 68.313683 86.426407 13.705566
      vertex 68.313683 88.426407 13.705566
    endloop
  endfacet
  facet normal -0.210680 0.000000 -0.977555
    outer loop
      vertex 68.545807 86.426407 13.655540
      vertex 68.313683 86.426407 13.705566
      vertex 68.545807 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.042439 0.000000 -0.999099
    outer loop
      vertex 68.783051 88.426407 13.645462
      vertex 68.545807 86.426407 13.655540
      vertex 68.545807 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.042439 0.000000 -0.999099
    outer loop
      vertex 68.783051 86.426407 13.645462
      vertex 68.545807 86.426407 13.655540
      vertex 68.783051 88.426407 13.645462
    endloop
  endfacet
  facet normal 0.127016 0.000000 -0.991901
    outer loop
      vertex 69.018585 88.426407 13.675623
      vertex 68.783051 86.426407 13.645462
      vertex 68.783051 88.426407 13.645462
    endloop
  endfacet
  facet normal 0.127016 0.000000 -0.991901
    outer loop
      vertex 69.018585 86.426407 13.675623
      vertex 68.783051 86.426407 13.645462
      vertex 69.018585 88.426407 13.675623
    endloop
  endfacet
  facet normal 0.292818 0.000000 -0.956168
    outer loop
      vertex 69.245636 88.426407 13.745155
      vertex 69.018585 86.426407 13.675623
      vertex 69.018585 88.426407 13.675623
    endloop
  endfacet
  facet normal 0.292818 0.000000 -0.956168
    outer loop
      vertex 69.245636 86.426407 13.745155
      vertex 69.018585 86.426407 13.675623
      vertex 69.245636 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.450212 0.000000 -0.892922
    outer loop
      vertex 69.457664 88.426407 13.852060
      vertex 69.245636 86.426407 13.745155
      vertex 69.245636 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.450212 0.000000 -0.892922
    outer loop
      vertex 69.457664 86.426407 13.852060
      vertex 69.245636 86.426407 13.745155
      vertex 69.457664 88.426407 13.852060
    endloop
  endfacet
  facet normal 0.594622 0.000000 -0.804005
    outer loop
      vertex 69.648582 88.426407 13.993258
      vertex 69.457664 86.426407 13.852060
      vertex 69.457664 88.426407 13.852060
    endloop
  endfacet
  facet normal 0.594622 0.000000 -0.804005
    outer loop
      vertex 69.648582 86.426407 13.993258
      vertex 69.457664 86.426407 13.852060
      vertex 69.648582 88.426407 13.993258
    endloop
  endfacet
  facet normal 0.721970 0.000000 -0.691924
    outer loop
      vertex 69.812881 88.426407 14.164692
      vertex 69.648582 86.426407 13.993258
      vertex 69.648582 88.426407 13.993258
    endloop
  endfacet
  facet normal 0.721970 0.000000 -0.691924
    outer loop
      vertex 69.812881 86.426407 14.164692
      vertex 69.648582 86.426407 13.993258
      vertex 69.812881 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.828504 0.000000 -0.559983
    outer loop
      vertex 69.945854 88.426407 14.361427
      vertex 69.812881 86.426407 14.164692
      vertex 69.812881 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.828504 0.000000 -0.559983
    outer loop
      vertex 69.945854 86.426407 14.361427
      vertex 69.812881 86.426407 14.164692
      vertex 69.945854 88.426407 14.361427
    endloop
  endfacet
  facet normal 0.911228 0.000000 -0.411902
    outer loop
      vertex 70.043663 88.426407 14.577805
      vertex 69.945854 86.426407 14.361427
      vertex 69.945854 88.426407 14.361427
    endloop
  endfacet
  facet normal 0.911228 0.000000 -0.411902
    outer loop
      vertex 70.043663 86.426407 14.577805
      vertex 69.945854 86.426407 14.361427
      vertex 70.043663 88.426407 14.577805
    endloop
  endfacet
  facet normal 0.967737 0.000000 -0.251962
    outer loop
      vertex 70.103493 88.426407 14.807599
      vertex 70.043663 86.426407 14.577805
      vertex 70.043663 88.426407 14.577805
    endloop
  endfacet
  facet normal 0.967737 0.000000 -0.251962
    outer loop
      vertex 70.103493 86.426407 14.807599
      vertex 70.043663 86.426407 14.577805
      vertex 70.103493 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.996396 0.000000 -0.084822
    outer loop
      vertex 70.123634 88.426407 15.044200
      vertex 70.103493 86.426407 14.807599
      vertex 70.103493 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.996396 0.000000 -0.084822
    outer loop
      vertex 70.123634 86.426407 15.044200
      vertex 70.103493 86.426407 14.807599
      vertex 70.123634 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.996396 0.000000 0.084822
    outer loop
      vertex 70.103493 88.426407 15.280802
      vertex 70.123634 86.426407 15.044200
      vertex 70.123634 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.996396 -0.000000 0.084822
    outer loop
      vertex 70.103493 86.426407 15.280802
      vertex 70.123634 86.426407 15.044200
      vertex 70.103493 88.426407 15.280802
    endloop
  endfacet
  facet normal 0.967737 0.000000 0.251962
    outer loop
      vertex 70.043663 88.426407 15.510596
      vertex 70.103493 86.426407 15.280802
      vertex 70.103493 88.426407 15.280802
    endloop
  endfacet
  facet normal 0.967737 -0.000000 0.251962
    outer loop
      vertex 70.043663 86.426407 15.510596
      vertex 70.103493 86.426407 15.280802
      vertex 70.043663 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.911228 0.000000 0.411903
    outer loop
      vertex 69.945854 88.426407 15.726973
      vertex 70.043663 86.426407 15.510596
      vertex 70.043663 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.911228 -0.000000 0.411903
    outer loop
      vertex 69.945854 86.426407 15.726973
      vertex 70.043663 86.426407 15.510596
      vertex 69.945854 88.426407 15.726973
    endloop
  endfacet
  facet normal 0.828505 0.000000 0.559981
    outer loop
      vertex 69.812881 88.426407 15.923709
      vertex 69.945854 86.426407 15.726973
      vertex 69.945854 88.426407 15.726973
    endloop
  endfacet
  facet normal 0.828505 -0.000000 0.559981
    outer loop
      vertex 69.812881 86.426407 15.923709
      vertex 69.945854 86.426407 15.726973
      vertex 69.812881 88.426407 15.923709
    endloop
  endfacet
  facet normal 0.721966 0.000000 0.691928
    outer loop
      vertex 69.648582 88.426407 16.095140
      vertex 69.812881 86.426407 15.923709
      vertex 69.812881 88.426407 15.923709
    endloop
  endfacet
  facet normal 0.721966 -0.000000 0.691928
    outer loop
      vertex 69.648582 86.426407 16.095140
      vertex 69.812881 86.426407 15.923709
      vertex 69.648582 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.594630 0.000000 0.803999
    outer loop
      vertex 69.457664 88.426407 16.236341
      vertex 69.648582 86.426407 16.095140
      vertex 69.648582 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.594630 -0.000000 0.803999
    outer loop
      vertex 69.457664 86.426407 16.236341
      vertex 69.648582 86.426407 16.095140
      vertex 69.457664 88.426407 16.236341
    endloop
  endfacet
  facet normal 0.450206 0.000000 0.892925
    outer loop
      vertex 69.245636 88.426407 16.343245
      vertex 69.457664 86.426407 16.236341
      vertex 69.457664 88.426407 16.236341
    endloop
  endfacet
  facet normal 0.450206 -0.000000 0.892925
    outer loop
      vertex 69.245636 86.426407 16.343245
      vertex 69.457664 86.426407 16.236341
      vertex 69.245636 88.426407 16.343245
    endloop
  endfacet
  facet normal 0.292818 0.000000 0.956168
    outer loop
      vertex 69.018585 88.426407 16.412777
      vertex 69.245636 86.426407 16.343245
      vertex 69.245636 88.426407 16.343245
    endloop
  endfacet
  facet normal 0.292818 -0.000000 0.956168
    outer loop
      vertex 69.018585 86.426407 16.412777
      vertex 69.245636 86.426407 16.343245
      vertex 69.018585 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.127024 0.000000 0.991900
    outer loop
      vertex 68.783051 88.426407 16.442940
      vertex 69.018585 86.426407 16.412777
      vertex 69.018585 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.127024 -0.000000 0.991900
    outer loop
      vertex 68.783051 86.426407 16.442940
      vertex 69.018585 86.426407 16.412777
      vertex 68.783051 88.426407 16.442940
    endloop
  endfacet
  facet normal -0.042443 0.000000 0.999099
    outer loop
      vertex 68.545807 88.426407 16.432861
      vertex 68.783051 86.426407 16.442940
      vertex 68.783051 88.426407 16.442940
    endloop
  endfacet
  facet normal -0.042443 0.000000 0.999099
    outer loop
      vertex 68.545807 86.426407 16.432861
      vertex 68.783051 86.426407 16.442940
      vertex 68.545807 88.426407 16.432861
    endloop
  endfacet
  facet normal -0.210684 0.000000 0.977554
    outer loop
      vertex 68.313683 88.426407 16.382833
      vertex 68.545807 86.426407 16.432861
      vertex 68.545807 88.426407 16.432861
    endloop
  endfacet
  facet normal -0.210684 0.000000 0.977554
    outer loop
      vertex 68.313683 86.426407 16.382833
      vertex 68.545807 86.426407 16.432861
      vertex 68.313683 88.426407 16.382833
    endloop
  endfacet
  facet normal -0.372851 0.000000 0.927891
    outer loop
      vertex 68.093346 88.426407 16.294296
      vertex 68.313683 86.426407 16.382833
      vertex 68.313683 88.426407 16.382833
    endloop
  endfacet
  facet normal -0.372851 0.000000 0.927891
    outer loop
      vertex 68.093346 86.426407 16.294296
      vertex 68.313683 86.426407 16.382833
      vertex 68.093346 88.426407 16.294296
    endloop
  endfacet
  facet normal -0.524321 0.000000 0.851521
    outer loop
      vertex 67.891151 88.426407 16.169796
      vertex 68.093346 86.426407 16.294296
      vertex 68.093346 88.426407 16.294296
    endloop
  endfacet
  facet normal -0.524321 0.000000 0.851521
    outer loop
      vertex 67.891151 86.426407 16.169796
      vertex 68.093346 86.426407 16.294296
      vertex 67.891151 88.426407 16.169796
    endloop
  endfacet
  facet normal -0.660672 0.000000 0.750675
    outer loop
      vertex 67.712898 88.426407 16.012915
      vertex 67.891151 86.426407 16.169796
      vertex 67.891151 88.426407 16.169796
    endloop
  endfacet
  facet normal -0.660672 0.000000 0.750675
    outer loop
      vertex 67.712898 86.426407 16.012915
      vertex 67.891151 86.426407 16.169796
      vertex 67.712898 88.426407 16.012915
    endloop
  endfacet
  facet normal -0.778032 0.000000 0.628225
    outer loop
      vertex 67.563721 88.426407 15.828164
      vertex 67.712898 86.426407 16.012915
      vertex 67.712898 88.426407 16.012915
    endloop
  endfacet
  facet normal -0.778032 0.000000 0.628225
    outer loop
      vertex 67.563721 86.426407 15.828164
      vertex 67.712898 86.426407 16.012915
      vertex 67.563721 88.426407 15.828164
    endloop
  endfacet
  facet normal -0.873014 0.000000 0.487695
    outer loop
      vertex 67.447914 88.426407 15.620861
      vertex 67.563721 86.426407 15.828164
      vertex 67.563721 88.426407 15.828164
    endloop
  endfacet
  facet normal -0.873014 0.000000 0.487695
    outer loop
      vertex 67.447914 86.426407 15.620861
      vertex 67.563721 86.426407 15.828164
      vertex 67.447914 88.426407 15.620861
    endloop
  endfacet
  facet normal -0.942873 0.000000 0.333152
    outer loop
      vertex 67.368805 88.426407 15.396970
      vertex 67.447914 86.426407 15.620861
      vertex 67.447914 88.426407 15.620861
    endloop
  endfacet
  facet normal -0.942873 0.000000 0.333152
    outer loop
      vertex 67.368805 86.426407 15.396970
      vertex 67.447914 86.426407 15.620861
      vertex 67.368805 88.426407 15.396970
    endloop
  endfacet
  facet normal -0.985616 0.000000 0.169001
    outer loop
      vertex 67.328674 88.426407 15.162928
      vertex 67.368805 86.426407 15.396970
      vertex 67.368805 88.426407 15.396970
    endloop
  endfacet
  facet normal -0.985616 0.000000 0.169001
    outer loop
      vertex 67.328674 86.426407 15.162928
      vertex 67.368805 86.426407 15.396970
      vertex 67.328674 88.426407 15.162928
    endloop
  endfacet
  facet normal -0.999099 0.000000 0.042437
    outer loop
      vertex 67.323631 88.426407 15.044200
      vertex 67.328674 86.426407 15.162928
      vertex 67.328674 88.426407 15.162928
    endloop
  endfacet
  facet normal -0.999997 -0.002522 0.000000
    outer loop
      vertex 67.328674 86.426407 14.925471
      vertex 67.328674 86.426407 15.162928
      vertex 67.323631 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 67.323631 88.426407 15.044200
      vertex 67.328674 88.426407 15.162928
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 67.328674 88.426407 14.925471
      vertex 67.323631 88.426407 15.044200
      vertex 68.723633 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 67.563721 88.426407 14.260235
      vertex 67.447914 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 67.368805 88.426407 14.691431
      vertex 68.723633 88.426407 15.044200
      vertex 67.447914 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 67.328674 88.426407 14.925471
      vertex 68.723633 88.426407 15.044200
      vertex 67.368805 88.426407 14.691431
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 68.093346 88.426407 13.794104
      vertex 67.891151 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 67.712898 88.426407 14.075486
      vertex 68.723633 88.426407 15.044200
      vertex 67.891151 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 67.563721 88.426407 14.260235
      vertex 68.723633 88.426407 15.044200
      vertex 67.712898 88.426407 14.075486
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 68.783051 88.426407 13.645462
      vertex 68.545807 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 68.313683 88.426407 13.705566
      vertex 68.723633 88.426407 15.044200
      vertex 68.545807 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 68.093346 88.426407 13.794104
      vertex 68.723633 88.426407 15.044200
      vertex 68.313683 88.426407 13.705566
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 69.457664 88.426407 13.852060
      vertex 69.245636 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 69.018585 88.426407 13.675623
      vertex 68.723633 88.426407 15.044200
      vertex 69.245636 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 68.783051 88.426407 13.645462
      vertex 68.723633 88.426407 15.044200
      vertex 69.018585 88.426407 13.675623
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 69.945854 88.426407 14.361427
      vertex 69.812881 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 69.648582 88.426407 13.993258
      vertex 68.723633 88.426407 15.044200
      vertex 69.812881 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 69.457664 88.426407 13.852060
      vertex 68.723633 88.426407 15.044200
      vertex 69.648582 88.426407 13.993258
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 70.123634 88.426407 15.044200
      vertex 70.103493 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 70.043663 88.426407 14.577805
      vertex 68.723633 88.426407 15.044200
      vertex 70.103493 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 69.945854 88.426407 14.361427
      vertex 68.723633 88.426407 15.044200
      vertex 70.043663 88.426407 14.577805
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 69.945854 88.426407 15.726973
      vertex 70.043663 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 70.103493 88.426407 15.280802
      vertex 68.723633 88.426407 15.044200
      vertex 70.043663 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 70.123634 88.426407 15.044200
      vertex 68.723633 88.426407 15.044200
      vertex 70.103493 88.426407 15.280802
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 69.457664 88.426407 16.236341
      vertex 69.648582 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.812881 88.426407 15.923709
      vertex 68.723633 88.426407 15.044200
      vertex 69.648582 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.945854 88.426407 15.726973
      vertex 68.723633 88.426407 15.044200
      vertex 69.812881 88.426407 15.923709
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 68.783051 88.426407 16.442940
      vertex 69.018585 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.245636 88.426407 16.343245
      vertex 68.723633 88.426407 15.044200
      vertex 69.018585 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 69.457664 88.426407 16.236341
      vertex 68.723633 88.426407 15.044200
      vertex 69.245636 88.426407 16.343245
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 68.093346 88.426407 16.294296
      vertex 68.313683 88.426407 16.382833
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.545807 88.426407 16.432861
      vertex 68.723633 88.426407 15.044200
      vertex 68.313683 88.426407 16.382833
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.783051 88.426407 16.442940
      vertex 68.723633 88.426407 15.044200
      vertex 68.545807 88.426407 16.432861
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 67.563721 88.426407 15.828164
      vertex 67.712898 88.426407 16.012915
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 67.891151 88.426407 16.169796
      vertex 68.723633 88.426407 15.044200
      vertex 67.712898 88.426407 16.012915
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.093346 88.426407 16.294296
      vertex 68.723633 88.426407 15.044200
      vertex 67.891151 88.426407 16.169796
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 68.723633 88.426407 15.044200
      vertex 67.328674 88.426407 15.162928
      vertex 67.368805 88.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 67.447914 88.426407 15.620861
      vertex 68.723633 88.426407 15.044200
      vertex 67.368805 88.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 67.563721 88.426407 15.828164
      vertex 68.723633 88.426407 15.044200
      vertex 67.447914 88.426407 15.620861
    endloop
  endfacet
  facet normal -0.999099 0.000000 -0.042437
    outer loop
      vertex 90.582710 86.426407 14.925471
      vertex 90.577667 88.426407 15.044200
      vertex 90.582710 88.426407 14.925471
    endloop
  endfacet
  facet normal -0.985616 0.000000 -0.169002
    outer loop
      vertex 90.622841 88.426407 14.691431
      vertex 90.582710 86.426407 14.925471
      vertex 90.582710 88.426407 14.925471
    endloop
  endfacet
  facet normal -0.985616 0.000000 -0.169002
    outer loop
      vertex 90.622841 86.426407 14.691431
      vertex 90.582710 86.426407 14.925471
      vertex 90.622841 88.426407 14.691431
    endloop
  endfacet
  facet normal -0.942874 0.000000 -0.333150
    outer loop
      vertex 90.701950 88.426407 14.467538
      vertex 90.622841 86.426407 14.691431
      vertex 90.622841 88.426407 14.691431
    endloop
  endfacet
  facet normal -0.942874 0.000000 -0.333150
    outer loop
      vertex 90.701950 86.426407 14.467538
      vertex 90.622841 86.426407 14.691431
      vertex 90.701950 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.873014 0.000000 -0.487695
    outer loop
      vertex 90.817757 88.426407 14.260235
      vertex 90.701950 86.426407 14.467538
      vertex 90.701950 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.873014 0.000000 -0.487695
    outer loop
      vertex 90.817757 86.426407 14.260235
      vertex 90.701950 86.426407 14.467538
      vertex 90.817757 88.426407 14.260235
    endloop
  endfacet
  facet normal -0.778029 0.000000 -0.628229
    outer loop
      vertex 90.966934 88.426407 14.075486
      vertex 90.817757 86.426407 14.260235
      vertex 90.817757 88.426407 14.260235
    endloop
  endfacet
  facet normal -0.778029 0.000000 -0.628229
    outer loop
      vertex 90.966934 86.426407 14.075486
      vertex 90.817757 86.426407 14.260235
      vertex 90.966934 88.426407 14.075486
    endloop
  endfacet
  facet normal -0.660674 0.000000 -0.750673
    outer loop
      vertex 91.145187 88.426407 13.918604
      vertex 90.966934 86.426407 14.075486
      vertex 90.966934 88.426407 14.075486
    endloop
  endfacet
  facet normal -0.660674 0.000000 -0.750673
    outer loop
      vertex 91.145187 86.426407 13.918604
      vertex 90.966934 86.426407 14.075486
      vertex 91.145187 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.524306 0.000000 -0.851530
    outer loop
      vertex 91.347389 88.426407 13.794104
      vertex 91.145187 86.426407 13.918604
      vertex 91.145187 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.524306 0.000000 -0.851530
    outer loop
      vertex 91.347389 86.426407 13.794104
      vertex 91.145187 86.426407 13.918604
      vertex 91.347389 88.426407 13.794104
    endloop
  endfacet
  facet normal -0.372862 0.000000 -0.927887
    outer loop
      vertex 91.567719 88.426407 13.705566
      vertex 91.347389 86.426407 13.794104
      vertex 91.347389 88.426407 13.794104
    endloop
  endfacet
  facet normal -0.372862 0.000000 -0.927887
    outer loop
      vertex 91.567719 86.426407 13.705566
      vertex 91.347389 86.426407 13.794104
      vertex 91.567719 88.426407 13.705566
    endloop
  endfacet
  facet normal -0.210674 0.000000 -0.977556
    outer loop
      vertex 91.799850 88.426407 13.655540
      vertex 91.567719 86.426407 13.705566
      vertex 91.567719 88.426407 13.705566
    endloop
  endfacet
  facet normal -0.210674 0.000000 -0.977556
    outer loop
      vertex 91.799850 86.426407 13.655540
      vertex 91.567719 86.426407 13.705566
      vertex 91.799850 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.042440 0.000000 -0.999099
    outer loop
      vertex 92.037086 88.426407 13.645462
      vertex 91.799850 86.426407 13.655540
      vertex 91.799850 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.042440 0.000000 -0.999099
    outer loop
      vertex 92.037086 86.426407 13.645462
      vertex 91.799850 86.426407 13.655540
      vertex 92.037086 88.426407 13.645462
    endloop
  endfacet
  facet normal 0.127016 0.000000 -0.991901
    outer loop
      vertex 92.272621 88.426407 13.675623
      vertex 92.037086 86.426407 13.645462
      vertex 92.037086 88.426407 13.645462
    endloop
  endfacet
  facet normal 0.127016 0.000000 -0.991901
    outer loop
      vertex 92.272621 86.426407 13.675623
      vertex 92.037086 86.426407 13.645462
      vertex 92.272621 88.426407 13.675623
    endloop
  endfacet
  facet normal 0.292818 0.000000 -0.956168
    outer loop
      vertex 92.499672 88.426407 13.745155
      vertex 92.272621 86.426407 13.675623
      vertex 92.272621 88.426407 13.675623
    endloop
  endfacet
  facet normal 0.292818 0.000000 -0.956168
    outer loop
      vertex 92.499672 86.426407 13.745155
      vertex 92.272621 86.426407 13.675623
      vertex 92.499672 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.450212 0.000000 -0.892922
    outer loop
      vertex 92.711700 88.426407 13.852060
      vertex 92.499672 86.426407 13.745155
      vertex 92.499672 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.450212 0.000000 -0.892922
    outer loop
      vertex 92.711700 86.426407 13.852060
      vertex 92.499672 86.426407 13.745155
      vertex 92.711700 88.426407 13.852060
    endloop
  endfacet
  facet normal 0.594622 0.000000 -0.804005
    outer loop
      vertex 92.902618 88.426407 13.993258
      vertex 92.711700 86.426407 13.852060
      vertex 92.711700 88.426407 13.852060
    endloop
  endfacet
  facet normal 0.594622 0.000000 -0.804005
    outer loop
      vertex 92.902618 86.426407 13.993258
      vertex 92.711700 86.426407 13.852060
      vertex 92.902618 88.426407 13.993258
    endloop
  endfacet
  facet normal 0.721954 0.000000 -0.691941
    outer loop
      vertex 93.066925 88.426407 14.164692
      vertex 92.902618 86.426407 13.993258
      vertex 92.902618 88.426407 13.993258
    endloop
  endfacet
  facet normal 0.721954 0.000000 -0.691941
    outer loop
      vertex 93.066925 86.426407 14.164692
      vertex 92.902618 86.426407 13.993258
      vertex 93.066925 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.828519 0.000000 -0.559961
    outer loop
      vertex 93.199890 88.426407 14.361427
      vertex 93.066925 86.426407 14.164692
      vertex 93.066925 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.828519 0.000000 -0.559961
    outer loop
      vertex 93.199890 86.426407 14.361427
      vertex 93.066925 86.426407 14.164692
      vertex 93.199890 88.426407 14.361427
    endloop
  endfacet
  facet normal 0.911228 0.000000 -0.411902
    outer loop
      vertex 93.297699 88.426407 14.577805
      vertex 93.199890 86.426407 14.361427
      vertex 93.199890 88.426407 14.361427
    endloop
  endfacet
  facet normal 0.911228 0.000000 -0.411902
    outer loop
      vertex 93.297699 86.426407 14.577805
      vertex 93.199890 86.426407 14.361427
      vertex 93.297699 88.426407 14.577805
    endloop
  endfacet
  facet normal 0.967729 0.000000 -0.251992
    outer loop
      vertex 93.357536 88.426407 14.807599
      vertex 93.297699 86.426407 14.577805
      vertex 93.297699 88.426407 14.577805
    endloop
  endfacet
  facet normal 0.967729 0.000000 -0.251992
    outer loop
      vertex 93.357536 86.426407 14.807599
      vertex 93.297699 86.426407 14.577805
      vertex 93.357536 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.996399 0.000000 -0.084790
    outer loop
      vertex 93.377670 88.426407 15.044200
      vertex 93.357536 86.426407 14.807599
      vertex 93.357536 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.996399 0.000000 -0.084790
    outer loop
      vertex 93.377670 86.426407 15.044200
      vertex 93.357536 86.426407 14.807599
      vertex 93.377670 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.996399 0.000000 0.084790
    outer loop
      vertex 93.357536 88.426407 15.280802
      vertex 93.377670 86.426407 15.044200
      vertex 93.377670 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.996399 -0.000000 0.084790
    outer loop
      vertex 93.357536 86.426407 15.280802
      vertex 93.377670 86.426407 15.044200
      vertex 93.357536 88.426407 15.280802
    endloop
  endfacet
  facet normal 0.967729 0.000000 0.251992
    outer loop
      vertex 93.297699 88.426407 15.510596
      vertex 93.357536 86.426407 15.280802
      vertex 93.357536 88.426407 15.280802
    endloop
  endfacet
  facet normal 0.967729 -0.000000 0.251992
    outer loop
      vertex 93.297699 86.426407 15.510596
      vertex 93.357536 86.426407 15.280802
      vertex 93.297699 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.911228 0.000000 0.411903
    outer loop
      vertex 93.199890 88.426407 15.726973
      vertex 93.297699 86.426407 15.510596
      vertex 93.297699 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.911228 -0.000000 0.411903
    outer loop
      vertex 93.199890 86.426407 15.726973
      vertex 93.297699 86.426407 15.510596
      vertex 93.199890 88.426407 15.726973
    endloop
  endfacet
  facet normal 0.828520 0.000000 0.559959
    outer loop
      vertex 93.066925 88.426407 15.923709
      vertex 93.199890 86.426407 15.726973
      vertex 93.199890 88.426407 15.726973
    endloop
  endfacet
  facet normal 0.828520 -0.000000 0.559959
    outer loop
      vertex 93.066925 86.426407 15.923709
      vertex 93.199890 86.426407 15.726973
      vertex 93.066925 88.426407 15.923709
    endloop
  endfacet
  facet normal 0.721950 0.000000 0.691945
    outer loop
      vertex 92.902618 88.426407 16.095140
      vertex 93.066925 86.426407 15.923709
      vertex 93.066925 88.426407 15.923709
    endloop
  endfacet
  facet normal 0.721950 -0.000000 0.691945
    outer loop
      vertex 92.902618 86.426407 16.095140
      vertex 93.066925 86.426407 15.923709
      vertex 92.902618 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.594630 0.000000 0.803999
    outer loop
      vertex 92.711700 88.426407 16.236341
      vertex 92.902618 86.426407 16.095140
      vertex 92.902618 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.594630 -0.000000 0.803999
    outer loop
      vertex 92.711700 86.426407 16.236341
      vertex 92.902618 86.426407 16.095140
      vertex 92.711700 88.426407 16.236341
    endloop
  endfacet
  facet normal 0.450206 0.000000 0.892925
    outer loop
      vertex 92.499672 88.426407 16.343245
      vertex 92.711700 86.426407 16.236341
      vertex 92.711700 88.426407 16.236341
    endloop
  endfacet
  facet normal 0.450206 -0.000000 0.892925
    outer loop
      vertex 92.499672 86.426407 16.343245
      vertex 92.711700 86.426407 16.236341
      vertex 92.499672 88.426407 16.343245
    endloop
  endfacet
  facet normal 0.292818 0.000000 0.956168
    outer loop
      vertex 92.272621 88.426407 16.412777
      vertex 92.499672 86.426407 16.343245
      vertex 92.499672 88.426407 16.343245
    endloop
  endfacet
  facet normal 0.292818 -0.000000 0.956168
    outer loop
      vertex 92.272621 86.426407 16.412777
      vertex 92.499672 86.426407 16.343245
      vertex 92.272621 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.127024 0.000000 0.991900
    outer loop
      vertex 92.037086 88.426407 16.442940
      vertex 92.272621 86.426407 16.412777
      vertex 92.272621 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.127024 -0.000000 0.991900
    outer loop
      vertex 92.037086 86.426407 16.442940
      vertex 92.272621 86.426407 16.412777
      vertex 92.037086 88.426407 16.442940
    endloop
  endfacet
  facet normal -0.042444 0.000000 0.999099
    outer loop
      vertex 91.799850 88.426407 16.432861
      vertex 92.037086 86.426407 16.442940
      vertex 92.037086 88.426407 16.442940
    endloop
  endfacet
  facet normal -0.042444 0.000000 0.999099
    outer loop
      vertex 91.799850 86.426407 16.432861
      vertex 92.037086 86.426407 16.442940
      vertex 91.799850 88.426407 16.432861
    endloop
  endfacet
  facet normal -0.210678 0.000000 0.977556
    outer loop
      vertex 91.567719 88.426407 16.382833
      vertex 91.799850 86.426407 16.432861
      vertex 91.799850 88.426407 16.432861
    endloop
  endfacet
  facet normal -0.210678 0.000000 0.977556
    outer loop
      vertex 91.567719 86.426407 16.382833
      vertex 91.799850 86.426407 16.432861
      vertex 91.567719 88.426407 16.382833
    endloop
  endfacet
  facet normal -0.372862 0.000000 0.927887
    outer loop
      vertex 91.347389 88.426407 16.294296
      vertex 91.567719 86.426407 16.382833
      vertex 91.567719 88.426407 16.382833
    endloop
  endfacet
  facet normal -0.372862 0.000000 0.927887
    outer loop
      vertex 91.347389 86.426407 16.294296
      vertex 91.567719 86.426407 16.382833
      vertex 91.347389 88.426407 16.294296
    endloop
  endfacet
  facet normal -0.524306 0.000000 0.851530
    outer loop
      vertex 91.145187 88.426407 16.169796
      vertex 91.347389 86.426407 16.294296
      vertex 91.347389 88.426407 16.294296
    endloop
  endfacet
  facet normal -0.524306 0.000000 0.851530
    outer loop
      vertex 91.145187 86.426407 16.169796
      vertex 91.347389 86.426407 16.294296
      vertex 91.145187 88.426407 16.169796
    endloop
  endfacet
  facet normal -0.660672 0.000000 0.750675
    outer loop
      vertex 90.966934 88.426407 16.012915
      vertex 91.145187 86.426407 16.169796
      vertex 91.145187 88.426407 16.169796
    endloop
  endfacet
  facet normal -0.660672 0.000000 0.750675
    outer loop
      vertex 90.966934 86.426407 16.012915
      vertex 91.145187 86.426407 16.169796
      vertex 90.966934 88.426407 16.012915
    endloop
  endfacet
  facet normal -0.778032 0.000000 0.628225
    outer loop
      vertex 90.817757 88.426407 15.828164
      vertex 90.966934 86.426407 16.012915
      vertex 90.966934 88.426407 16.012915
    endloop
  endfacet
  facet normal -0.778032 0.000000 0.628225
    outer loop
      vertex 90.817757 86.426407 15.828164
      vertex 90.966934 86.426407 16.012915
      vertex 90.817757 88.426407 15.828164
    endloop
  endfacet
  facet normal -0.873014 0.000000 0.487695
    outer loop
      vertex 90.701950 88.426407 15.620861
      vertex 90.817757 86.426407 15.828164
      vertex 90.817757 88.426407 15.828164
    endloop
  endfacet
  facet normal -0.873014 0.000000 0.487695
    outer loop
      vertex 90.701950 86.426407 15.620861
      vertex 90.817757 86.426407 15.828164
      vertex 90.701950 88.426407 15.620861
    endloop
  endfacet
  facet normal -0.942873 0.000000 0.333152
    outer loop
      vertex 90.622841 88.426407 15.396970
      vertex 90.701950 86.426407 15.620861
      vertex 90.701950 88.426407 15.620861
    endloop
  endfacet
  facet normal -0.942873 0.000000 0.333152
    outer loop
      vertex 90.622841 86.426407 15.396970
      vertex 90.701950 86.426407 15.620861
      vertex 90.622841 88.426407 15.396970
    endloop
  endfacet
  facet normal -0.985616 0.000000 0.169001
    outer loop
      vertex 90.582710 88.426407 15.162928
      vertex 90.622841 86.426407 15.396970
      vertex 90.622841 88.426407 15.396970
    endloop
  endfacet
  facet normal -0.985616 0.000000 0.169001
    outer loop
      vertex 90.582710 86.426407 15.162928
      vertex 90.622841 86.426407 15.396970
      vertex 90.582710 88.426407 15.162928
    endloop
  endfacet
  facet normal -0.999099 0.000000 0.042437
    outer loop
      vertex 90.577667 88.426407 15.044200
      vertex 90.582710 86.426407 15.162928
      vertex 90.582710 88.426407 15.162928
    endloop
  endfacet
  facet normal -0.999997 -0.002522 0.000000
    outer loop
      vertex 90.582710 86.426407 14.925471
      vertex 90.582710 86.426407 15.162928
      vertex 90.577667 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 90.577667 88.426407 15.044200
      vertex 90.582710 88.426407 15.162928
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 90.582710 88.426407 14.925471
      vertex 90.577667 88.426407 15.044200
      vertex 91.977669 88.426407 15.044200
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 90.817757 88.426407 14.260235
      vertex 90.701950 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 90.622841 88.426407 14.691431
      vertex 91.977669 88.426407 15.044200
      vertex 90.701950 88.426407 14.467538
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 90.582710 88.426407 14.925471
      vertex 91.977669 88.426407 15.044200
      vertex 90.622841 88.426407 14.691431
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 91.347389 88.426407 13.794104
      vertex 91.145187 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 90.966934 88.426407 14.075486
      vertex 91.977669 88.426407 15.044200
      vertex 91.145187 88.426407 13.918604
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 90.817757 88.426407 14.260235
      vertex 91.977669 88.426407 15.044200
      vertex 90.966934 88.426407 14.075486
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 92.037086 88.426407 13.645462
      vertex 91.799850 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 91.567719 88.426407 13.705566
      vertex 91.977669 88.426407 15.044200
      vertex 91.799850 88.426407 13.655540
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 91.347389 88.426407 13.794104
      vertex 91.977669 88.426407 15.044200
      vertex 91.567719 88.426407 13.705566
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 92.711700 88.426407 13.852060
      vertex 92.499672 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 92.272621 88.426407 13.675623
      vertex 91.977669 88.426407 15.044200
      vertex 92.499672 88.426407 13.745155
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 92.037086 88.426407 13.645462
      vertex 91.977669 88.426407 15.044200
      vertex 92.272621 88.426407 13.675623
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 93.199890 88.426407 14.361427
      vertex 93.066925 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 92.902618 88.426407 13.993258
      vertex 91.977669 88.426407 15.044200
      vertex 93.066925 88.426407 14.164692
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 92.711700 88.426407 13.852060
      vertex 91.977669 88.426407 15.044200
      vertex 92.902618 88.426407 13.993258
    endloop
  endfacet
  facet normal -0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 93.377670 88.426407 15.044200
      vertex 93.357536 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 93.297699 88.426407 14.577805
      vertex 91.977669 88.426407 15.044200
      vertex 93.357536 88.426407 14.807599
    endloop
  endfacet
  facet normal 0.000000 1.000000 -0.000000
    outer loop
      vertex 93.199890 88.426407 14.361427
      vertex 91.977669 88.426407 15.044200
      vertex 93.297699 88.426407 14.577805
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 93.199890 88.426407 15.726973
      vertex 93.297699 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.357536 88.426407 15.280802
      vertex 91.977669 88.426407 15.044200
      vertex 93.297699 88.426407 15.510596
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.377670 88.426407 15.044200
      vertex 91.977669 88.426407 15.044200
      vertex 93.357536 88.426407 15.280802
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 92.711700 88.426407 16.236341
      vertex 92.902618 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.066925 88.426407 15.923709
      vertex 91.977669 88.426407 15.044200
      vertex 92.902618 88.426407 16.095140
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 93.199890 88.426407 15.726973
      vertex 91.977669 88.426407 15.044200
      vertex 93.066925 88.426407 15.923709
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 92.037086 88.426407 16.442940
      vertex 92.272621 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 92.499672 88.426407 16.343245
      vertex 91.977669 88.426407 15.044200
      vertex 92.272621 88.426407 16.412777
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 92.711700 88.426407 16.236341
      vertex 91.977669 88.426407 15.044200
      vertex 92.499672 88.426407 16.343245
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 91.347389 88.426407 16.294296
      vertex 91.567719 88.426407 16.382833
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.799850 88.426407 16.432861
      vertex 91.977669 88.426407 15.044200
      vertex 91.567719 88.426407 16.382833
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 92.037086 88.426407 16.442940
      vertex 91.977669 88.426407 15.044200
      vertex 91.799850 88.426407 16.432861
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 90.817757 88.426407 15.828164
      vertex 90.966934 88.426407 16.012915
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.145187 88.426407 16.169796
      vertex 91.977669 88.426407 15.044200
      vertex 90.966934 88.426407 16.012915
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.347389 88.426407 16.294296
      vertex 91.977669 88.426407 15.044200
      vertex 91.145187 88.426407 16.169796
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 91.977669 88.426407 15.044200
      vertex 90.582710 88.426407 15.162928
      vertex 90.622841 88.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.701950 88.426407 15.620861
      vertex 91.977669 88.426407 15.044200
      vertex 90.622841 88.426407 15.396970
    endloop
  endfacet
  facet normal 0.000000 1.000000 0.000000
    outer loop
      vertex 90.817757 88.426407 15.828164
      vertex 91.977669 88.426407 15.044200
      vertex 90.701950 88.426407 15.620861
    endloop
  endfacet
  facet normal 0.999100 0.000000 0.042424
    outer loop
      vertex 70.010086 32.426407 13.780954
      vertex 70.004684 30.426405 13.908163
      vertex 70.010086 30.426405 13.780954
    endloop
  endfacet
  facet normal 0.999100 0.000000 -0.042424
    outer loop
      vertex 70.004684 32.426407 13.653746
      vertex 70.010086 32.426407 13.780954
      vertex 70.010086 30.426405 13.780954
    endloop
  endfacet
  facet normal 0.999100 0.000000 -0.042424
    outer loop
      vertex 70.004684 32.426407 13.653746
      vertex 70.010086 30.426405 13.780954
      vertex 70.004684 30.426405 13.653746
    endloop
  endfacet
  facet normal 0.985614 0.000000 -0.169010
    outer loop
      vertex 69.961685 30.426405 13.402987
      vertex 70.004684 32.426407 13.653746
      vertex 70.004684 30.426405 13.653746
    endloop
  endfacet
  facet normal 0.985614 0.000000 -0.169010
    outer loop
      vertex 69.961685 32.426407 13.402987
      vertex 70.004684 32.426407 13.653746
      vertex 69.961685 30.426405 13.402987
    endloop
  endfacet
  facet normal 0.942879 0.000000 -0.333134
    outer loop
      vertex 69.876930 30.426405 13.163103
      vertex 69.961685 32.426407 13.402987
      vertex 69.961685 30.426405 13.402987
    endloop
  endfacet
  facet normal 0.942879 0.000000 -0.333134
    outer loop
      vertex 69.876930 32.426407 13.163103
      vertex 69.961685 32.426407 13.402987
      vertex 69.876930 30.426405 13.163103
    endloop
  endfacet
  facet normal 0.873017 0.000000 -0.487690
    outer loop
      vertex 69.752853 30.426405 12.940992
      vertex 69.876930 32.426407 13.163103
      vertex 69.876930 30.426405 13.163103
    endloop
  endfacet
  facet normal 0.873017 0.000000 -0.487690
    outer loop
      vertex 69.752853 32.426407 12.940992
      vertex 69.876930 32.426407 13.163103
      vertex 69.752853 30.426405 12.940992
    endloop
  endfacet
  facet normal 0.778024 0.000000 -0.628234
    outer loop
      vertex 69.593018 30.426405 12.743047
      vertex 69.752853 32.426407 12.940992
      vertex 69.752853 30.426405 12.940992
    endloop
  endfacet
  facet normal 0.778024 0.000000 -0.628234
    outer loop
      vertex 69.593018 32.426407 12.743047
      vertex 69.752853 32.426407 12.940992
      vertex 69.593018 30.426405 12.743047
    endloop
  endfacet
  facet normal 0.660686 0.000000 -0.750662
    outer loop
      vertex 69.402039 30.426405 12.574959
      vertex 69.593018 32.426407 12.743047
      vertex 69.593018 30.426405 12.743047
    endloop
  endfacet
  facet normal 0.660686 0.000000 -0.750662
    outer loop
      vertex 69.402039 32.426407 12.574959
      vertex 69.593018 32.426407 12.743047
      vertex 69.402039 30.426405 12.574959
    endloop
  endfacet
  facet normal 0.524308 0.000000 -0.851529
    outer loop
      vertex 69.185394 30.426405 12.441566
      vertex 69.402039 32.426407 12.574959
      vertex 69.402039 30.426405 12.574959
    endloop
  endfacet
  facet normal 0.524308 0.000000 -0.851529
    outer loop
      vertex 69.185394 32.426407 12.441566
      vertex 69.402039 32.426407 12.574959
      vertex 69.185394 30.426405 12.441566
    endloop
  endfacet
  facet normal 0.372849 0.000000 -0.927892
    outer loop
      vertex 68.949318 30.426405 12.346704
      vertex 69.185394 32.426407 12.441566
      vertex 69.185394 30.426405 12.441566
    endloop
  endfacet
  facet normal 0.372849 0.000000 -0.927892
    outer loop
      vertex 68.949318 32.426407 12.346704
      vertex 69.185394 32.426407 12.441566
      vertex 68.949318 30.426405 12.346704
    endloop
  endfacet
  facet normal 0.210682 0.000000 -0.977555
    outer loop
      vertex 68.700615 30.426405 12.293104
      vertex 68.949318 32.426407 12.346704
      vertex 68.949318 30.426405 12.346704
    endloop
  endfacet
  facet normal 0.210682 0.000000 -0.977555
    outer loop
      vertex 68.700615 32.426407 12.293104
      vertex 68.949318 32.426407 12.346704
      vertex 68.700615 30.426405 12.293104
    endloop
  endfacet
  facet normal 0.042440 0.000000 -0.999099
    outer loop
      vertex 68.446426 30.426405 12.282307
      vertex 68.700615 32.426407 12.293104
      vertex 68.700615 30.426405 12.293104
    endloop
  endfacet
  facet normal 0.042440 0.000000 -0.999099
    outer loop
      vertex 68.446426 32.426407 12.282307
      vertex 68.700615 32.426407 12.293104
      vertex 68.446426 30.426405 12.282307
    endloop
  endfacet
  facet normal -0.127013 0.000000 -0.991901
    outer loop
      vertex 68.194069 30.426405 12.314621
      vertex 68.446426 32.426407 12.282307
      vertex 68.446426 30.426405 12.282307
    endloop
  endfacet
  facet normal -0.127013 -0.000000 -0.991901
    outer loop
      vertex 68.194069 32.426407 12.314621
      vertex 68.446426 32.426407 12.282307
      vertex 68.194069 30.426405 12.314621
    endloop
  endfacet
  facet normal -0.292820 0.000000 -0.956168
    outer loop
      vertex 67.950798 30.426405 12.389121
      vertex 68.194069 32.426407 12.314621
      vertex 68.194069 30.426405 12.314621
    endloop
  endfacet
  facet normal -0.292820 -0.000000 -0.956168
    outer loop
      vertex 67.950798 32.426407 12.389121
      vertex 68.194069 32.426407 12.314621
      vertex 67.950798 30.426405 12.389121
    endloop
  endfacet
  facet normal -0.450207 0.000000 -0.892924
    outer loop
      vertex 67.723625 30.426405 12.503660
      vertex 67.950798 32.426407 12.389121
      vertex 67.950798 30.426405 12.389121
    endloop
  endfacet
  facet normal -0.450207 -0.000000 -0.892924
    outer loop
      vertex 67.723625 32.426407 12.503660
      vertex 67.950798 32.426407 12.389121
      vertex 67.723625 30.426405 12.503660
    endloop
  endfacet
  facet normal -0.594634 0.000000 -0.803996
    outer loop
      vertex 67.519073 30.426405 12.654946
      vertex 67.723625 32.426407 12.503660
      vertex 67.723625 30.426405 12.503660
    endloop
  endfacet
  facet normal -0.594634 -0.000000 -0.803996
    outer loop
      vertex 67.519073 32.426407 12.654946
      vertex 67.723625 32.426407 12.503660
      vertex 67.519073 30.426405 12.654946
    endloop
  endfacet
  facet normal -0.721956 0.000000 -0.691939
    outer loop
      vertex 67.343033 30.426405 12.838624
      vertex 67.519073 32.426407 12.654946
      vertex 67.519073 30.426405 12.654946
    endloop
  endfacet
  facet normal -0.721956 -0.000000 -0.691939
    outer loop
      vertex 67.343033 32.426407 12.838624
      vertex 67.519073 32.426407 12.654946
      vertex 67.343033 30.426405 12.838624
    endloop
  endfacet
  facet normal -0.828503 0.000000 -0.559985
    outer loop
      vertex 67.200562 30.426405 13.049412
      vertex 67.343033 32.426407 12.838624
      vertex 67.343033 30.426405 12.838624
    endloop
  endfacet
  facet normal -0.828503 -0.000000 -0.559985
    outer loop
      vertex 67.200562 32.426407 13.049412
      vertex 67.343033 32.426407 12.838624
      vertex 67.200562 30.426405 13.049412
    endloop
  endfacet
  facet normal -0.911237 0.000000 -0.411883
    outer loop
      vertex 67.095772 30.426405 13.281245
      vertex 67.200562 32.426407 13.049412
      vertex 67.200562 30.426405 13.049412
    endloop
  endfacet
  facet normal -0.911237 -0.000000 -0.411883
    outer loop
      vertex 67.095772 32.426407 13.281245
      vertex 67.200562 32.426407 13.049412
      vertex 67.095772 30.426405 13.281245
    endloop
  endfacet
  facet normal -0.967738 0.000000 -0.251959
    outer loop
      vertex 67.031670 30.426405 13.527452
      vertex 67.095772 32.426407 13.281245
      vertex 67.095772 30.426405 13.281245
    endloop
  endfacet
  facet normal -0.967738 -0.000000 -0.251959
    outer loop
      vertex 67.031670 32.426407 13.527452
      vertex 67.095772 32.426407 13.281245
      vertex 67.031670 30.426405 13.527452
    endloop
  endfacet
  facet normal -0.996395 0.000000 -0.084835
    outer loop
      vertex 67.010086 30.426405 13.780954
      vertex 67.031670 32.426407 13.527452
      vertex 67.031670 30.426405 13.527452
    endloop
  endfacet
  facet normal -0.996395 -0.000000 -0.084835
    outer loop
      vertex 67.010086 32.426407 13.780954
      vertex 67.031670 32.426407 13.527452
      vertex 67.010086 30.426405 13.780954
    endloop
  endfacet
  facet normal -0.996395 0.000000 0.084835
    outer loop
      vertex 67.031670 30.426405 14.034455
      vertex 67.010086 32.426407 13.780954
      vertex 67.010086 30.426405 13.780954
    endloop
  endfacet
  facet normal -0.996395 0.000000 0.084835
    outer loop
      vertex 67.031670 32.426407 14.034455
      vertex 67.010086 32.426407 13.780954
      vertex 67.031670 30.426405 14.034455
    endloop
  endfacet
  facet normal -0.967738 0.000000 0.251958
    outer loop
      vertex 67.095772 30.426405 14.280663
      vertex 67.031670 32.426407 14.034455
      vertex 67.031670 30.426405 14.034455
    endloop
  endfacet
  facet normal -0.967738 0.000000 0.251958
    outer loop
      vertex 67.095772 32.426407 14.280663
      vertex 67.031670 32.426407 14.034455
      vertex 67.095772 30.426405 14.280663
    endloop
  endfacet
  facet normal -0.911237 0.000000 0.411883
    outer loop
      vertex 67.200562 30.426405 14.512497
      vertex 67.095772 32.426407 14.280663
      vertex 67.095772 30.426405 14.280663
    endloop
  endfacet
  facet normal -0.911237 0.000000 0.411883
    outer loop
      vertex 67.200562 32.426407 14.512497
      vertex 67.095772 32.426407 14.280663
      vertex 67.200562 30.426405 14.512497
    endloop
  endfacet
  facet normal -0.828502 0.000000 0.559986
    outer loop
      vertex 67.343033 30.426405 14.723284
      vertex 67.200562 32.426407 14.512497
      vertex 67.200562 30.426405 14.512497
    endloop
  endfacet
  facet normal -0.828502 0.000000 0.559986
    outer loop
      vertex 67.343033 32.426407 14.723284
      vertex 67.200562 32.426407 14.512497
      vertex 67.343033 30.426405 14.723284
    endloop
  endfacet
  facet normal -0.721960 0.000000 0.691935
    outer loop
      vertex 67.519073 30.426405 14.906963
      vertex 67.343033 32.426407 14.723284
      vertex 67.343033 30.426405 14.723284
    endloop
  endfacet
  facet normal -0.721960 0.000000 0.691935
    outer loop
      vertex 67.519073 32.426407 14.906963
      vertex 67.343033 32.426407 14.723284
      vertex 67.519073 30.426405 14.906963
    endloop
  endfacet
  facet normal -0.594632 0.000000 0.803998
    outer loop
      vertex 67.723625 30.426405 15.058249
      vertex 67.519073 32.426407 14.906963
      vertex 67.519073 30.426405 14.906963
    endloop
  endfacet
  facet normal -0.594632 0.000000 0.803998
    outer loop
      vertex 67.723625 32.426407 15.058249
      vertex 67.519073 32.426407 14.906963
      vertex 67.723625 30.426405 15.058249
    endloop
  endfacet
  facet normal -0.450207 0.000000 0.892924
    outer loop
      vertex 67.950798 30.426405 15.172788
      vertex 67.723625 32.426407 15.058249
      vertex 67.723625 30.426405 15.058249
    endloop
  endfacet
  facet normal -0.450207 0.000000 0.892924
    outer loop
      vertex 67.950798 32.426407 15.172788
      vertex 67.723625 32.426407 15.058249
      vertex 67.950798 30.426405 15.172788
    endloop
  endfacet
  facet normal -0.292817 0.000000 0.956169
    outer loop
      vertex 68.194069 30.426405 15.247287
      vertex 67.950798 32.426407 15.172788
      vertex 67.950798 30.426405 15.172788
    endloop
  endfacet
  facet normal -0.292817 0.000000 0.956169
    outer loop
      vertex 68.194069 32.426407 15.247287
      vertex 67.950798 32.426407 15.172788
      vertex 68.194069 30.426405 15.247287
    endloop
  endfacet
  facet normal -0.127016 0.000000 0.991901
    outer loop
      vertex 68.446426 30.426405 15.279602
      vertex 68.194069 32.426407 15.247287
      vertex 68.194069 30.426405 15.247287
    endloop
  endfacet
  facet normal -0.127016 0.000000 0.991901
    outer loop
      vertex 68.446426 32.426407 15.279602
      vertex 68.194069 32.426407 15.247287
      vertex 68.446426 30.426405 15.279602
    endloop
  endfacet
  facet normal 0.042440 0.000000 0.999099
    outer loop
      vertex 68.700615 30.426405 15.268805
      vertex 68.446426 32.426407 15.279602
      vertex 68.446426 30.426405 15.279602
    endloop
  endfacet
  facet normal 0.042440 0.000000 0.999099
    outer loop
      vertex 68.700615 32.426407 15.268805
      vertex 68.446426 32.426407 15.279602
      vertex 68.700615 30.426405 15.268805
    endloop
  endfacet
  facet normal 0.210678 0.000000 0.977556
    outer loop
      vertex 68.949318 30.426405 15.215205
      vertex 68.700615 32.426407 15.268805
      vertex 68.700615 30.426405 15.268805
    endloop
  endfacet
  facet normal 0.210678 0.000000 0.977556
    outer loop
      vertex 68.949318 32.426407 15.215205
      vertex 68.700615 32.426407 15.268805
      vertex 68.949318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.372852 0.000000 0.927891
    outer loop
      vertex 69.185394 30.426405 15.120343
      vertex 68.949318 32.426407 15.215205
      vertex 68.949318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.372852 0.000000 0.927891
    outer loop
      vertex 69.185394 32.426407 15.120343
      vertex 68.949318 32.426407 15.215205
      vertex 69.185394 30.426405 15.120343
    endloop
  endfacet
  facet normal 0.524308 0.000000 0.851529
    outer loop
      vertex 69.402039 30.426405 14.986950
      vertex 69.185394 32.426407 15.120343
      vertex 69.185394 30.426405 15.120343
    endloop
  endfacet
  facet normal 0.524308 0.000000 0.851529
    outer loop
      vertex 69.402039 32.426407 14.986950
      vertex 69.185394 32.426407 15.120343
      vertex 69.402039 30.426405 14.986950
    endloop
  endfacet
  facet normal 0.660684 0.000000 0.750664
    outer loop
      vertex 69.593018 30.426405 14.818863
      vertex 69.402039 32.426407 14.986950
      vertex 69.402039 30.426405 14.986950
    endloop
  endfacet
  facet normal 0.660684 0.000000 0.750664
    outer loop
      vertex 69.593018 32.426407 14.818863
      vertex 69.402039 32.426407 14.986950
      vertex 69.593018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.778024 0.000000 0.628234
    outer loop
      vertex 69.752853 30.426405 14.620917
      vertex 69.593018 32.426407 14.818863
      vertex 69.593018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.778024 0.000000 0.628234
    outer loop
      vertex 69.752853 32.426407 14.620917
      vertex 69.593018 32.426407 14.818863
      vertex 69.752853 30.426405 14.620917
    endloop
  endfacet
  facet normal 0.873018 0.000000 0.487688
    outer loop
      vertex 69.876930 30.426405 14.398806
      vertex 69.752853 32.426407 14.620917
      vertex 69.752853 30.426405 14.620917
    endloop
  endfacet
  facet normal 0.873018 0.000000 0.487688
    outer loop
      vertex 69.876930 32.426407 14.398806
      vertex 69.752853 32.426407 14.620917
      vertex 69.876930 30.426405 14.398806
    endloop
  endfacet
  facet normal 0.942879 0.000000 0.333134
    outer loop
      vertex 69.961685 30.426405 14.158921
      vertex 69.876930 32.426407 14.398806
      vertex 69.876930 30.426405 14.398806
    endloop
  endfacet
  facet normal 0.942879 0.000000 0.333134
    outer loop
      vertex 69.961685 32.426407 14.158921
      vertex 69.876930 32.426407 14.398806
      vertex 69.961685 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.985614 0.000000 0.169010
    outer loop
      vertex 70.004684 30.426405 13.908163
      vertex 69.961685 32.426407 14.158921
      vertex 69.961685 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.985614 0.000000 0.169010
    outer loop
      vertex 70.004684 32.426407 13.908163
      vertex 69.961685 32.426407 14.158921
      vertex 70.004684 30.426405 13.908163
    endloop
  endfacet
  facet normal 0.999100 0.000000 0.042424
    outer loop
      vertex 70.010086 32.426407 13.780954
      vertex 70.004684 32.426407 13.908163
      vertex 70.004684 30.426405 13.908163
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 70.010086 30.426405 13.780954
      vertex 70.004684 30.426405 13.908163
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 70.004684 30.426405 13.653746
      vertex 70.010086 30.426405 13.780954
      vertex 68.510086 30.426405 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 69.752853 30.426405 12.940992
      vertex 69.876930 30.426405 13.163103
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 69.961685 30.426405 13.402987
      vertex 68.510086 30.426405 13.780954
      vertex 69.876930 30.426405 13.163103
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 70.004684 30.426405 13.653746
      vertex 68.510086 30.426405 13.780954
      vertex 69.961685 30.426405 13.402987
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 69.185394 30.426405 12.441566
      vertex 69.402039 30.426405 12.574959
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 69.593018 30.426405 12.743047
      vertex 68.510086 30.426405 13.780954
      vertex 69.402039 30.426405 12.574959
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 69.752853 30.426405 12.940992
      vertex 68.510086 30.426405 13.780954
      vertex 69.593018 30.426405 12.743047
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 68.446426 30.426405 12.282307
      vertex 68.700615 30.426405 12.293104
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 68.949318 30.426405 12.346704
      vertex 68.510086 30.426405 13.780954
      vertex 68.700615 30.426405 12.293104
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 69.185394 30.426405 12.441566
      vertex 68.510086 30.426405 13.780954
      vertex 68.949318 30.426405 12.346704
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 67.723625 30.426405 12.503660
      vertex 67.950798 30.426405 12.389121
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.194069 30.426405 12.314621
      vertex 68.510086 30.426405 13.780954
      vertex 67.950798 30.426405 12.389121
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.446426 30.426405 12.282307
      vertex 68.510086 30.426405 13.780954
      vertex 68.194069 30.426405 12.314621
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 67.200562 30.426405 13.049412
      vertex 67.343033 30.426405 12.838624
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.519073 30.426405 12.654946
      vertex 68.510086 30.426405 13.780954
      vertex 67.343033 30.426405 12.838624
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.723625 30.426405 12.503660
      vertex 68.510086 30.426405 13.780954
      vertex 67.519073 30.426405 12.654946
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 67.010086 30.426405 13.780954
      vertex 67.031670 30.426405 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.095772 30.426405 13.281245
      vertex 68.510086 30.426405 13.780954
      vertex 67.031670 30.426405 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.200562 30.426405 13.049412
      vertex 68.510086 30.426405 13.780954
      vertex 67.095772 30.426405 13.281245
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 67.200562 30.426405 14.512497
      vertex 67.095772 30.426405 14.280663
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.031670 30.426405 14.034455
      vertex 68.510086 30.426405 13.780954
      vertex 67.095772 30.426405 14.280663
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.010086 30.426405 13.780954
      vertex 68.510086 30.426405 13.780954
      vertex 67.031670 30.426405 14.034455
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 67.723625 30.426405 15.058249
      vertex 67.519073 30.426405 14.906963
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.343033 30.426405 14.723284
      vertex 68.510086 30.426405 13.780954
      vertex 67.519073 30.426405 14.906963
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.200562 30.426405 14.512497
      vertex 68.510086 30.426405 13.780954
      vertex 67.343033 30.426405 14.723284
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 68.446426 30.426405 15.279602
      vertex 68.194069 30.426405 15.247287
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.950798 30.426405 15.172788
      vertex 68.510086 30.426405 13.780954
      vertex 68.194069 30.426405 15.247287
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 67.723625 30.426405 15.058249
      vertex 68.510086 30.426405 13.780954
      vertex 67.950798 30.426405 15.172788
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 69.185394 30.426405 15.120343
      vertex 68.949318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 68.700615 30.426405 15.268805
      vertex 68.510086 30.426405 13.780954
      vertex 68.949318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.446426 30.426405 15.279602
      vertex 68.510086 30.426405 13.780954
      vertex 68.700615 30.426405 15.268805
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 69.752853 30.426405 14.620917
      vertex 69.593018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.402039 30.426405 14.986950
      vertex 68.510086 30.426405 13.780954
      vertex 69.593018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.185394 30.426405 15.120343
      vertex 68.510086 30.426405 13.780954
      vertex 69.402039 30.426405 14.986950
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 68.510086 30.426405 13.780954
      vertex 70.004684 30.426405 13.908163
      vertex 69.961685 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.876930 30.426405 14.398806
      vertex 68.510086 30.426405 13.780954
      vertex 69.961685 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 69.752853 30.426405 14.620917
      vertex 68.510086 30.426405 13.780954
      vertex 69.876930 30.426405 14.398806
    endloop
  endfacet
  facet normal 0.999100 0.000000 0.042424
    outer loop
      vertex 88.510086 32.426407 13.780954
      vertex 88.504684 30.426405 13.908163
      vertex 88.510086 30.426405 13.780954
    endloop
  endfacet
  facet normal 0.999100 0.000000 -0.042424
    outer loop
      vertex 88.504684 32.426407 13.653746
      vertex 88.510086 32.426407 13.780954
      vertex 88.510086 30.426405 13.780954
    endloop
  endfacet
  facet normal 0.999100 0.000000 -0.042424
    outer loop
      vertex 88.504684 32.426407 13.653746
      vertex 88.510086 30.426405 13.780954
      vertex 88.504684 30.426405 13.653746
    endloop
  endfacet
  facet normal 0.985619 0.000000 -0.168981
    outer loop
      vertex 88.461693 30.426405 13.402987
      vertex 88.504684 32.426407 13.653746
      vertex 88.504684 30.426405 13.653746
    endloop
  endfacet
  facet normal 0.985619 0.000000 -0.168981
    outer loop
      vertex 88.461693 32.426407 13.402987
      vertex 88.504684 32.426407 13.653746
      vertex 88.461693 30.426405 13.402987
    endloop
  endfacet
  facet normal 0.942870 0.000000 -0.333161
    outer loop
      vertex 88.376930 30.426405 13.163103
      vertex 88.461693 32.426407 13.402987
      vertex 88.461693 30.426405 13.402987
    endloop
  endfacet
  facet normal 0.942870 0.000000 -0.333161
    outer loop
      vertex 88.376930 32.426407 13.163103
      vertex 88.461693 32.426407 13.402987
      vertex 88.376930 30.426405 13.163103
    endloop
  endfacet
  facet normal 0.873017 0.000000 -0.487690
    outer loop
      vertex 88.252853 30.426405 12.940992
      vertex 88.376930 32.426407 13.163103
      vertex 88.376930 30.426405 13.163103
    endloop
  endfacet
  facet normal 0.873017 0.000000 -0.487690
    outer loop
      vertex 88.252853 32.426407 12.940992
      vertex 88.376930 32.426407 13.163103
      vertex 88.252853 30.426405 12.940992
    endloop
  endfacet
  facet normal 0.778024 0.000000 -0.628234
    outer loop
      vertex 88.093018 30.426405 12.743047
      vertex 88.252853 32.426407 12.940992
      vertex 88.252853 30.426405 12.940992
    endloop
  endfacet
  facet normal 0.778024 0.000000 -0.628234
    outer loop
      vertex 88.093018 32.426407 12.743047
      vertex 88.252853 32.426407 12.940992
      vertex 88.093018 30.426405 12.743047
    endloop
  endfacet
  facet normal 0.660686 0.000000 -0.750662
    outer loop
      vertex 87.902039 30.426405 12.574959
      vertex 88.093018 32.426407 12.743047
      vertex 88.093018 30.426405 12.743047
    endloop
  endfacet
  facet normal 0.660686 0.000000 -0.750662
    outer loop
      vertex 87.902039 32.426407 12.574959
      vertex 88.093018 32.426407 12.743047
      vertex 87.902039 30.426405 12.574959
    endloop
  endfacet
  facet normal 0.524308 0.000000 -0.851529
    outer loop
      vertex 87.685394 30.426405 12.441566
      vertex 87.902039 32.426407 12.574959
      vertex 87.902039 30.426405 12.574959
    endloop
  endfacet
  facet normal 0.524308 0.000000 -0.851529
    outer loop
      vertex 87.685394 32.426407 12.441566
      vertex 87.902039 32.426407 12.574959
      vertex 87.685394 30.426405 12.441566
    endloop
  endfacet
  facet normal 0.372849 0.000000 -0.927892
    outer loop
      vertex 87.449318 30.426405 12.346704
      vertex 87.685394 32.426407 12.441566
      vertex 87.685394 30.426405 12.441566
    endloop
  endfacet
  facet normal 0.372849 0.000000 -0.927892
    outer loop
      vertex 87.449318 32.426407 12.346704
      vertex 87.685394 32.426407 12.441566
      vertex 87.449318 30.426405 12.346704
    endloop
  endfacet
  facet normal 0.210682 0.000000 -0.977555
    outer loop
      vertex 87.200615 30.426405 12.293104
      vertex 87.449318 32.426407 12.346704
      vertex 87.449318 30.426405 12.346704
    endloop
  endfacet
  facet normal 0.210682 0.000000 -0.977555
    outer loop
      vertex 87.200615 32.426407 12.293104
      vertex 87.449318 32.426407 12.346704
      vertex 87.200615 30.426405 12.293104
    endloop
  endfacet
  facet normal 0.042440 0.000000 -0.999099
    outer loop
      vertex 86.946426 30.426405 12.282307
      vertex 87.200615 32.426407 12.293104
      vertex 87.200615 30.426405 12.293104
    endloop
  endfacet
  facet normal 0.042440 0.000000 -0.999099
    outer loop
      vertex 86.946426 32.426407 12.282307
      vertex 87.200615 32.426407 12.293104
      vertex 86.946426 30.426405 12.282307
    endloop
  endfacet
  facet normal -0.127013 0.000000 -0.991901
    outer loop
      vertex 86.694069 30.426405 12.314621
      vertex 86.946426 32.426407 12.282307
      vertex 86.946426 30.426405 12.282307
    endloop
  endfacet
  facet normal -0.127013 -0.000000 -0.991901
    outer loop
      vertex 86.694069 32.426407 12.314621
      vertex 86.946426 32.426407 12.282307
      vertex 86.694069 30.426405 12.314621
    endloop
  endfacet
  facet normal -0.292820 0.000000 -0.956168
    outer loop
      vertex 86.450798 30.426405 12.389121
      vertex 86.694069 32.426407 12.314621
      vertex 86.694069 30.426405 12.314621
    endloop
  endfacet
  facet normal -0.292820 -0.000000 -0.956168
    outer loop
      vertex 86.450798 32.426407 12.389121
      vertex 86.694069 32.426407 12.314621
      vertex 86.450798 30.426405 12.389121
    endloop
  endfacet
  facet normal -0.450207 0.000000 -0.892924
    outer loop
      vertex 86.223625 30.426405 12.503660
      vertex 86.450798 32.426407 12.389121
      vertex 86.450798 30.426405 12.389121
    endloop
  endfacet
  facet normal -0.450207 -0.000000 -0.892924
    outer loop
      vertex 86.223625 32.426407 12.503660
      vertex 86.450798 32.426407 12.389121
      vertex 86.223625 30.426405 12.503660
    endloop
  endfacet
  facet normal -0.594634 0.000000 -0.803996
    outer loop
      vertex 86.019073 30.426405 12.654946
      vertex 86.223625 32.426407 12.503660
      vertex 86.223625 30.426405 12.503660
    endloop
  endfacet
  facet normal -0.594634 -0.000000 -0.803996
    outer loop
      vertex 86.019073 32.426407 12.654946
      vertex 86.223625 32.426407 12.503660
      vertex 86.019073 30.426405 12.654946
    endloop
  endfacet
  facet normal -0.721956 0.000000 -0.691939
    outer loop
      vertex 85.843033 30.426405 12.838624
      vertex 86.019073 32.426407 12.654946
      vertex 86.019073 30.426405 12.654946
    endloop
  endfacet
  facet normal -0.721956 -0.000000 -0.691939
    outer loop
      vertex 85.843033 32.426407 12.838624
      vertex 86.019073 32.426407 12.654946
      vertex 85.843033 30.426405 12.838624
    endloop
  endfacet
  facet normal -0.828503 0.000000 -0.559985
    outer loop
      vertex 85.700562 30.426405 13.049412
      vertex 85.843033 32.426407 12.838624
      vertex 85.843033 30.426405 12.838624
    endloop
  endfacet
  facet normal -0.828503 -0.000000 -0.559985
    outer loop
      vertex 85.700562 32.426407 13.049412
      vertex 85.843033 32.426407 12.838624
      vertex 85.700562 30.426405 13.049412
    endloop
  endfacet
  facet normal -0.911237 0.000000 -0.411883
    outer loop
      vertex 85.595772 30.426405 13.281245
      vertex 85.700562 32.426407 13.049412
      vertex 85.700562 30.426405 13.049412
    endloop
  endfacet
  facet normal -0.911237 -0.000000 -0.411883
    outer loop
      vertex 85.595772 32.426407 13.281245
      vertex 85.700562 32.426407 13.049412
      vertex 85.595772 30.426405 13.281245
    endloop
  endfacet
  facet normal -0.967738 0.000000 -0.251959
    outer loop
      vertex 85.531670 30.426405 13.527452
      vertex 85.595772 32.426407 13.281245
      vertex 85.595772 30.426405 13.281245
    endloop
  endfacet
  facet normal -0.967738 -0.000000 -0.251959
    outer loop
      vertex 85.531670 32.426407 13.527452
      vertex 85.595772 32.426407 13.281245
      vertex 85.531670 30.426405 13.527452
    endloop
  endfacet
  facet normal -0.996398 0.000000 -0.084805
    outer loop
      vertex 85.510094 30.426405 13.780954
      vertex 85.531670 32.426407 13.527452
      vertex 85.531670 30.426405 13.527452
    endloop
  endfacet
  facet normal -0.996398 -0.000000 -0.084805
    outer loop
      vertex 85.510094 32.426407 13.780954
      vertex 85.531670 32.426407 13.527452
      vertex 85.510094 30.426405 13.780954
    endloop
  endfacet
  facet normal -0.996398 0.000000 0.084805
    outer loop
      vertex 85.531670 30.426405 14.034455
      vertex 85.510094 32.426407 13.780954
      vertex 85.510094 30.426405 13.780954
    endloop
  endfacet
  facet normal -0.996398 0.000000 0.084805
    outer loop
      vertex 85.531670 32.426407 14.034455
      vertex 85.510094 32.426407 13.780954
      vertex 85.531670 30.426405 14.034455
    endloop
  endfacet
  facet normal -0.967738 0.000000 0.251958
    outer loop
      vertex 85.595772 30.426405 14.280663
      vertex 85.531670 32.426407 14.034455
      vertex 85.531670 30.426405 14.034455
    endloop
  endfacet
  facet normal -0.967738 0.000000 0.251958
    outer loop
      vertex 85.595772 32.426407 14.280663
      vertex 85.531670 32.426407 14.034455
      vertex 85.595772 30.426405 14.280663
    endloop
  endfacet
  facet normal -0.911237 0.000000 0.411883
    outer loop
      vertex 85.700562 30.426405 14.512497
      vertex 85.595772 32.426407 14.280663
      vertex 85.595772 30.426405 14.280663
    endloop
  endfacet
  facet normal -0.911237 0.000000 0.411883
    outer loop
      vertex 85.700562 32.426407 14.512497
      vertex 85.595772 32.426407 14.280663
      vertex 85.700562 30.426405 14.512497
    endloop
  endfacet
  facet normal -0.828502 0.000000 0.559986
    outer loop
      vertex 85.843033 30.426405 14.723284
      vertex 85.700562 32.426407 14.512497
      vertex 85.700562 30.426405 14.512497
    endloop
  endfacet
  facet normal -0.828502 0.000000 0.559986
    outer loop
      vertex 85.843033 32.426407 14.723284
      vertex 85.700562 32.426407 14.512497
      vertex 85.843033 30.426405 14.723284
    endloop
  endfacet
  facet normal -0.721960 0.000000 0.691935
    outer loop
      vertex 86.019073 30.426405 14.906963
      vertex 85.843033 32.426407 14.723284
      vertex 85.843033 30.426405 14.723284
    endloop
  endfacet
  facet normal -0.721960 0.000000 0.691935
    outer loop
      vertex 86.019073 32.426407 14.906963
      vertex 85.843033 32.426407 14.723284
      vertex 86.019073 30.426405 14.906963
    endloop
  endfacet
  facet normal -0.594632 0.000000 0.803998
    outer loop
      vertex 86.223625 30.426405 15.058249
      vertex 86.019073 32.426407 14.906963
      vertex 86.019073 30.426405 14.906963
    endloop
  endfacet
  facet normal -0.594632 0.000000 0.803998
    outer loop
      vertex 86.223625 32.426407 15.058249
      vertex 86.019073 32.426407 14.906963
      vertex 86.223625 30.426405 15.058249
    endloop
  endfacet
  facet normal -0.450207 0.000000 0.892924
    outer loop
      vertex 86.450798 30.426405 15.172788
      vertex 86.223625 32.426407 15.058249
      vertex 86.223625 30.426405 15.058249
    endloop
  endfacet
  facet normal -0.450207 0.000000 0.892924
    outer loop
      vertex 86.450798 32.426407 15.172788
      vertex 86.223625 32.426407 15.058249
      vertex 86.450798 30.426405 15.172788
    endloop
  endfacet
  facet normal -0.292817 0.000000 0.956169
    outer loop
      vertex 86.694069 30.426405 15.247287
      vertex 86.450798 32.426407 15.172788
      vertex 86.450798 30.426405 15.172788
    endloop
  endfacet
  facet normal -0.292817 0.000000 0.956169
    outer loop
      vertex 86.694069 32.426407 15.247287
      vertex 86.450798 32.426407 15.172788
      vertex 86.694069 30.426405 15.247287
    endloop
  endfacet
  facet normal -0.127016 0.000000 0.991901
    outer loop
      vertex 86.946426 30.426405 15.279602
      vertex 86.694069 32.426407 15.247287
      vertex 86.694069 30.426405 15.247287
    endloop
  endfacet
  facet normal -0.127016 0.000000 0.991901
    outer loop
      vertex 86.946426 32.426407 15.279602
      vertex 86.694069 32.426407 15.247287
      vertex 86.946426 30.426405 15.279602
    endloop
  endfacet
  facet normal 0.042440 0.000000 0.999099
    outer loop
      vertex 87.200615 30.426405 15.268805
      vertex 86.946426 32.426407 15.279602
      vertex 86.946426 30.426405 15.279602
    endloop
  endfacet
  facet normal 0.042440 0.000000 0.999099
    outer loop
      vertex 87.200615 32.426407 15.268805
      vertex 86.946426 32.426407 15.279602
      vertex 87.200615 30.426405 15.268805
    endloop
  endfacet
  facet normal 0.210678 0.000000 0.977556
    outer loop
      vertex 87.449318 30.426405 15.215205
      vertex 87.200615 32.426407 15.268805
      vertex 87.200615 30.426405 15.268805
    endloop
  endfacet
  facet normal 0.210678 0.000000 0.977556
    outer loop
      vertex 87.449318 32.426407 15.215205
      vertex 87.200615 32.426407 15.268805
      vertex 87.449318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.372852 0.000000 0.927891
    outer loop
      vertex 87.685394 30.426405 15.120343
      vertex 87.449318 32.426407 15.215205
      vertex 87.449318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.372852 0.000000 0.927891
    outer loop
      vertex 87.685394 32.426407 15.120343
      vertex 87.449318 32.426407 15.215205
      vertex 87.685394 30.426405 15.120343
    endloop
  endfacet
  facet normal 0.524308 0.000000 0.851529
    outer loop
      vertex 87.902039 30.426405 14.986950
      vertex 87.685394 32.426407 15.120343
      vertex 87.685394 30.426405 15.120343
    endloop
  endfacet
  facet normal 0.524308 0.000000 0.851529
    outer loop
      vertex 87.902039 32.426407 14.986950
      vertex 87.685394 32.426407 15.120343
      vertex 87.902039 30.426405 14.986950
    endloop
  endfacet
  facet normal 0.660684 0.000000 0.750664
    outer loop
      vertex 88.093018 30.426405 14.818863
      vertex 87.902039 32.426407 14.986950
      vertex 87.902039 30.426405 14.986950
    endloop
  endfacet
  facet normal 0.660684 0.000000 0.750664
    outer loop
      vertex 88.093018 32.426407 14.818863
      vertex 87.902039 32.426407 14.986950
      vertex 88.093018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.778024 0.000000 0.628234
    outer loop
      vertex 88.252853 30.426405 14.620917
      vertex 88.093018 32.426407 14.818863
      vertex 88.093018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.778024 0.000000 0.628234
    outer loop
      vertex 88.252853 32.426407 14.620917
      vertex 88.093018 32.426407 14.818863
      vertex 88.252853 30.426405 14.620917
    endloop
  endfacet
  facet normal 0.873018 0.000000 0.487688
    outer loop
      vertex 88.376930 30.426405 14.398806
      vertex 88.252853 32.426407 14.620917
      vertex 88.252853 30.426405 14.620917
    endloop
  endfacet
  facet normal 0.873018 0.000000 0.487688
    outer loop
      vertex 88.376930 32.426407 14.398806
      vertex 88.252853 32.426407 14.620917
      vertex 88.376930 30.426405 14.398806
    endloop
  endfacet
  facet normal 0.942870 0.000000 0.333161
    outer loop
      vertex 88.461693 30.426405 14.158921
      vertex 88.376930 32.426407 14.398806
      vertex 88.376930 30.426405 14.398806
    endloop
  endfacet
  facet normal 0.942870 0.000000 0.333161
    outer loop
      vertex 88.461693 32.426407 14.158921
      vertex 88.376930 32.426407 14.398806
      vertex 88.461693 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.985619 0.000000 0.168981
    outer loop
      vertex 88.504684 30.426405 13.908163
      vertex 88.461693 32.426407 14.158921
      vertex 88.461693 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.985619 0.000000 0.168981
    outer loop
      vertex 88.504684 32.426407 13.908163
      vertex 88.461693 32.426407 14.158921
      vertex 88.504684 30.426405 13.908163
    endloop
  endfacet
  facet normal 0.999100 0.000000 0.042424
    outer loop
      vertex 88.510086 32.426407 13.780954
      vertex 88.504684 32.426407 13.908163
      vertex 88.504684 30.426405 13.908163
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 88.510086 30.426405 13.780954
      vertex 88.504684 30.426405 13.908163
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 88.504684 30.426405 13.653746
      vertex 88.510086 30.426405 13.780954
      vertex 87.010086 30.426405 13.780954
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 88.252853 30.426405 12.940992
      vertex 88.376930 30.426405 13.163103
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 88.461693 30.426405 13.402987
      vertex 87.010086 30.426405 13.780954
      vertex 88.376930 30.426405 13.163103
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 88.504684 30.426405 13.653746
      vertex 87.010086 30.426405 13.780954
      vertex 88.461693 30.426405 13.402987
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 87.685394 30.426405 12.441566
      vertex 87.902039 30.426405 12.574959
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 88.093018 30.426405 12.743047
      vertex 87.010086 30.426405 13.780954
      vertex 87.902039 30.426405 12.574959
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 88.252853 30.426405 12.940992
      vertex 87.010086 30.426405 13.780954
      vertex 88.093018 30.426405 12.743047
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 86.946426 30.426405 12.282307
      vertex 87.200615 30.426405 12.293104
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 87.449318 30.426405 12.346704
      vertex 87.010086 30.426405 13.780954
      vertex 87.200615 30.426405 12.293104
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 87.685394 30.426405 12.441566
      vertex 87.010086 30.426405 13.780954
      vertex 87.449318 30.426405 12.346704
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 86.223625 30.426405 12.503660
      vertex 86.450798 30.426405 12.389121
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.694069 30.426405 12.314621
      vertex 87.010086 30.426405 13.780954
      vertex 86.450798 30.426405 12.389121
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.946426 30.426405 12.282307
      vertex 87.010086 30.426405 13.780954
      vertex 86.694069 30.426405 12.314621
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 85.700562 30.426405 13.049412
      vertex 85.843033 30.426405 12.838624
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.019073 30.426405 12.654946
      vertex 87.010086 30.426405 13.780954
      vertex 85.843033 30.426405 12.838624
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.223625 30.426405 12.503660
      vertex 87.010086 30.426405 13.780954
      vertex 86.019073 30.426405 12.654946
    endloop
  endfacet
  facet normal -0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 85.510094 30.426405 13.780954
      vertex 85.531670 30.426405 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.595772 30.426405 13.281245
      vertex 87.010086 30.426405 13.780954
      vertex 85.531670 30.426405 13.527452
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.700562 30.426405 13.049412
      vertex 87.010086 30.426405 13.780954
      vertex 85.595772 30.426405 13.281245
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 85.700562 30.426405 14.512497
      vertex 85.595772 30.426405 14.280663
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.531670 30.426405 14.034455
      vertex 87.010086 30.426405 13.780954
      vertex 85.595772 30.426405 14.280663
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.510094 30.426405 13.780954
      vertex 87.010086 30.426405 13.780954
      vertex 85.531670 30.426405 14.034455
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 86.223625 30.426405 15.058249
      vertex 86.019073 30.426405 14.906963
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.843033 30.426405 14.723284
      vertex 87.010086 30.426405 13.780954
      vertex 86.019073 30.426405 14.906963
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 85.700562 30.426405 14.512497
      vertex 87.010086 30.426405 13.780954
      vertex 85.843033 30.426405 14.723284
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 86.946426 30.426405 15.279602
      vertex 86.694069 30.426405 15.247287
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.450798 30.426405 15.172788
      vertex 87.010086 30.426405 13.780954
      vertex 86.694069 30.426405 15.247287
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.223625 30.426405 15.058249
      vertex 87.010086 30.426405 13.780954
      vertex 86.450798 30.426405 15.172788
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 87.685394 30.426405 15.120343
      vertex 87.449318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 87.200615 30.426405 15.268805
      vertex 87.010086 30.426405 13.780954
      vertex 87.449318 30.426405 15.215205
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 86.946426 30.426405 15.279602
      vertex 87.010086 30.426405 13.780954
      vertex 87.200615 30.426405 15.268805
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 88.252853 30.426405 14.620917
      vertex 88.093018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 87.902039 30.426405 14.986950
      vertex 87.010086 30.426405 13.780954
      vertex 88.093018 30.426405 14.818863
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 87.685394 30.426405 15.120343
      vertex 87.010086 30.426405 13.780954
      vertex 87.902039 30.426405 14.986950
    endloop
  endfacet
  facet normal 0.000000 -1.000000 0.000000
    outer loop
      vertex 87.010086 30.426405 13.780954
      vertex 88.504684 30.426405 13.908163
      vertex 88.461693 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 88.376930 30.426405 14.398806
      vertex 87.010086 30.426405 13.780954
      vertex 88.461693 30.426405 14.158921
    endloop
  endfacet
  facet normal 0.000000 -1.000000 -0.000000
    outer loop
      vertex 88.252853 30.426405 14.620917
      vertex 87.010086 30.426405 13.780954
      vertex 88.376930 30.426405 14.398806
    endloop
  endfacet
endsolid Mesh
```
