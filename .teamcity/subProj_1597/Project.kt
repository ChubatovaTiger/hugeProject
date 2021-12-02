package subProj_1597

import subProj_1597.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1597")
    name = "subProj 1597"

    buildType(subProj_bt_1597_5)
    buildType(subProj_bt_1597_4)
    buildType(subProj_bt_1597_1)
    buildType(subProj_bt_1597_0)
    buildType(subProj_bt_1597_3)
    buildType(subProj_bt_1597_2)
})
