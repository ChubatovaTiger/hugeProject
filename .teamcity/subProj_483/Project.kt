package subProj_483

import subProj_483.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_483")
    name = "subProj 483"

    buildType(subProj_bt_483_5)
    buildType(subProj_bt_483_1)
    buildType(subProj_bt_483_2)
    buildType(subProj_bt_483_3)
    buildType(subProj_bt_483_4)
    buildType(subProj_bt_483_0)
})
