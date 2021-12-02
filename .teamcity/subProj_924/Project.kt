package subProj_924

import subProj_924.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_924")
    name = "subProj 924"

    buildType(subProj_bt_924_0)
    buildType(subProj_bt_924_5)
    buildType(subProj_bt_924_4)
    buildType(subProj_bt_924_3)
    buildType(subProj_bt_924_2)
    buildType(subProj_bt_924_1)
})
