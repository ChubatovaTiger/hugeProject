package subProj_497

import subProj_497.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_497")
    name = "subProj 497"

    buildType(subProj_bt_497_2)
    buildType(subProj_bt_497_3)
    buildType(subProj_bt_497_4)
    buildType(subProj_bt_497_5)
    buildType(subProj_bt_497_0)
    buildType(subProj_bt_497_1)
})
