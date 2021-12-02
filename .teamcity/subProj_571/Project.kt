package subProj_571

import subProj_571.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_571")
    name = "subProj 571"

    buildType(subProj_bt_571_5)
    buildType(subProj_bt_571_0)
    buildType(subProj_bt_571_2)
    buildType(subProj_bt_571_1)
    buildType(subProj_bt_571_4)
    buildType(subProj_bt_571_3)
})
