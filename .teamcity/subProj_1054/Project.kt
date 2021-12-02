package subProj_1054

import subProj_1054.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1054")
    name = "subProj 1054"

    buildType(subProj_bt_1054_5)
    buildType(subProj_bt_1054_4)
    buildType(subProj_bt_1054_1)
    buildType(subProj_bt_1054_0)
    buildType(subProj_bt_1054_3)
    buildType(subProj_bt_1054_2)
})
