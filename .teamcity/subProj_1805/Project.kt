package subProj_1805

import subProj_1805.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1805")
    name = "subProj 1805"

    buildType(subProj_bt_1805_1)
    buildType(subProj_bt_1805_0)
    buildType(subProj_bt_1805_5)
    buildType(subProj_bt_1805_4)
    buildType(subProj_bt_1805_3)
    buildType(subProj_bt_1805_2)
})
