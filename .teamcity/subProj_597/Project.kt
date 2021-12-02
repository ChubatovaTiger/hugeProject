package subProj_597

import subProj_597.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_597")
    name = "subProj 597"

    buildType(subProj_bt_597_3)
    buildType(subProj_bt_597_4)
    buildType(subProj_bt_597_1)
    buildType(subProj_bt_597_2)
    buildType(subProj_bt_597_5)
    buildType(subProj_bt_597_0)
})
