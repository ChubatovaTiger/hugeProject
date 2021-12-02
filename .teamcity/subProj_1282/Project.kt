package subProj_1282

import subProj_1282.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1282")
    name = "subProj 1282"

    buildType(subProj_bt_1282_1)
    buildType(subProj_bt_1282_2)
    buildType(subProj_bt_1282_0)
    buildType(subProj_bt_1282_5)
    buildType(subProj_bt_1282_3)
    buildType(subProj_bt_1282_4)
})
