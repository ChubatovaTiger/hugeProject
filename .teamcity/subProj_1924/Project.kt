package subProj_1924

import subProj_1924.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1924")
    name = "subProj 1924"

    buildType(subProj_bt_1924_2)
    buildType(subProj_bt_1924_3)
    buildType(subProj_bt_1924_0)
    buildType(subProj_bt_1924_1)
    buildType(subProj_bt_1924_4)
    buildType(subProj_bt_1924_5)
})
