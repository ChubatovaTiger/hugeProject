package subProj_639

import subProj_639.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_639")
    name = "subProj 639"

    buildType(subProj_bt_639_4)
    buildType(subProj_bt_639_5)
    buildType(subProj_bt_639_2)
    buildType(subProj_bt_639_3)
    buildType(subProj_bt_639_0)
    buildType(subProj_bt_639_1)
})
