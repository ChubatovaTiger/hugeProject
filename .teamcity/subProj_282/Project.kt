package subProj_282

import subProj_282.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_282")
    name = "subProj 282"

    buildType(subProj_bt_282_5)
    buildType(subProj_bt_282_4)
    buildType(subProj_bt_282_3)
    buildType(subProj_bt_282_2)
    buildType(subProj_bt_282_1)
    buildType(subProj_bt_282_0)
})
