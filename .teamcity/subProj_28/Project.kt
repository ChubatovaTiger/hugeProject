package subProj_28

import subProj_28.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_28")
    name = "subProj 28"

    buildType(subProj_bt_28_4)
    buildType(subProj_bt_28_5)
    buildType(subProj_bt_28_0)
    buildType(subProj_bt_28_1)
    buildType(subProj_bt_28_2)
    buildType(subProj_bt_28_3)
})
