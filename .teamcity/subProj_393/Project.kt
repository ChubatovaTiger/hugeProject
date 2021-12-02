package subProj_393

import subProj_393.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_393")
    name = "subProj 393"

    buildType(subProj_bt_393_5)
    buildType(subProj_bt_393_3)
    buildType(subProj_bt_393_4)
    buildType(subProj_bt_393_1)
    buildType(subProj_bt_393_2)
    buildType(subProj_bt_393_0)
})
