package subProj_715

import subProj_715.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_715")
    name = "subProj 715"

    buildType(subProj_bt_715_4)
    buildType(subProj_bt_715_3)
    buildType(subProj_bt_715_2)
    buildType(subProj_bt_715_1)
    buildType(subProj_bt_715_5)
    buildType(subProj_bt_715_0)
})
