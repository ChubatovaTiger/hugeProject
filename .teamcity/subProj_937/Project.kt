package subProj_937

import subProj_937.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_937")
    name = "subProj 937"

    buildType(subProj_bt_937_0)
    buildType(subProj_bt_937_1)
    buildType(subProj_bt_937_2)
    buildType(subProj_bt_937_3)
    buildType(subProj_bt_937_4)
    buildType(subProj_bt_937_5)
})
