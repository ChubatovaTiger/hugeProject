package subProj_599

import subProj_599.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_599")
    name = "subProj 599"

    buildType(subProj_bt_599_1)
    buildType(subProj_bt_599_2)
    buildType(subProj_bt_599_0)
    buildType(subProj_bt_599_5)
    buildType(subProj_bt_599_3)
    buildType(subProj_bt_599_4)
})
