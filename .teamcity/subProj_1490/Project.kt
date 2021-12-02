package subProj_1490

import subProj_1490.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1490")
    name = "subProj 1490"

    buildType(subProj_bt_1490_5)
    buildType(subProj_bt_1490_4)
    buildType(subProj_bt_1490_3)
    buildType(subProj_bt_1490_2)
    buildType(subProj_bt_1490_1)
    buildType(subProj_bt_1490_0)
})
