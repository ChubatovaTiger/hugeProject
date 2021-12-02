package subProj_1689

import subProj_1689.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1689")
    name = "subProj 1689"

    buildType(subProj_bt_1689_5)
    buildType(subProj_bt_1689_4)
    buildType(subProj_bt_1689_3)
    buildType(subProj_bt_1689_2)
    buildType(subProj_bt_1689_1)
    buildType(subProj_bt_1689_0)
})
