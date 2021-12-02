package subProj_1240

import subProj_1240.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1240")
    name = "subProj 1240"

    buildType(subProj_bt_1240_5)
    buildType(subProj_bt_1240_0)
    buildType(subProj_bt_1240_1)
    buildType(subProj_bt_1240_2)
    buildType(subProj_bt_1240_3)
    buildType(subProj_bt_1240_4)
})
