package subProj_926

import subProj_926.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_926")
    name = "subProj 926"

    buildType(subProj_bt_926_5)
    buildType(subProj_bt_926_4)
    buildType(subProj_bt_926_3)
    buildType(subProj_bt_926_2)
    buildType(subProj_bt_926_1)
    buildType(subProj_bt_926_0)
})
