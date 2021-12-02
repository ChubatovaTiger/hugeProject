package subProj_1587

import subProj_1587.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1587")
    name = "subProj 1587"

    buildType(subProj_bt_1587_4)
    buildType(subProj_bt_1587_3)
    buildType(subProj_bt_1587_5)
    buildType(subProj_bt_1587_0)
    buildType(subProj_bt_1587_2)
    buildType(subProj_bt_1587_1)
})
