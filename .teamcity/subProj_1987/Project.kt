package subProj_1987

import subProj_1987.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1987")
    name = "subProj 1987"

    buildType(subProj_bt_1987_0)
    buildType(subProj_bt_1987_2)
    buildType(subProj_bt_1987_1)
    buildType(subProj_bt_1987_4)
    buildType(subProj_bt_1987_3)
    buildType(subProj_bt_1987_5)
})
