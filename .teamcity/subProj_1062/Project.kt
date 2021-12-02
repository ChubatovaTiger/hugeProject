package subProj_1062

import subProj_1062.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1062")
    name = "subProj 1062"

    buildType(subProj_bt_1062_4)
    buildType(subProj_bt_1062_3)
    buildType(subProj_bt_1062_5)
    buildType(subProj_bt_1062_0)
    buildType(subProj_bt_1062_2)
    buildType(subProj_bt_1062_1)
})
