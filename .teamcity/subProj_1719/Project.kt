package subProj_1719

import subProj_1719.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1719")
    name = "subProj 1719"

    buildType(subProj_bt_1719_4)
    buildType(subProj_bt_1719_5)
    buildType(subProj_bt_1719_2)
    buildType(subProj_bt_1719_3)
    buildType(subProj_bt_1719_0)
    buildType(subProj_bt_1719_1)
})
