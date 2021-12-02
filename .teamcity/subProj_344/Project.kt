package subProj_344

import subProj_344.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_344")
    name = "subProj 344"

    buildType(subProj_bt_344_5)
    buildType(subProj_bt_344_1)
    buildType(subProj_bt_344_2)
    buildType(subProj_bt_344_3)
    buildType(subProj_bt_344_4)
    buildType(subProj_bt_344_0)
})
