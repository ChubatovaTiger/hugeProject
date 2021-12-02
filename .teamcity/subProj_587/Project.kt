package subProj_587

import subProj_587.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_587")
    name = "subProj 587"

    buildType(subProj_bt_587_2)
    buildType(subProj_bt_587_3)
    buildType(subProj_bt_587_0)
    buildType(subProj_bt_587_1)
    buildType(subProj_bt_587_4)
    buildType(subProj_bt_587_5)
})
