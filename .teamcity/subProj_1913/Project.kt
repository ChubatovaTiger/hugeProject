package subProj_1913

import subProj_1913.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1913")
    name = "subProj 1913"

    buildType(subProj_bt_1913_2)
    buildType(subProj_bt_1913_3)
    buildType(subProj_bt_1913_0)
    buildType(subProj_bt_1913_1)
    buildType(subProj_bt_1913_4)
    buildType(subProj_bt_1913_5)
})
