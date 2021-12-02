package subProj_361

import subProj_361.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_361")
    name = "subProj 361"

    buildType(subProj_bt_361_2)
    buildType(subProj_bt_361_3)
    buildType(subProj_bt_361_4)
    buildType(subProj_bt_361_5)
    buildType(subProj_bt_361_0)
    buildType(subProj_bt_361_1)
})
