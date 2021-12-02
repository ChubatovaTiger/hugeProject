package subProj_1715

import subProj_1715.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1715")
    name = "subProj 1715"

    buildType(subProj_bt_1715_4)
    buildType(subProj_bt_1715_5)
    buildType(subProj_bt_1715_2)
    buildType(subProj_bt_1715_3)
    buildType(subProj_bt_1715_0)
    buildType(subProj_bt_1715_1)
})
