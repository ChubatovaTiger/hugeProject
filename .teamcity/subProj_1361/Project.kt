package subProj_1361

import subProj_1361.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1361")
    name = "subProj 1361"

    buildType(subProj_bt_1361_4)
    buildType(subProj_bt_1361_3)
    buildType(subProj_bt_1361_2)
    buildType(subProj_bt_1361_1)
    buildType(subProj_bt_1361_0)
    buildType(subProj_bt_1361_5)
})
