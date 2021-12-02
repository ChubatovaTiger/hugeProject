package subProj_1599

import subProj_1599.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1599")
    name = "subProj 1599"

    buildType(subProj_bt_1599_3)
    buildType(subProj_bt_1599_2)
    buildType(subProj_bt_1599_5)
    buildType(subProj_bt_1599_4)
    buildType(subProj_bt_1599_1)
    buildType(subProj_bt_1599_0)
})
