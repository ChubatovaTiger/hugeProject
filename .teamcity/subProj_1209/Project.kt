package subProj_1209

import subProj_1209.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1209")
    name = "subProj 1209"

    buildType(subProj_bt_1209_5)
    buildType(subProj_bt_1209_4)
    buildType(subProj_bt_1209_3)
    buildType(subProj_bt_1209_2)
    buildType(subProj_bt_1209_1)
    buildType(subProj_bt_1209_0)
})
