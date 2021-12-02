package subProj_1219

import subProj_1219.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1219")
    name = "subProj 1219"

    buildType(subProj_bt_1219_5)
    buildType(subProj_bt_1219_4)
    buildType(subProj_bt_1219_3)
    buildType(subProj_bt_1219_2)
    buildType(subProj_bt_1219_1)
    buildType(subProj_bt_1219_0)
})
