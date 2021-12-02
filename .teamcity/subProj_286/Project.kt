package subProj_286

import subProj_286.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_286")
    name = "subProj 286"

    buildType(subProj_bt_286_5)
    buildType(subProj_bt_286_4)
    buildType(subProj_bt_286_3)
    buildType(subProj_bt_286_2)
    buildType(subProj_bt_286_1)
    buildType(subProj_bt_286_0)
})
