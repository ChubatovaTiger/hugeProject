package subProj_770

import subProj_770.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_770")
    name = "subProj 770"

    buildType(subProj_bt_770_1)
    buildType(subProj_bt_770_0)
    buildType(subProj_bt_770_3)
    buildType(subProj_bt_770_2)
    buildType(subProj_bt_770_5)
    buildType(subProj_bt_770_4)
})
