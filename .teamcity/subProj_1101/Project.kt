package subProj_1101

import subProj_1101.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1101")
    name = "subProj 1101"

    buildType(subProj_bt_1101_1)
    buildType(subProj_bt_1101_2)
    buildType(subProj_bt_1101_3)
    buildType(subProj_bt_1101_4)
    buildType(subProj_bt_1101_5)
    buildType(subProj_bt_1101_0)
})
