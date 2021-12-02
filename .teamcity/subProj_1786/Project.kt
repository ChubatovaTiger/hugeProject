package subProj_1786

import subProj_1786.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1786")
    name = "subProj 1786"

    buildType(subProj_bt_1786_1)
    buildType(subProj_bt_1786_0)
    buildType(subProj_bt_1786_3)
    buildType(subProj_bt_1786_2)
    buildType(subProj_bt_1786_5)
    buildType(subProj_bt_1786_4)
})
