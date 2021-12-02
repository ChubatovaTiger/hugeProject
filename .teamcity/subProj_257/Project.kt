package subProj_257

import subProj_257.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_257")
    name = "subProj 257"

    buildType(subProj_bt_257_4)
    buildType(subProj_bt_257_5)
    buildType(subProj_bt_257_2)
    buildType(subProj_bt_257_3)
    buildType(subProj_bt_257_0)
    buildType(subProj_bt_257_1)
})
