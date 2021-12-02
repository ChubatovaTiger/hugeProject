package subProj_485

import subProj_485.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_485")
    name = "subProj 485"

    buildType(subProj_bt_485_3)
    buildType(subProj_bt_485_4)
    buildType(subProj_bt_485_5)
    buildType(subProj_bt_485_0)
    buildType(subProj_bt_485_1)
    buildType(subProj_bt_485_2)
})
