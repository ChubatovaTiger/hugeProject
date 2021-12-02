package subProj_987

import subProj_987.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_987")
    name = "subProj 987"

    buildType(subProj_bt_987_4)
    buildType(subProj_bt_987_5)
    buildType(subProj_bt_987_2)
    buildType(subProj_bt_987_3)
    buildType(subProj_bt_987_0)
    buildType(subProj_bt_987_1)
})
