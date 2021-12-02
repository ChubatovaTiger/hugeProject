package subProj_1738

import subProj_1738.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1738")
    name = "subProj 1738"

    buildType(subProj_bt_1738_5)
    buildType(subProj_bt_1738_4)
    buildType(subProj_bt_1738_3)
    buildType(subProj_bt_1738_2)
    buildType(subProj_bt_1738_1)
    buildType(subProj_bt_1738_0)
})
