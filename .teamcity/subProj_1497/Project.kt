package subProj_1497

import subProj_1497.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1497")
    name = "subProj 1497"

    buildType(subProj_bt_1497_0)
    buildType(subProj_bt_1497_5)
    buildType(subProj_bt_1497_4)
    buildType(subProj_bt_1497_3)
    buildType(subProj_bt_1497_2)
    buildType(subProj_bt_1497_1)
})
