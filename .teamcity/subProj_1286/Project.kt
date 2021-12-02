package subProj_1286

import subProj_1286.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1286")
    name = "subProj 1286"

    buildType(subProj_bt_1286_5)
    buildType(subProj_bt_1286_3)
    buildType(subProj_bt_1286_4)
    buildType(subProj_bt_1286_1)
    buildType(subProj_bt_1286_2)
    buildType(subProj_bt_1286_0)
})
