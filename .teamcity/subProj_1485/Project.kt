package subProj_1485

import subProj_1485.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1485")
    name = "subProj 1485"

    buildType(subProj_bt_1485_0)
    buildType(subProj_bt_1485_1)
    buildType(subProj_bt_1485_4)
    buildType(subProj_bt_1485_5)
    buildType(subProj_bt_1485_2)
    buildType(subProj_bt_1485_3)
})
