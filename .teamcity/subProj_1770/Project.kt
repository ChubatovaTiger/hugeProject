package subProj_1770

import subProj_1770.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1770")
    name = "subProj 1770"

    buildType(subProj_bt_1770_0)
    buildType(subProj_bt_1770_1)
    buildType(subProj_bt_1770_2)
    buildType(subProj_bt_1770_3)
    buildType(subProj_bt_1770_4)
    buildType(subProj_bt_1770_5)
})
