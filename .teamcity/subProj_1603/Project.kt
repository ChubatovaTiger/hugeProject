package subProj_1603

import subProj_1603.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1603")
    name = "subProj 1603"

    buildType(subProj_bt_1603_1)
    buildType(subProj_bt_1603_0)
    buildType(subProj_bt_1603_5)
    buildType(subProj_bt_1603_4)
    buildType(subProj_bt_1603_3)
    buildType(subProj_bt_1603_2)
})
