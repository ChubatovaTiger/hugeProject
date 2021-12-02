package subProj_962

import subProj_962.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_962")
    name = "subProj 962"

    buildType(subProj_bt_962_0)
    buildType(subProj_bt_962_2)
    buildType(subProj_bt_962_1)
    buildType(subProj_bt_962_4)
    buildType(subProj_bt_962_3)
    buildType(subProj_bt_962_5)
})
