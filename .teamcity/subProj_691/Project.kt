package subProj_691

import subProj_691.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_691")
    name = "subProj 691"

    buildType(subProj_bt_691_0)
    buildType(subProj_bt_691_1)
    buildType(subProj_bt_691_2)
    buildType(subProj_bt_691_3)
    buildType(subProj_bt_691_4)
    buildType(subProj_bt_691_5)
})
