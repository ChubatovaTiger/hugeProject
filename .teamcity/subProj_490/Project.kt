package subProj_490

import subProj_490.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_490")
    name = "subProj 490"

    buildType(subProj_bt_490_0)
    buildType(subProj_bt_490_5)
    buildType(subProj_bt_490_1)
    buildType(subProj_bt_490_2)
    buildType(subProj_bt_490_3)
    buildType(subProj_bt_490_4)
})
