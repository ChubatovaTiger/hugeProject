package subProj_1323

import subProj_1323.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1323")
    name = "subProj 1323"

    buildType(subProj_bt_1323_5)
    buildType(subProj_bt_1323_3)
    buildType(subProj_bt_1323_4)
    buildType(subProj_bt_1323_1)
    buildType(subProj_bt_1323_2)
    buildType(subProj_bt_1323_0)
})
