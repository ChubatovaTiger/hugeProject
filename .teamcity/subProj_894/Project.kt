package subProj_894

import subProj_894.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_894")
    name = "subProj 894"

    buildType(subProj_bt_894_0)
    buildType(subProj_bt_894_5)
    buildType(subProj_bt_894_1)
    buildType(subProj_bt_894_2)
    buildType(subProj_bt_894_3)
    buildType(subProj_bt_894_4)
})
