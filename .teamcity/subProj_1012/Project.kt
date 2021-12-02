package subProj_1012

import subProj_1012.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1012")
    name = "subProj 1012"

    buildType(subProj_bt_1012_5)
    buildType(subProj_bt_1012_4)
    buildType(subProj_bt_1012_3)
    buildType(subProj_bt_1012_2)
    buildType(subProj_bt_1012_1)
    buildType(subProj_bt_1012_0)
})
